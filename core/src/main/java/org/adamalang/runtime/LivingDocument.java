/* The Adama Programming Language For Board Games!
 *    See http://www.adama-lang.org/ for more information.
 * (c) copyright 2020 Jeffrey M. Barber (http://jeffrey.io) */
package org.adamalang.runtime;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;
import java.util.function.Consumer;
import org.adamalang.runtime.async.AsyncTask;
import org.adamalang.runtime.async.OutstandingFutureTracker;
import org.adamalang.runtime.contracts.DocumentMonitor;
import org.adamalang.runtime.contracts.RxParent;
import org.adamalang.runtime.exceptions.ComputeBlockedException;
import org.adamalang.runtime.exceptions.ErrorCodeException;
import org.adamalang.runtime.exceptions.GoodwillExhaustedException;
import org.adamalang.runtime.exceptions.RetryProgressException;
import org.adamalang.runtime.json.JsonStreamReader;
import org.adamalang.runtime.json.JsonStreamWriter;
import org.adamalang.runtime.json.PrivateView;
import org.adamalang.runtime.logger.Transaction;
import org.adamalang.runtime.logger.TransactionResult;
import org.adamalang.runtime.natives.NtClient;
import org.adamalang.runtime.natives.NtMessageBase;
import org.adamalang.runtime.ops.AssertionStats;
import org.adamalang.runtime.ops.TestReportBuilder;
import org.adamalang.runtime.reactives.RxBoolean;
import org.adamalang.runtime.reactives.RxFastString;
import org.adamalang.runtime.reactives.RxInt32;
import org.adamalang.runtime.reactives.RxInt64;
import org.adamalang.runtime.reactives.RxString;
import com.fasterxml.jackson.databind.node.ObjectNode;

/** The central class for a living document (i.e. a tiny VM) */
public abstract class LivingDocument implements RxParent {
  protected int __assertionFailures = 0;
  protected int __assertionTotal = 0;
  protected final RxInt32 __auto_future_id;
  protected final RxBoolean __blocked;
  private final TreeMap<NtClient, Integer> __clients;
  protected int __code_cost;
  protected final RxInt32 __connection_id;
  protected final RxBoolean __constructed;
  protected final RxString __entropy;
  protected final OutstandingFutureTracker __futures;
  protected int __goodwillBudget;
  protected int __goodwillLimitOfBudget;
  protected final RxInt32 __message_id;
  public final DocumentMonitor __monitor;
  protected final RxInt64 __next_time;
  private String __preemptedStateOnNextComputeBlocked = null;
  protected final ArrayList<AsyncTask> __queue;
  protected Random __random;
  public final LivingDocument __self;
  protected final RxInt32 __seq;
  protected final RxString __state;
  public ObjectNode __STORE; // TO KILL
  protected final RxInt64 __time;
  protected ArrayList<Integer> __trace;
  private final HashMap<NtClient, ArrayList<PrivateView>> __trackedViews = new HashMap<>();

  public LivingDocument(final DocumentMonitor __monitor) {
    this.__monitor = __monitor;
    __random = new Random();
    __self = this;
    __state = new RxFastString(this, "");
    __constructed = new RxBoolean(this, false);
    __blocked = new RxBoolean(this, false);
    __seq = new RxInt32(this, 0);
    __entropy = new RxString(this, Long.toString(__random.nextLong()));
    __auto_future_id = new RxInt32(this, 0);
    __connection_id = new RxInt32(this, 0);
    __message_id = new RxInt32(this, 0);
    __time = new RxInt64(this, 0L);
    __next_time = new RxInt64(this, 0L);
    __queue = new ArrayList<>();
    __futures = new OutstandingFutureTracker(__auto_future_id);
    __code_cost = 0;
    __trace = new ArrayList<>();
    __clients = new TreeMap<>();
    __goodwillBudget = 100000;
    __goodwillLimitOfBudget = 100000;
  }

  /** exposed: assert something as truth */
  protected void __assert_truth(final boolean value, final int startLine, final int startPosition, final int endLine, final int endLinePosition) {
    __assertionTotal++;
    if (!value) {
      __assertionFailures++;
      if (__monitor != null) {
        __monitor.assertFailureAt(startLine, startPosition, endLine, endLinePosition, __assertionTotal, __assertionFailures);
      }
    }
  }

  /** code generated: commit the tree, and push data into the given delta */
  public abstract void __commit(String name, JsonStreamWriter forward, JsonStreamWriter reverse);

  private Transaction __commit_trailer(final String request) {

    final var forward = new JsonStreamWriter();
    final var reverse = new JsonStreamWriter();
    forward.beginObject();
    forward.writeObjectFieldIntro("__messages");
    forward.writeNull();

    reverse.beginObject();
    __dumpMessages(reverse);

    __blocked.set(false);
    __seq.bumpUpPre();
    __entropy.set(Long.toString(__random.nextLong()));
    __futures.commit();
    __queue.clear();
    __reset_future_queues();

    __commit(null, forward,reverse);
    forward.endObject();
    reverse.endObject();
    __distributeClientViews();
    return new Transaction(__seq.get(), request, forward.toString(), reverse.toString(), new TransactionResult(__state.has(), (int) (__next_time.get() - __time.get()), __seq.get()));
  }

  /** code generated: what happens when the document is constructed */
  protected abstract void __construct_intern(NtClient who, NtMessageBase message);
  /** code generated: create a private view for the given person */
  public abstract PrivateView __createPrivateView(NtClient __who, Consumer<String> __updates);

  public PrivateView __createView(final NtClient __who, final Consumer<String> updates) {
    final var view = __createPrivateView(__who, updates);
    var viewsForWho = __trackedViews.get(__who);
    if (viewsForWho == null) {
      viewsForWho = new ArrayList<>();
      __trackedViews.put(__who, viewsForWho);
    }
    viewsForWho.add(view);
    return view;
  }

  /** internal: we compute per client */
  private synchronized void __distributeClientViews() {
    final var startedTime = System.nanoTime();
    var exception = true;
    if (__monitor != null) {
      __monitor.push("DistributeClientViews");
    }
    try {
      final var itTrackedViews = __trackedViews.entrySet().iterator();
      while (itTrackedViews.hasNext()) {
        final var entryTrackedView = itTrackedViews.next();
        final var itView = entryTrackedView.getValue().iterator();
        while (itView.hasNext()) {
          final var pv = itView.next();
          if (pv.isAlive()) {
            final var writer = new JsonStreamWriter();
            writer.beginObject();
            writer.writeObjectFieldIntro("data");
            pv.update(writer);
            __futures.dump(writer, entryTrackedView.getKey());
            writer.writeObjectFieldIntro("seq");
            writer.writeInteger(__seq.get());
            writer.endObject();
            pv.deliver(writer.toString());
          }
        }
      }
      exception = false;
    } finally {
      if (__monitor != null) {
        __monitor.pop(System.nanoTime() - startedTime, exception);
      }
    }
  }

  /** code generator: dump the entire thing */
  public abstract void __dump(JsonStreamWriter __writer);

  protected void __dumpClients(final JsonStreamWriter writer) {
    if (__clients.size() > 0) {
      writer.writeObjectFieldIntro("__clients");
      writer.beginObject();
      for (final Map.Entry<NtClient, Integer> entry : __clients.entrySet()) {
        writer.writeObjectFieldIntro(entry.getValue());
        writer.writeNtClient(entry.getKey());
      }
      writer.endObject();
    }
  }

  protected void __dumpMessages(final JsonStreamWriter writer) {
    if (__queue.size() > 0) {
      writer.writeObjectFieldIntro("__messages");
      writer.beginObject();
      for (final AsyncTask task : __queue) {
        writer.writeObjectFieldIntro(task.messageId);
        task.dump(writer);
      }
      writer.endObject();
    }
  }

  public int __garbageCollectViews(final NtClient __who) {
    final var views = __trackedViews.get(__who);
    if (views == null) { return 0; }
    var count = 0;
    final var it = views.iterator();
    while (it.hasNext()) {
      if (it.next().isAlive()) {
        count++;
      } else {
        it.remove();
      }
    }
    if (count == 0) {
      __trackedViews.remove(__who);
    }
    return count;
  }

  /** get how much the current code "costs" */
  public int __getCodeCost() {
    return __code_cost;
  }

  /** code generated: get the tests for the document */
  public abstract String[] __getTests();

  /** exposed: this allows the child object to see if it can still do stuff */
  protected boolean __goodwill(final int startLine, final int startPosition, final int endLine, final int endLinePosition) {
    if (__goodwillBudget > 0) {
      __goodwillBudget--;
      if (__goodwillBudget == 0) {
        if (__monitor != null) {
          __monitor.goodwillFailureAt(startLine, startPosition, endLine, endLinePosition);
        }
        throw new GoodwillExhaustedException(startLine, startPosition, endLine, endLinePosition);
      }
    }
    return true;
  }

  protected void __hydrateClients(final JsonStreamReader reader) {
    final var killSet = new HashSet<Integer>();
    if (reader.startObject()) {
      while (reader.notEndOfObject()) {
        final var key = Integer.parseInt(reader.fieldName());
        if (reader.testLackOfNull()) {
          __clients.put(reader.readNtClient(), key);
        } else {
          killSet.add(key);
        }
      }
    }
    final var it = __clients.entrySet().iterator();
    while (it.hasNext()) {
      if (killSet.contains(it.next().getValue())) {
        it.remove();
      }
    }
  }

  protected void __hydrateMessages(final JsonStreamReader reader) {
    if (reader.testLackOfNull()) {
      if (reader.startObject()) {
        while (reader.notEndOfObject()) {
          final var msgId = Integer.parseInt(reader.fieldName());
          final var tasks = new TreeMap<Integer, AsyncTask>();
          for (final AsyncTask oldTask : __queue) {
            tasks.put(oldTask.messageId, oldTask);
          }
          __queue.clear();
          if (reader.testLackOfNull()) {
            if (reader.startObject()) {
              NtClient who = null;
              String channel = null;
              Object message = null;
              var timestamp = 0L;
              while (reader.notEndOfObject()) {
                final var f = reader.fieldName();
                switch (f) {
                  case "who":
                    who = reader.readNtClient();
                    break;
                  case "channel":
                    channel = reader.readString();
                    break;
                  case "timestamp":
                    timestamp = reader.readLong();
                    break;
                  case "message":
                    message = __parse_message2(channel, reader);
                    break;
                  default:
                    reader.skipValue();
                }
              }
              final var task = new AsyncTask(msgId, who, channel, timestamp, message);
              tasks.put(msgId, task);
            }
          } else {
            tasks.remove(msgId);
          }
          __queue.addAll(tasks.values());
        }
      }
    } else {
      __queue.clear();
    }
  }

  /** code generated: insert a record */
  public abstract void __insert(JsonStreamReader __reader);

  /** exposed: invoke the given state machine label */
  protected void __invoke(final String __new_state) {
    if (__monitor != null) {
      final var started = System.nanoTime();
      __monitor.push(__new_state);
      var exception = true;
      try {
        __invoke_label(__new_state);
        exception = false;
      } finally {
        __monitor.pop(System.nanoTime() - started, exception);
      }
    } else {
      __invoke_label(__new_state);
    }
  }

  /** code generated: state machine labelslabels can be dynamically invoked */
  protected abstract void __invoke_label(String __new_state);

  public boolean __isConnected(final NtClient __who) {
    return __clients.containsKey(__who);
  }

  /** code generated: allow the document to accept/reject the client */
  public abstract boolean __onConnected(NtClient clientValue);
  /** code generated: let the document know of a disconnected client */
  public abstract void __onDisconnected(NtClient clientValue);
  /** code generated: convert the reader into a constructor arg */
  protected abstract NtMessageBase __parse_construct_arg(JsonStreamReader reader);
  /** parse the message for the channel, and cache the result */
  protected abstract Object __parse_message2(String channel, JsonStreamReader reader);

  /** exposed: preempty the state machine */
  protected void __preemptStateMachine(final String next) {
    __preemptedStateOnNextComputeBlocked = next;
  }

  /** artifact: from RxParent */
  @Override
  public void __raiseDirty() {
  }

  /** exposed: random number between 0 and n exclusive */
  protected int __randomBoundInt(final int n) {
    if (n < 0) { return 0; }
    return __random.nextInt(n);
  }

  /** exposed: random double */
  protected double __randomDouble() {
    return __random.nextDouble();
  }

  /** exposed: random double that fits a */
  protected double __randomGaussian() {
    return __random.nextGaussian();
  }

  /** exposed: random number */
  protected int __randomInt() {
    return __random.nextInt();
  }

  /** exposed: random long */
  protected long __randomLong() {
    return __random.nextLong();
  }

  /** code generated: reset internal queues */
  protected abstract void __reset_future_queues();
  /** code generated: revert the tree, all changes revert back */
  public abstract void __revert();
  /** code generated: route the given message */
  protected abstract void __route(AsyncTask task);

  /** available to the test runner... me thinks this can be done... mucho better
   * (requires precommit) */
  public String __run_test(final TestReportBuilder report, final String testName) {
    __test(report, testName);
    final var writer = new JsonStreamWriter();
    writer.beginObject();
    __commit(null, writer, new JsonStreamWriter());
    writer.endObject();
    return writer.toString();
  }

  /** code generated: run the test for the given test name */
  public abstract void __test(TestReportBuilder report, String testName);

  /** exposed: @step; for testing */
  protected void __test_progress() {
    try {
      for (final AsyncTask task : __queue) {
        __route(task);
      }
      final long timeBackup = __time.get();
      for (final AsyncTask task : __queue) {
        __time.set(task.timestamp);
        task.execute();
      }
      __time.set(timeBackup);
      final var stateToExecute = __state.get();
      __state.set("");
      __invoke_label(stateToExecute);
      __blocked.set(false);
      __seq.bumpUpPre();
      __entropy.set(Long.toString(__random.nextLong()));
      __futures.commit();
      __queue.clear();
      __reset_future_queues();
      __commit(null, new JsonStreamWriter(), new JsonStreamWriter());
    } catch (final ComputeBlockedException cbe) {
      __revert();
      __futures.restore();
      __reset_future_queues();
      __blocked.set(true);
    } catch (final RetryProgressException cbe) {
      __revert();
      __futures.restore();
      __reset_future_queues();
      __blocked.set(true);
      __test_progress();
    }
  }

  /** exposed: get the current time */
  protected long __timeNow() {
    return __time.get().longValue();
  }

  /** exposed: for code coverage */
  protected void __track(final int idx) {
    __trace.add(idx);
  }

  /** transaction: core API (New Version in Draft) */
  public Transaction __transact(final String requestJson) throws ErrorCodeException {
    final var reader = new JsonStreamReader(requestJson);
    String command = null;
    Long timestamp = null;
    NtClient who = null;
    Object message = null;
    NtMessageBase arg = null;
    String channel = null;
    String entropy = null;
    if (reader.startObject()) {
      while (reader.notEndOfObject()) {
        final var fieldName = reader.fieldName();
        switch (fieldName) {
          case "command":
            command = reader.readString();
            break;
          case "timestamp":
            timestamp = reader.readLong();
            break;
          case "who":
            who = reader.readNtClient();
            break;
          case "channel":
            channel = reader.readString();
            break;
          case "entropy":
            entropy = reader.readString();
            break;
          case "message":
            message = __parse_message2(channel, reader);
            break;
          case "arg": // for constructor
            arg = __parse_construct_arg(reader);
            break;
        }
      }
    }
    if (command == null) { throw new ErrorCodeException(ErrorCodeException.LIVING_DOCUMENT_TRANSACTION_NO_COMMAND_FOUND); }
    if (timestamp == null) { throw new ErrorCodeException(ErrorCodeException.LIVING_DOCUMENT_TRANSACTION_NO_TIMESTAMP); }
    __time.set(timestamp);
    switch (command) {
      case "bill":
        return __transaction_bill(requestJson);
      case "invalidate":
        if (__monitor != null) {
          return __transaction_invalidate_monitored(requestJson);
        } else {
          return __transaction_invalidate_body(requestJson);
        }
      case "construct":
        if (who == null) { throw new ErrorCodeException(ErrorCodeException.LIVING_DOCUMENT_TRANSACTION_NO_CLIENT_AS_WHO); }
        if (__constructed.get()) { throw new ErrorCodeException(ErrorCodeException.LIVING_DOCUMENT_TRANSACTION_ALREADY_CONSTRUCTED); }
        if (arg == null) { throw new ErrorCodeException(ErrorCodeException.LIVING_DOCUMENT_TRANSACTION_NO_CONSTRUCTOR_ARG); }
        return __transaction_construct(requestJson, who, arg, entropy);
      case "connect":
        if (who == null) { throw new ErrorCodeException(ErrorCodeException.LIVING_DOCUMENT_TRANSACTION_NO_CLIENT_AS_WHO); }
        return __transaction_connect(requestJson, who);
      case "disconnect":
        if (who == null) { throw new ErrorCodeException(ErrorCodeException.LIVING_DOCUMENT_TRANSACTION_NO_CLIENT_AS_WHO); }
        return __transaction_disconnect(requestJson, who);
      case "send":
        if (who == null) { throw new ErrorCodeException(ErrorCodeException.LIVING_DOCUMENT_TRANSACTION_NO_CLIENT_AS_WHO); }
        if (channel == null) { throw new ErrorCodeException(ErrorCodeException.LIVING_DOCUMENT_TRANSACTION_CANT_SEND_NO_CHANNEL); }
        if (message == null) { throw new ErrorCodeException(ErrorCodeException.LIVING_DOCUMENT_TRANSACTION_CANT_SEND_NO_MESSAGE); }
        return __transaction_send(requestJson, who, channel, timestamp, message);
    }
    throw new ErrorCodeException(ErrorCodeException.LIVING_DOCUMENT_TRANSACTION_NO_VALID_COMMAND_FOUND);
  }

  /** transaction: bill */
  private Transaction __transaction_bill(final String request) {
    final var ticks = __goodwillLimitOfBudget - __goodwillBudget;
    final var cost = __code_cost;
    __goodwillBudget = __goodwillLimitOfBudget;
    __code_cost = 0;
    final var writer = new JsonStreamWriter();
    writer.beginObject();
    writer.writeObjectFieldIntro("__goodwill_used");
    writer.writeInteger(ticks);
    writer.writeObjectFieldIntro("__cost");
    writer.writeInteger(cost);
    writer.writeObjectFieldIntro("__billing_seq");
    writer.writeInteger(__seq.get());
    writer.endObject();

    return new Transaction(__seq.get(), request, writer.toString(), "{}", new TransactionResult(true, 0, __seq.get()));
  }

  /** transaction: a person connects to document */
  private Transaction __transaction_connect(final String request, final NtClient who) throws ErrorCodeException {
    final var startedTime = System.nanoTime();
    var exception = true;
    if (__monitor != null) {
      __monitor.push("TransactionConnect");
    }
    try {
      __random = new Random(Long.parseLong(__entropy.get()));
      if (__clients.containsKey(who)) { throw new ErrorCodeException(ErrorCodeException.LIVING_DOCUMENT_TRANSACTION_ALREADY_CONNECTED); }
      if (__onConnected(who)) {
        // user was accepted, so let's commit it
        // generate a connection id for the user
        final var cId = __connection_id.bumpUpPost();
        // associate the client to the connection id
        __clients.put(who, cId);
        // commit the tree to the delta
        __seq.bumpUpPre();
        final var forward = new JsonStreamWriter();
        final var reverse = new JsonStreamWriter();
        forward.beginObject();
        reverse.beginObject();
        __commit(null, forward, reverse);
        forward.writeObjectFieldIntro("__clients");
        forward.beginObject();
        forward.writeObjectFieldIntro(cId);
        forward.writeNtClient(who);
        forward.endObject();
        forward.endObject();

        reverse.writeObjectFieldIntro("__clients");
        reverse.beginObject();
        reverse.writeObjectFieldIntro(cId);
        reverse.writeNull();
        reverse.endObject();
        reverse.endObject();
        final var result = new Transaction(__seq.get(), request, forward.toString(), reverse.toString(), new TransactionResult(true, 0, __seq.get()));
        exception = false;
        return result;
      } else {
        // clean up because it was rejected
        __revert();
        throw new ErrorCodeException(ErrorCodeException.LIVING_DOCUMENT_TRANSACTION_CLIENT_REJECTED);
      }
    } finally {
      if (__monitor != null) {
        __monitor.pop(System.nanoTime() - startedTime, exception);
      }
    }
  }

  /** transaction: construct the document */
  private Transaction __transaction_construct(final String request, final NtClient who, final NtMessageBase arg, final String entropy) throws ErrorCodeException {
    final var startedTime = System.nanoTime();
    var exception = true;
    if (__monitor != null) {
      __monitor.push("TransactionConstruct");
    }
    try {
      if (entropy != null) {
        __entropy.set(entropy);
      }
      __random = new Random(Long.parseLong(__entropy.get()));
      if (__constructed.get()) { throw new ErrorCodeException(ErrorCodeException.LIVING_DOCUMENT_TRANSACTION_ALREADY_CONSTRUCTED); }
      __construct_intern(who, arg);
      __constructed.set(true);
      final var forward = new JsonStreamWriter();
      final var reverse = new JsonStreamWriter();
      forward.beginObject();
      reverse.beginObject();
      __commit(null, forward, reverse);
      forward.endObject();
      reverse.endObject();
      final var result = new Transaction(__seq.get(), request, forward.toString(), reverse.toString(), new TransactionResult(true, 0, __seq.get()));
      exception = false;
      return result;
    } finally {
      if (__monitor != null) {
        __monitor.pop(System.nanoTime() - startedTime, exception);
      }
    }
  }

  /** transaction: a person disconnects from the document */
  private Transaction __transaction_disconnect(final String request, final NtClient who) throws ErrorCodeException {
    final var startedTime = System.nanoTime();
    var exception = true;
    if (__monitor != null) {
      __monitor.push("TransactionDisconnect");
    }
    try {
      __random = new Random(Long.parseLong(__entropy.get()));
      if (!__clients.containsKey(who)) { throw new ErrorCodeException(ErrorCodeException.LIVING_DOCUMENT_TRANSACTION_CANT_DISCONNECT_DUE_TO_NOT_CONNECTED); }
      // disconnect them
      __onDisconnected(who);
      // stop tracking them
      final int id = __clients.remove(who);
      __seq.bumpUpPre();
      final var forward = new JsonStreamWriter();
      final var reverse = new JsonStreamWriter();
      forward.beginObject();
      reverse.beginObject();
      __commit(null, forward, reverse);
      forward.writeObjectFieldIntro("__clients");
      forward.beginObject();
      forward.writeObjectFieldIntro(id);
      forward.writeNull();
      forward.endObject();
      forward.endObject();
      reverse.writeObjectFieldIntro("__clients");
      reverse.beginObject();
      reverse.writeObjectFieldIntro(id);
      reverse.writeNtClient(who);
      reverse.endObject();
      reverse.endObject();
      final var result = new Transaction(__seq.get(), request, forward.toString(), reverse.toString(), new TransactionResult(true, 0, __seq.get()));
      exception = false;
      return result;
    } finally {
      if (__monitor != null) {
        __monitor.pop(System.nanoTime() - startedTime, exception);
      }
    }
  }

  /** transaction: an invalidation is happening on the document (no monitor) */
  private Transaction __transaction_invalidate_body(final String request) {
    __preemptedStateOnNextComputeBlocked = null;
    final var seedUsed = Long.parseLong(__entropy.get());
    try {
      __random = new Random(seedUsed);
      for (final AsyncTask task : __queue) {
        __route(task);
      }
      final long timeBackup = __time.get();
      for (final AsyncTask task : __queue) {
        __time.set(task.timestamp);
        task.execute();
      }
      __time.set(timeBackup);
      if (__state.get().length() > 0) {}
      // execute the state
      if (__state.has() && __next_time.get() <= __time.get()) {
        final var stateToExecute = __state.get();
        __state.set("");
        __invoke_label(stateToExecute);
      }
      return __commit_trailer(request);
    } catch (final ComputeBlockedException cbe) {
      if (__preemptedStateOnNextComputeBlocked != null) {
        __state.set(__preemptedStateOnNextComputeBlocked);
        __next_time.set(__time.get());
        __preemptedStateOnNextComputeBlocked = null;
        return __commit_trailer(request);
      } else {
        __distributeClientViews();
        __revert();

        __futures.restore();
        __reset_future_queues();
        __blocked.set(true);
        __seq.bumpUpPre();
        final var forward = new JsonStreamWriter();
        final var reverse = new JsonStreamWriter();
        forward.beginObject();
        reverse.beginObject();
        if (cbe.channel != null) {
          forward.writeObjectFieldIntro("__blocked_on");
          forward.writeFastString(cbe.channel);
        }
        __commit(null, forward, reverse);
        forward.endObject();
        reverse.endObject();
        return new Transaction(__seq.get(), request, forward.toString(), reverse.toString(), new TransactionResult(false, 0, __seq.get()));
      }
    } catch (final RetryProgressException rpe) {
      __futures.restore();
      __reset_future_queues();
      __revert();
      final var forward = new JsonStreamWriter();
      final var reverse = new JsonStreamWriter();

      forward.beginObject();
      forward.writeObjectFieldIntro("__messages");
      forward.beginObject();
      forward.writeObjectFieldIntro(rpe.failedTask.messageId);
      forward.writeNull();
      forward.endObject();
      reverse.beginObject();
      reverse.writeObjectFieldIntro("__messages");
      reverse.beginObject();
      reverse.writeObjectFieldIntro(rpe.failedTask.messageId);
      rpe.failedTask.dump(reverse);
      reverse.endObject();
      __seq.bumpUpPre();
      __commit(null, forward, reverse);
      forward.endObject();
      reverse.endObject();
      return new Transaction(__seq.get(), request, forward.toString(), reverse.toString(), new TransactionResult(true, 0, __seq.get()));
    }
  }

  /** transaction: an invalidation is happening on the document (use monitor) */
  private Transaction __transaction_invalidate_monitored(final String request) {
    var exception = true;
    final var startedTime = System.nanoTime();
    __monitor.push("TransactionInvalidate");
    try {
      final var result = __transaction_invalidate_body(request);
      exception = false; // this is basically useless, but nothing within this function should be a
      // subscribe
      return result;
    } finally {
      __monitor.pop(System.nanoTime() - startedTime, exception);
    }
  }

  /** transaction: a person is sending the document a message */
  private Transaction __transaction_send(final String request, final NtClient who, final String channel, final long timestamp, final Object message) throws ErrorCodeException {
    final var startedTime = System.nanoTime();
    var exception = true;
    if (__monitor != null) {
      __monitor.push("TransactionSend");
    }
    try {
      __random = new Random(Long.parseLong(__entropy.get()));
      // they must be connected
      if (!__clients.containsKey(who)) { throw new ErrorCodeException(ErrorCodeException.LIVING_DOCUMENT_TRANSACTION_CANT_SEND_NOT_CONNECTED); }
      // create the delta
      final var forward = new JsonStreamWriter();
      final var reverse = new JsonStreamWriter();
      // allocate a message id
      final var msgId = __message_id.bumpUpPost();
      // inject into the __messages object under the message id
      // annotate the message with WHO
      forward.beginObject();
      forward.writeObjectFieldIntro("__messages");
      forward.beginObject();
      forward.writeObjectFieldIntro(msgId);
      final var task = new AsyncTask(msgId, who, channel, timestamp, message);
      task.dump(forward);
      forward.endObject();
      reverse.beginObject();
      reverse.writeObjectFieldIntro("__messages");
      reverse.beginObject();
      reverse.writeObjectFieldIntro(msgId);
      reverse.writeNull();
      reverse.endObject();
      __queue.add(task);
      // commit changes (i.e. the message id)
      __seq.bumpUpPre();
      __commit(null, forward, reverse);
      forward.endObject();
      reverse.endObject();
      final var result = new Transaction(__seq.get(), request, forward.toString(), reverse.toString(), new TransactionResult(true, 0, __seq.get()));
      exception = false;
      return result;
    } finally {
      if (__monitor != null) {
        __monitor.pop(System.nanoTime() - startedTime, exception);
      }
    }
  }

  /** exposed: transition the current state machine label */
  protected void __transitionStateMachine(final String next, final double timeToTransitionSeconds) {
    __state.set(next);
    __next_time.set((long) (__time.get() + timeToTransitionSeconds * 1000.0));
  }

  /** get the current number of assertion failures, then return the prior number
   * of assertion failures.
   *
   * @return the number of assertion failures */
  @Deprecated
  public AssertionStats getAndResetAssertions() {
    final var stats = new AssertionStats(__assertionTotal, __assertionFailures);
    __assertionFailures = 0;
    __assertionTotal = 0;
    return stats;
  }
}
