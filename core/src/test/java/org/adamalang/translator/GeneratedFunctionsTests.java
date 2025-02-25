/* The Adama Programming Language For Board Games!
 *    See http://www.adama-lang.org/ for more information.
 * (c) copyright 2020 Jeffrey M. Barber (http://jeffrey.io) */
package org.adamalang.translator;

import org.junit.Test;

public class GeneratedFunctionsTests extends GeneratedBase {
  private String cached_AcceptRecord_1 = null;
  private String get_AcceptRecord_1() {
    if (cached_AcceptRecord_1 != null) {
      return cached_AcceptRecord_1;
    }
    cached_AcceptRecord_1 = generateTestOutput(true, "AcceptRecord_1", "./test_code/Functions_AcceptRecord_success.a");
    return cached_AcceptRecord_1;
  }

  @Test
  public void testAcceptRecordEmission() {
    assertEmissionGood(get_AcceptRecord_1());
  }

  @Test
  public void testAcceptRecordSuccess() {
    assertLivePass(get_AcceptRecord_1());
  }

  @Test
  public void testAcceptRecordGoodWillHappy() {
    assertGoodWillHappy(get_AcceptRecord_1());
  }

  @Test
  public void testAcceptRecordExceptionFree() {
    assertExceptionFree(get_AcceptRecord_1());
  }

  @Test
  public void testAcceptRecordTODOFree() {
    assertTODOFree(get_AcceptRecord_1());
  }

  @Test
  public void stable_AcceptRecord_1() {
    String live = get_AcceptRecord_1();
    StringBuilder gold = new StringBuilder();
    gold.append("Path:Functions_AcceptRecord_success.a");
    gold.append("\n--EMISSION-----------------------------------------");
    gold.append("\nEmission Success, Yay");
    gold.append("\n--ISSUES-------------------------------------------");
    gold.append("\n[ ]");
    gold.append("\n--JAVA---------------------------------------------");
    gold.append("\nimport com.fasterxml.jackson.databind.JsonNode;");
    gold.append("\nimport com.fasterxml.jackson.databind.node.ArrayNode;");
    gold.append("\nimport com.fasterxml.jackson.databind.node.ObjectNode;");
    gold.append("\nimport org.adamalang.runtime.*;");
    gold.append("\nimport org.adamalang.runtime.async.*;");
    gold.append("\nimport org.adamalang.runtime.contracts.*;");
    gold.append("\nimport org.adamalang.runtime.delta.*;");
    gold.append("\nimport org.adamalang.runtime.exceptions.*;");
    gold.append("\nimport org.adamalang.runtime.index.*;");
    gold.append("\nimport org.adamalang.runtime.json.*;");
    gold.append("\nimport org.adamalang.runtime.natives.*;");
    gold.append("\nimport org.adamalang.runtime.natives.lists.*;");
    gold.append("\nimport org.adamalang.runtime.ops.*;");
    gold.append("\nimport org.adamalang.runtime.reactives.*;");
    gold.append("\nimport org.adamalang.runtime.stdlib.*;");
    gold.append("\nimport java.util.function.Consumer;");
    gold.append("\nimport java.util.function.Function;");
    gold.append("\nimport java.util.ArrayList;");
    gold.append("\nimport java.util.Comparator;");
    gold.append("\nimport java.util.Map;");
    gold.append("\nimport java.lang.Math;");
    gold.append("\npublic class AcceptRecord_1 extends LivingDocument {");
    gold.append("\n  private final RTxR x;");
    gold.append("\n  public AcceptRecord_1(DocumentMonitor __monitor) {");
    gold.append("\n    super(__monitor);");
    gold.append("\n    x = new RTxR(this);");
    gold.append("\n    __goodwillBudget = 100000;");
    gold.append("\n    __goodwillLimitOfBudget = 100000;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __insert(JsonStreamReader __reader) {");
    gold.append("\n    if (__reader.startObject()) {");
    gold.append("\n      while(__reader.notEndOfObject()) {");
    gold.append("\n        String __fieldName = __reader.fieldName();");
    gold.append("\n        switch (__fieldName) {");
    gold.append("\n          case \"x\":");
    gold.append("\n            x.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__state\":");
    gold.append("\n            __state.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__constructed\":");
    gold.append("\n            __constructed.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__next_time\":");
    gold.append("\n            __next_time.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__blocked\":");
    gold.append("\n            __blocked.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__seq\":");
    gold.append("\n            __seq.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__entropy\":");
    gold.append("\n            __entropy.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__auto_future_id\":");
    gold.append("\n            __auto_future_id.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__connection_id\":");
    gold.append("\n            __connection_id.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__message_id\":");
    gold.append("\n            __message_id.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__time\":");
    gold.append("\n            __time.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__clients\":");
    gold.append("\n            __hydrateClients(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__messages\":");
    gold.append("\n            __hydrateMessages(__reader);");
    gold.append("\n            break;");
    gold.append("\n          default:");
    gold.append("\n            __reader.skipValue();");
    gold.append("\n        }");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __dump(JsonStreamWriter __writer) {");
    gold.append("\n    __writer.beginObject();");
    gold.append("\n    __writer.writeObjectFieldIntro(\"x\");");
    gold.append("\n    x.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__state\");");
    gold.append("\n    __state.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__constructed\");");
    gold.append("\n    __constructed.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__next_time\");");
    gold.append("\n    __next_time.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__blocked\");");
    gold.append("\n    __blocked.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__seq\");");
    gold.append("\n    __seq.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__entropy\");");
    gold.append("\n    __entropy.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__auto_future_id\");");
    gold.append("\n    __auto_future_id.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__connection_id\");");
    gold.append("\n    __connection_id.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__message_id\");");
    gold.append("\n    __message_id.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__time\");");
    gold.append("\n    __time.__dump(__writer);");
    gold.append("\n    __dumpClients(__writer);");
    gold.append("\n    __dumpMessages(__writer);");
    gold.append("\n    __writer.endObject();");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __commit(String __name, JsonStreamWriter __forward, JsonStreamWriter __reverse) {");
    gold.append("\n    __state.__commit(\"__state\", __forward, __reverse);");
    gold.append("\n    __constructed.__commit(\"__constructed\", __forward, __reverse);");
    gold.append("\n    __next_time.__commit(\"__next_time\", __forward, __reverse);");
    gold.append("\n    __blocked.__commit(\"__blocked\", __forward, __reverse);");
    gold.append("\n    __seq.__commit(\"__seq\", __forward, __reverse);");
    gold.append("\n    __entropy.__commit(\"__entropy\", __forward, __reverse);");
    gold.append("\n    __auto_future_id.__commit(\"__auto_future_id\", __forward, __reverse);");
    gold.append("\n    __connection_id.__commit(\"__connection_id\", __forward, __reverse);");
    gold.append("\n    __message_id.__commit(\"__message_id\", __forward, __reverse);");
    gold.append("\n    __time.__commit(\"__time\", __forward, __reverse);");
    gold.append("\n    x.__commit(\"x\", __forward, __reverse);");
    gold.append("\n    /* root */");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __revert() {");
    gold.append("\n    __state.__revert();");
    gold.append("\n    __constructed.__revert();");
    gold.append("\n    __next_time.__revert();");
    gold.append("\n    __blocked.__revert();");
    gold.append("\n    __seq.__revert();");
    gold.append("\n    __entropy.__revert();");
    gold.append("\n    __auto_future_id.__revert();");
    gold.append("\n    __connection_id.__revert();");
    gold.append("\n    __message_id.__revert();");
    gold.append("\n    __time.__revert();");
    gold.append("\n    x.__revert();");
    gold.append("\n    /* root */");
    gold.append("\n  }");
    gold.append("\n  private class DeltaAcceptRecord_1 {");
    gold.append("\n    private boolean __emitted;");
    gold.append("\n    private DeltaAcceptRecord_1() {");
    gold.append("\n      __emitted = false;");
    gold.append("\n    }");
    gold.append("\n    public void show(AcceptRecord_1 __item, PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      PrivateLazyDeltaWriter __obj = __writer.planObject();");
    gold.append("\n      __obj.manifest();");
    gold.append("\n      if (__obj.end()) {");
    gold.append("\n        __emitted = true;");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n    public void hide(PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      if (__emitted) {");
    gold.append("\n        __emitted = false;");
    gold.append("\n        __writer.writeNull();");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public PrivateView __createPrivateView(NtClient __who, Consumer<String> __updates) {");
    gold.append("\n    AcceptRecord_1 __self = this;");
    gold.append("\n    DeltaAcceptRecord_1 __state = new DeltaAcceptRecord_1();");
    gold.append("\n    return new PrivateView(__who, __updates) {");
    gold.append("\n      @Override");
    gold.append("\n      public void update(JsonStreamWriter __writer) {");
    gold.append("\n        __state.show(__self, PrivateLazyDeltaWriter.bind(__who, __writer));");
    gold.append("\n      }");
    gold.append("\n    };");
    gold.append("\n  }");
    gold.append("\n  private class RTxR extends RxRecordBase<RTxR> {");
    gold.append("\n    private final RxInt32 z;");
    gold.append("\n    private final RxInt32 id;");
    gold.append("\n    private RTxR(RxParent __owner) {");
    gold.append("\n      super(__owner);");
    gold.append("\n      z = new RxInt32(this, 0);");
    gold.append("\n      id = new RxInt32(this, 0);");
    gold.append("\n      if (__owner instanceof RxTable) {");
    gold.append("\n        /* ok */");
    gold.append("\n      } else {");
    gold.append("\n        /* ok */");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n    String[] __INDEX_COLUMNS = new String[] {\"z\"};");
    gold.append("\n    @Override");
    gold.append("\n    public String[] __getIndexColumns() {");
    gold.append("\n      return __INDEX_COLUMNS;");
    gold.append("\n    }");
    gold.append("\n    @Override");
    gold.append("\n    public int[] __getIndexValues() {");
    gold.append("\n      return new int[] {z.getIndexValue()};");
    gold.append("\n    }");
    gold.append("\n    @Override");
    gold.append("\n    public void __insert(JsonStreamReader __reader) {");
    gold.append("\n      if (__reader.startObject()) {");
    gold.append("\n        while(__reader.notEndOfObject()) {");
    gold.append("\n          String __fieldName = __reader.fieldName();");
    gold.append("\n          switch (__fieldName) {");
    gold.append("\n            case \"z\":");
    gold.append("\n              z.__insert(__reader);");
    gold.append("\n              break;");
    gold.append("\n            case \"id\":");
    gold.append("\n              id.__insert(__reader);");
    gold.append("\n              break;");
    gold.append("\n            default:");
    gold.append("\n              __reader.skipValue();");
    gold.append("\n          }");
    gold.append("\n        }");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n    @Override");
    gold.append("\n    public void __dump(JsonStreamWriter __writer) {");
    gold.append("\n      __writer.beginObject();");
    gold.append("\n      __writer.writeObjectFieldIntro(\"z\");");
    gold.append("\n      z.__dump(__writer);");
    gold.append("\n      __writer.writeObjectFieldIntro(\"id\");");
    gold.append("\n      id.__dump(__writer);");
    gold.append("\n      __writer.endObject();");
    gold.append("\n    }");
    gold.append("\n    @Override");
    gold.append("\n    public void __commit(String __name, JsonStreamWriter __forward, JsonStreamWriter __reverse) {");
    gold.append("\n      if (__isDirty()) {");
    gold.append("\n        __forward.writeObjectFieldIntro(__name);");
    gold.append("\n        __forward.beginObject();");
    gold.append("\n        __reverse.writeObjectFieldIntro(__name);");
    gold.append("\n        __reverse.beginObject();");
    gold.append("\n        z.__commit(\"z\", __forward, __reverse);");
    gold.append("\n        id.__commit(\"id\", __forward, __reverse);");
    gold.append("\n        __forward.endObject();");
    gold.append("\n        __reverse.endObject();");
    gold.append("\n        __lowerDirtyCommit();");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n    @Override");
    gold.append("\n    public void __revert() {");
    gold.append("\n      if (__isDirty()) {");
    gold.append("\n        __isDying = false;");
    gold.append("\n        z.__revert();");
    gold.append("\n        id.__revert();");
    gold.append("\n        __lowerDirtyRevert();");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n    @Override");
    gold.append("\n    public String __name() {");
    gold.append("\n      return \"R\";");
    gold.append("\n    }");
    gold.append("\n    @Override");
    gold.append("\n    public void __deindex() {");
    gold.append("\n      /* ok */");
    gold.append("\n    }");
    gold.append("\n    public void __reindex() {");
    gold.append("\n      /* ok */");
    gold.append("\n    }");
    gold.append("\n    @Override");
    gold.append("\n    public int __id() {");
    gold.append("\n      return id.get();");
    gold.append("\n    }");
    gold.append("\n    @Override");
    gold.append("\n    public void __setId(int __id, boolean __force) {");
    gold.append("\n      if (__force) {");
    gold.append("\n        id.forceSet(__id);");
    gold.append("\n      } else {");
    gold.append("\n        id.set(__id);");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  private class DeltaRTxR {");
    gold.append("\n    private boolean __emitted;");
    gold.append("\n    private DeltaRTxR() {");
    gold.append("\n      __emitted = false;");
    gold.append("\n    }");
    gold.append("\n    public void show(RTxR __item, PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      PrivateLazyDeltaWriter __obj = __writer.planObject();");
    gold.append("\n      if (__obj.end()) {");
    gold.append("\n        __emitted = true;");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n    public void hide(PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      if (__emitted) {");
    gold.append("\n        __emitted = false;");
    gold.append("\n        __writer.writeNull();");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  private void __FUNC_0_foo(RTxR r) {");
    gold.append("\n    __code_cost += 2;");
    gold.append("\n    __track(0);");
    gold.append("\n    r.z.set(123);");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __route(AsyncTask task) {");
    gold.append("\n    return;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected Object __parse_message2(String channel, JsonStreamReader __reader) {");
    gold.append("\n    __reader.skipValue();");
    gold.append("\n    return NtMessageBase.NULL;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __reset_future_queues() {");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __invoke_label(String __new_state) {}");
    gold.append("\n  @Override");
    gold.append("\n  public boolean __onConnected(NtClient __cvalue) {");
    gold.append("\n    boolean __result = false;");
    gold.append("\n    return __result;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __onDisconnected(NtClient __cvalue) {}");
    gold.append("\n  @Override");
    gold.append("\n  public String[] __getTests() {");
    gold.append("\n    return new String[] {};");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __test(TestReportBuilder report, String testName) {}");
    gold.append("\n  private void __construct_0(NtClient __who, NtMessageBase __object) {");
    gold.append("\n    __code_cost += 2;");
    gold.append("\n    __track(1);");
    gold.append("\n    __FUNC_0_foo(x);");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected NtMessageBase __parse_construct_arg(JsonStreamReader __reader) {");
    gold.append("\n    __reader.skipValue();");
    gold.append("\n    return NtMessageBase.NULL;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __construct_intern(NtClient __who, NtMessageBase __object) {");
    gold.append("\n    __construct_0(__who, __object);");
    gold.append("\n  }");
    gold.append("\n  /* end of file */");
    gold.append("\n}");
    gold.append("\n");
    gold.append("\n--JAVA COMPILE RESULTS-----------------------------");
    gold.append("\n--JAVA RUNNING-------------------------------------");
    gold.append("\n{\"command\":\"construct\",\"timestamp\":\"0\",\"who\":{\"agent\":\"?\",\"authority\":\"?\"},\"arg\":{},\"entropy\":\"0\"}-->{\"__constructed\":true,\"__entropy\":\"0\",\"x\":{\"z\":123}} need:true in:0");
    gold.append("\nNO_ONE was DENIED:5011");
    gold.append("\nRANDO was DENIED:5011");
    gold.append("\n+ NO_ONE DELTA:{\"data\":{},\"outstanding\":[],\"blockers\":[],\"seq\":1}");
    gold.append("\n+ RANDO DELTA:{\"data\":{},\"outstanding\":[],\"blockers\":[],\"seq\":1}");
    gold.append("\n{\"command\":\"invalidate\",\"timestamp\":\"25\"}-->{\"__messages\":null,\"__seq\":1,\"__entropy\":\"-4962768465676381896\",\"__time\":\"25\"} need:false in:-25");
    gold.append("\n{\"command\":\"bill\",\"timestamp\":\"50\"}-->{\"__goodwill_used\":0,\"__cost\":4,\"__billing_seq\":1} need:true in:0");
    gold.append("\n--JAVA RESULTS-------------------------------------");
    gold.append("\n{\"__constructed\":true,\"__entropy\":\"-4962768465676381896\",\"x\":{\"z\":123},\"__seq\":1,\"__time\":\"25\",\"__goodwill_used\":0,\"__cost\":4,\"__billing_seq\":1}");
    gold.append("\n--DUMP RESULTS-------------------------------------");
    gold.append("\n{\"x\":{\"z\":123,\"id\":0},\"__state\":\"\",\"__constructed\":true,\"__next_time\":\"0\",\"__blocked\":false,\"__seq\":1,\"__entropy\":\"-4962768465676381896\",\"__auto_future_id\":0,\"__connection_id\":0,\"__message_id\":0,\"__time\":\"50\"}");
    gold.append("\n{\"x\":{\"z\":123,\"id\":0},\"__state\":\"\",\"__constructed\":true,\"__next_time\":\"0\",\"__blocked\":false,\"__seq\":1,\"__entropy\":\"-4962768465676381896\",\"__auto_future_id\":0,\"__connection_id\":0,\"__message_id\":0,\"__time\":\"50\"}");
    gold.append("\n--JAVA TEST RESULTS--------------------------------");
    gold.append("\n");
    gold.append("\nSuccess");
    assertStable(live, gold);
  }
  private String cached_ApplyOnNotAFunction_2 = null;
  private String get_ApplyOnNotAFunction_2() {
    if (cached_ApplyOnNotAFunction_2 != null) {
      return cached_ApplyOnNotAFunction_2;
    }
    cached_ApplyOnNotAFunction_2 = generateTestOutput(false, "ApplyOnNotAFunction_2", "./test_code/Functions_ApplyOnNotAFunction_failure.a");
    return cached_ApplyOnNotAFunction_2;
  }

  @Test
  public void testApplyOnNotAFunctionFailure() {
    assertLiveFail(get_ApplyOnNotAFunction_2());
  }

  @Test
  public void testApplyOnNotAFunctionNotTerribleLineNumbers() {
    assertNotTerribleLineNumbers(get_ApplyOnNotAFunction_2());
  }

  @Test
  public void testApplyOnNotAFunctionExceptionFree() {
    assertExceptionFree(get_ApplyOnNotAFunction_2());
  }

  @Test
  public void testApplyOnNotAFunctionTODOFree() {
    assertTODOFree(get_ApplyOnNotAFunction_2());
  }

  @Test
  public void stable_ApplyOnNotAFunction_2() {
    String live = get_ApplyOnNotAFunction_2();
    StringBuilder gold = new StringBuilder();
    gold.append("Path:Functions_ApplyOnNotAFunction_failure.a");
    gold.append("\n--ISSUES-------------------------------------------");
    gold.append("\n[ {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 2,");
    gold.append("\n      \"character\" : 11");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 2,");
    gold.append("\n      \"character\" : 14");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"Type check failure: The given type was expected to be a function: 'int' (RuleSetFunctions)\"");
    gold.append("\n}, {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 2,");
    gold.append("\n      \"character\" : 11");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 2,");
    gold.append("\n      \"character\" : 14");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"Expression is not a function (FunctionInvoke)\"");
    gold.append("\n} ]");
    gold.append("\n--JAVA---------------------------------------------");
    gold.append("\n");
    gold.append("\nFailedValidation");
    assertStable(live, gold);
  }
  private String cached_ArityMismatch_3 = null;
  private String get_ArityMismatch_3() {
    if (cached_ArityMismatch_3 != null) {
      return cached_ArityMismatch_3;
    }
    cached_ArityMismatch_3 = generateTestOutput(false, "ArityMismatch_3", "./test_code/Functions_ArityMismatch_failure.a");
    return cached_ArityMismatch_3;
  }

  @Test
  public void testArityMismatchFailure() {
    assertLiveFail(get_ArityMismatch_3());
  }

  @Test
  public void testArityMismatchNotTerribleLineNumbers() {
    assertNotTerribleLineNumbers(get_ArityMismatch_3());
  }

  @Test
  public void testArityMismatchExceptionFree() {
    assertExceptionFree(get_ArityMismatch_3());
  }

  @Test
  public void testArityMismatchTODOFree() {
    assertTODOFree(get_ArityMismatch_3());
  }

  @Test
  public void stable_ArityMismatch_3() {
    String live = get_ArityMismatch_3();
    StringBuilder gold = new StringBuilder();
    gold.append("Path:Functions_ArityMismatch_failure.a");
    gold.append("\n--ISSUES-------------------------------------------");
    gold.append("\n[ {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 5,");
    gold.append("\n      \"character\" : 11");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 5,");
    gold.append("\n      \"character\" : 22");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"Function invoked with wrong number of arguments. Expected 1, got 0 (FunctionInvoke)\"");
    gold.append("\n}, {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 6,");
    gold.append("\n      \"character\" : 11");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 6,");
    gold.append("\n      \"character\" : 22");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"Function invoked with wrong number of arguments. Expected 1, got 2 (FunctionInvoke)\"");
    gold.append("\n} ]");
    gold.append("\n--JAVA---------------------------------------------");
    gold.append("\n");
    gold.append("\nFailedValidation");
    assertStable(live, gold);
  }
  private String cached_AutoConvertAnonymousOnReturn_4 = null;
  private String get_AutoConvertAnonymousOnReturn_4() {
    if (cached_AutoConvertAnonymousOnReturn_4 != null) {
      return cached_AutoConvertAnonymousOnReturn_4;
    }
    cached_AutoConvertAnonymousOnReturn_4 = generateTestOutput(true, "AutoConvertAnonymousOnReturn_4", "./test_code/Functions_AutoConvertAnonymousOnReturn_success.a");
    return cached_AutoConvertAnonymousOnReturn_4;
  }

  @Test
  public void testAutoConvertAnonymousOnReturnEmission() {
    assertEmissionGood(get_AutoConvertAnonymousOnReturn_4());
  }

  @Test
  public void testAutoConvertAnonymousOnReturnSuccess() {
    assertLivePass(get_AutoConvertAnonymousOnReturn_4());
  }

  @Test
  public void testAutoConvertAnonymousOnReturnGoodWillHappy() {
    assertGoodWillHappy(get_AutoConvertAnonymousOnReturn_4());
  }

  @Test
  public void testAutoConvertAnonymousOnReturnExceptionFree() {
    assertExceptionFree(get_AutoConvertAnonymousOnReturn_4());
  }

  @Test
  public void testAutoConvertAnonymousOnReturnTODOFree() {
    assertTODOFree(get_AutoConvertAnonymousOnReturn_4());
  }

  @Test
  public void stable_AutoConvertAnonymousOnReturn_4() {
    String live = get_AutoConvertAnonymousOnReturn_4();
    StringBuilder gold = new StringBuilder();
    gold.append("Path:Functions_AutoConvertAnonymousOnReturn_success.a");
    gold.append("\n--EMISSION-----------------------------------------");
    gold.append("\nEmission Success, Yay");
    gold.append("\n--ISSUES-------------------------------------------");
    gold.append("\n[ ]");
    gold.append("\n--JAVA---------------------------------------------");
    gold.append("\nimport com.fasterxml.jackson.databind.JsonNode;");
    gold.append("\nimport com.fasterxml.jackson.databind.node.ArrayNode;");
    gold.append("\nimport com.fasterxml.jackson.databind.node.ObjectNode;");
    gold.append("\nimport org.adamalang.runtime.*;");
    gold.append("\nimport org.adamalang.runtime.async.*;");
    gold.append("\nimport org.adamalang.runtime.contracts.*;");
    gold.append("\nimport org.adamalang.runtime.delta.*;");
    gold.append("\nimport org.adamalang.runtime.exceptions.*;");
    gold.append("\nimport org.adamalang.runtime.index.*;");
    gold.append("\nimport org.adamalang.runtime.json.*;");
    gold.append("\nimport org.adamalang.runtime.natives.*;");
    gold.append("\nimport org.adamalang.runtime.natives.lists.*;");
    gold.append("\nimport org.adamalang.runtime.ops.*;");
    gold.append("\nimport org.adamalang.runtime.reactives.*;");
    gold.append("\nimport org.adamalang.runtime.stdlib.*;");
    gold.append("\nimport java.util.function.Consumer;");
    gold.append("\nimport java.util.function.Function;");
    gold.append("\nimport java.util.ArrayList;");
    gold.append("\nimport java.util.Comparator;");
    gold.append("\nimport java.util.Map;");
    gold.append("\nimport java.lang.Math;");
    gold.append("\npublic class AutoConvertAnonymousOnReturn_4 extends LivingDocument {");
    gold.append("\n  public AutoConvertAnonymousOnReturn_4(DocumentMonitor __monitor) {");
    gold.append("\n    super(__monitor);");
    gold.append("\n    __goodwillBudget = 100000;");
    gold.append("\n    __goodwillLimitOfBudget = 100000;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __insert(JsonStreamReader __reader) {");
    gold.append("\n    if (__reader.startObject()) {");
    gold.append("\n      while(__reader.notEndOfObject()) {");
    gold.append("\n        String __fieldName = __reader.fieldName();");
    gold.append("\n        switch (__fieldName) {");
    gold.append("\n          case \"__state\":");
    gold.append("\n            __state.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__constructed\":");
    gold.append("\n            __constructed.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__next_time\":");
    gold.append("\n            __next_time.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__blocked\":");
    gold.append("\n            __blocked.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__seq\":");
    gold.append("\n            __seq.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__entropy\":");
    gold.append("\n            __entropy.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__auto_future_id\":");
    gold.append("\n            __auto_future_id.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__connection_id\":");
    gold.append("\n            __connection_id.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__message_id\":");
    gold.append("\n            __message_id.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__time\":");
    gold.append("\n            __time.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__clients\":");
    gold.append("\n            __hydrateClients(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__messages\":");
    gold.append("\n            __hydrateMessages(__reader);");
    gold.append("\n            break;");
    gold.append("\n          default:");
    gold.append("\n            __reader.skipValue();");
    gold.append("\n        }");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __dump(JsonStreamWriter __writer) {");
    gold.append("\n    __writer.beginObject();");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__state\");");
    gold.append("\n    __state.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__constructed\");");
    gold.append("\n    __constructed.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__next_time\");");
    gold.append("\n    __next_time.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__blocked\");");
    gold.append("\n    __blocked.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__seq\");");
    gold.append("\n    __seq.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__entropy\");");
    gold.append("\n    __entropy.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__auto_future_id\");");
    gold.append("\n    __auto_future_id.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__connection_id\");");
    gold.append("\n    __connection_id.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__message_id\");");
    gold.append("\n    __message_id.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__time\");");
    gold.append("\n    __time.__dump(__writer);");
    gold.append("\n    __dumpClients(__writer);");
    gold.append("\n    __dumpMessages(__writer);");
    gold.append("\n    __writer.endObject();");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __commit(String __name, JsonStreamWriter __forward, JsonStreamWriter __reverse) {");
    gold.append("\n    __state.__commit(\"__state\", __forward, __reverse);");
    gold.append("\n    __constructed.__commit(\"__constructed\", __forward, __reverse);");
    gold.append("\n    __next_time.__commit(\"__next_time\", __forward, __reverse);");
    gold.append("\n    __blocked.__commit(\"__blocked\", __forward, __reverse);");
    gold.append("\n    __seq.__commit(\"__seq\", __forward, __reverse);");
    gold.append("\n    __entropy.__commit(\"__entropy\", __forward, __reverse);");
    gold.append("\n    __auto_future_id.__commit(\"__auto_future_id\", __forward, __reverse);");
    gold.append("\n    __connection_id.__commit(\"__connection_id\", __forward, __reverse);");
    gold.append("\n    __message_id.__commit(\"__message_id\", __forward, __reverse);");
    gold.append("\n    __time.__commit(\"__time\", __forward, __reverse);");
    gold.append("\n    /* root */");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __revert() {");
    gold.append("\n    __state.__revert();");
    gold.append("\n    __constructed.__revert();");
    gold.append("\n    __next_time.__revert();");
    gold.append("\n    __blocked.__revert();");
    gold.append("\n    __seq.__revert();");
    gold.append("\n    __entropy.__revert();");
    gold.append("\n    __auto_future_id.__revert();");
    gold.append("\n    __connection_id.__revert();");
    gold.append("\n    __message_id.__revert();");
    gold.append("\n    __time.__revert();");
    gold.append("\n    /* root */");
    gold.append("\n  }");
    gold.append("\n  private class DeltaAutoConvertAnonymousOnReturn_4 {");
    gold.append("\n    private boolean __emitted;");
    gold.append("\n    private DeltaAutoConvertAnonymousOnReturn_4() {");
    gold.append("\n      __emitted = false;");
    gold.append("\n    }");
    gold.append("\n    public void show(AutoConvertAnonymousOnReturn_4 __item, PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      PrivateLazyDeltaWriter __obj = __writer.planObject();");
    gold.append("\n      __obj.manifest();");
    gold.append("\n      if (__obj.end()) {");
    gold.append("\n        __emitted = true;");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n    public void hide(PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      if (__emitted) {");
    gold.append("\n        __emitted = false;");
    gold.append("\n        __writer.writeNull();");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public PrivateView __createPrivateView(NtClient __who, Consumer<String> __updates) {");
    gold.append("\n    AutoConvertAnonymousOnReturn_4 __self = this;");
    gold.append("\n    DeltaAutoConvertAnonymousOnReturn_4 __state = new DeltaAutoConvertAnonymousOnReturn_4();");
    gold.append("\n    return new PrivateView(__who, __updates) {");
    gold.append("\n      @Override");
    gold.append("\n      public void update(JsonStreamWriter __writer) {");
    gold.append("\n        __state.show(__self, PrivateLazyDeltaWriter.bind(__who, __writer));");
    gold.append("\n      }");
    gold.append("\n    };");
    gold.append("\n  }");
    gold.append("\n  private static class RTxM implements NtMessageBase {");
    gold.append("\n    private int x = 0;");
    gold.append("\n    private int y = 0;");
    gold.append("\n    private RTxM(JsonStreamReader __reader) {");
    gold.append("\n      if (__reader.startObject()) {");
    gold.append("\n        while (__reader.notEndOfObject()) {");
    gold.append("\n          String __fieldName = __reader.fieldName();");
    gold.append("\n          switch (__fieldName) {");
    gold.append("\n            case \"x\":");
    gold.append("\n              this.x = __reader.readInteger();");
    gold.append("\n              break;");
    gold.append("\n            case \"y\":");
    gold.append("\n              this.y = __reader.readInteger();");
    gold.append("\n              break;");
    gold.append("\n            default:");
    gold.append("\n              __reader.skipValue();");
    gold.append("\n          }");
    gold.append("\n        }");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n    @Override");
    gold.append("\n    public void __writeOut(JsonStreamWriter __writer) {");
    gold.append("\n      __writer.beginObject();");
    gold.append("\n      __writer.writeObjectFieldIntro(\"x\");");
    gold.append("\n      __writer.writeInteger(x);");
    gold.append("\n      __writer.writeObjectFieldIntro(\"y\");");
    gold.append("\n      __writer.writeInteger(y);");
    gold.append("\n      __writer.endObject();");
    gold.append("\n    }");
    gold.append("\n    private RTxM() {}");
    gold.append("\n    private RTxM(int x, int y) {");
    gold.append("\n      this.x = x;");
    gold.append("\n      this.y = y;");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  private class DeltaRTxM {");
    gold.append("\n    private DInt32 __dx;");
    gold.append("\n    private DInt32 __dy;");
    gold.append("\n    private boolean __emitted;");
    gold.append("\n    private DeltaRTxM() {");
    gold.append("\n      __dx = new DInt32();");
    gold.append("\n      __dy = new DInt32();");
    gold.append("\n      __emitted = false;");
    gold.append("\n    }");
    gold.append("\n    public void show(RTxM __item, PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      __code_cost += 2;");
    gold.append("\n      PrivateLazyDeltaWriter __obj = __writer.planObject();");
    gold.append("\n      __dx.show(__item.x, __obj.planField(\"x\"));");
    gold.append("\n      __dy.show(__item.y, __obj.planField(\"y\"));");
    gold.append("\n      if (__obj.end()) {");
    gold.append("\n        __emitted = true;");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n    public void hide(PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      if (__emitted) {");
    gold.append("\n        __emitted = false;");
    gold.append("\n        __writer.writeNull();");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  private RTxM __FUNC_0_foo1() {");
    gold.append("\n    __code_cost += 2;");
    gold.append("\n    __track(0);");
    gold.append("\n    return new RTxM(1, 0);");
    gold.append("\n  }");
    gold.append("\n  private RTxM __FUNC_1_foo2(boolean b) {");
    gold.append("\n    __code_cost += 2;");
    gold.append("\n    __track(0);");
    gold.append("\n    return (b ? new RTxM(1, 0) : new RTxM(0, 2));");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __route(AsyncTask task) {");
    gold.append("\n    return;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected Object __parse_message2(String channel, JsonStreamReader __reader) {");
    gold.append("\n    __reader.skipValue();");
    gold.append("\n    return NtMessageBase.NULL;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __reset_future_queues() {");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __invoke_label(String __new_state) {}");
    gold.append("\n  @Override");
    gold.append("\n  public boolean __onConnected(NtClient __cvalue) {");
    gold.append("\n    boolean __result = false;");
    gold.append("\n    return __result;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __onDisconnected(NtClient __cvalue) {}");
    gold.append("\n  @Override");
    gold.append("\n  public String[] __getTests() {");
    gold.append("\n    return new String[] {};");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __test(TestReportBuilder report, String testName) {}");
    gold.append("\n  @Override");
    gold.append("\n  protected void __construct_intern(NtClient who, NtMessageBase message) {}");
    gold.append("\n  @Override");
    gold.append("\n  protected NtMessageBase __parse_construct_arg(JsonStreamReader __reader) {");
    gold.append("\n    __reader.skipValue();");
    gold.append("\n    return NtMessageBase.NULL;");
    gold.append("\n  }");
    gold.append("\n  /* end of file */");
    gold.append("\n}");
    gold.append("\n");
    gold.append("\n--JAVA COMPILE RESULTS-----------------------------");
    gold.append("\n--JAVA RUNNING-------------------------------------");
    gold.append("\n{\"command\":\"construct\",\"timestamp\":\"0\",\"who\":{\"agent\":\"?\",\"authority\":\"?\"},\"arg\":{},\"entropy\":\"0\"}-->{\"__constructed\":true,\"__entropy\":\"0\"} need:true in:0");
    gold.append("\nNO_ONE was DENIED:5011");
    gold.append("\nRANDO was DENIED:5011");
    gold.append("\n+ NO_ONE DELTA:{\"data\":{},\"outstanding\":[],\"blockers\":[],\"seq\":1}");
    gold.append("\n+ RANDO DELTA:{\"data\":{},\"outstanding\":[],\"blockers\":[],\"seq\":1}");
    gold.append("\n{\"command\":\"invalidate\",\"timestamp\":\"25\"}-->{\"__messages\":null,\"__seq\":1,\"__entropy\":\"-4962768465676381896\",\"__time\":\"25\"} need:false in:-25");
    gold.append("\n{\"command\":\"bill\",\"timestamp\":\"50\"}-->{\"__goodwill_used\":0,\"__cost\":0,\"__billing_seq\":1} need:true in:0");
    gold.append("\n--JAVA RESULTS-------------------------------------");
    gold.append("\n{\"__constructed\":true,\"__entropy\":\"-4962768465676381896\",\"__seq\":1,\"__time\":\"25\",\"__goodwill_used\":0,\"__cost\":0,\"__billing_seq\":1}");
    gold.append("\n--DUMP RESULTS-------------------------------------");
    gold.append("\n{\"__state\":\"\",\"__constructed\":true,\"__next_time\":\"0\",\"__blocked\":false,\"__seq\":1,\"__entropy\":\"-4962768465676381896\",\"__auto_future_id\":0,\"__connection_id\":0,\"__message_id\":0,\"__time\":\"50\"}");
    gold.append("\n{\"__state\":\"\",\"__constructed\":true,\"__next_time\":\"0\",\"__blocked\":false,\"__seq\":1,\"__entropy\":\"-4962768465676381896\",\"__auto_future_id\":0,\"__connection_id\":0,\"__message_id\":0,\"__time\":\"50\"}");
    gold.append("\n--JAVA TEST RESULTS--------------------------------");
    gold.append("\n");
    gold.append("\nSuccess");
    assertStable(live, gold);
  }
  private String cached_BadArgType_5 = null;
  private String get_BadArgType_5() {
    if (cached_BadArgType_5 != null) {
      return cached_BadArgType_5;
    }
    cached_BadArgType_5 = generateTestOutput(false, "BadArgType_5", "./test_code/Functions_BadArgType_failure.a");
    return cached_BadArgType_5;
  }

  @Test
  public void testBadArgTypeFailure() {
    assertLiveFail(get_BadArgType_5());
  }

  @Test
  public void testBadArgTypeNotTerribleLineNumbers() {
    assertNotTerribleLineNumbers(get_BadArgType_5());
  }

  @Test
  public void testBadArgTypeExceptionFree() {
    assertExceptionFree(get_BadArgType_5());
  }

  @Test
  public void testBadArgTypeTODOFree() {
    assertTODOFree(get_BadArgType_5());
  }

  @Test
  public void stable_BadArgType_5() {
    String live = get_BadArgType_5();
    StringBuilder gold = new StringBuilder();
    gold.append("Path:Functions_BadArgType_failure.a");
    gold.append("\n--ISSUES-------------------------------------------");
    gold.append("\n[ {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 0,");
    gold.append("\n      \"character\" : 22");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 0,");
    gold.append("\n      \"character\" : 25");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"Type check failure: the type 'int' is unable to store type 'string'. (TypeCheckReferences)\"");
    gold.append("\n} ]");
    gold.append("\n--JAVA---------------------------------------------");
    gold.append("\n");
    gold.append("\nFailedValidation");
    assertStable(live, gold);
  }
  private String cached_Happy_6 = null;
  private String get_Happy_6() {
    if (cached_Happy_6 != null) {
      return cached_Happy_6;
    }
    cached_Happy_6 = generateTestOutput(true, "Happy_6", "./test_code/Functions_Happy_success.a");
    return cached_Happy_6;
  }

  @Test
  public void testHappyEmission() {
    assertEmissionGood(get_Happy_6());
  }

  @Test
  public void testHappySuccess() {
    assertLivePass(get_Happy_6());
  }

  @Test
  public void testHappyGoodWillHappy() {
    assertGoodWillHappy(get_Happy_6());
  }

  @Test
  public void testHappyExceptionFree() {
    assertExceptionFree(get_Happy_6());
  }

  @Test
  public void testHappyTODOFree() {
    assertTODOFree(get_Happy_6());
  }

  @Test
  public void stable_Happy_6() {
    String live = get_Happy_6();
    StringBuilder gold = new StringBuilder();
    gold.append("Path:Functions_Happy_success.a");
    gold.append("\n--EMISSION-----------------------------------------");
    gold.append("\nEmission Success, Yay");
    gold.append("\n--ISSUES-------------------------------------------");
    gold.append("\n[ ]");
    gold.append("\n--JAVA---------------------------------------------");
    gold.append("\nimport com.fasterxml.jackson.databind.JsonNode;");
    gold.append("\nimport com.fasterxml.jackson.databind.node.ArrayNode;");
    gold.append("\nimport com.fasterxml.jackson.databind.node.ObjectNode;");
    gold.append("\nimport org.adamalang.runtime.*;");
    gold.append("\nimport org.adamalang.runtime.async.*;");
    gold.append("\nimport org.adamalang.runtime.contracts.*;");
    gold.append("\nimport org.adamalang.runtime.delta.*;");
    gold.append("\nimport org.adamalang.runtime.exceptions.*;");
    gold.append("\nimport org.adamalang.runtime.index.*;");
    gold.append("\nimport org.adamalang.runtime.json.*;");
    gold.append("\nimport org.adamalang.runtime.natives.*;");
    gold.append("\nimport org.adamalang.runtime.natives.lists.*;");
    gold.append("\nimport org.adamalang.runtime.ops.*;");
    gold.append("\nimport org.adamalang.runtime.reactives.*;");
    gold.append("\nimport org.adamalang.runtime.stdlib.*;");
    gold.append("\nimport java.util.function.Consumer;");
    gold.append("\nimport java.util.function.Function;");
    gold.append("\nimport java.util.ArrayList;");
    gold.append("\nimport java.util.Comparator;");
    gold.append("\nimport java.util.Map;");
    gold.append("\nimport java.lang.Math;");
    gold.append("\npublic class Happy_6 extends LivingDocument {");
    gold.append("\n  private final RxInt32 z;");
    gold.append("\n  private final RxInt32 cc;");
    gold.append("\n  public Happy_6(DocumentMonitor __monitor) {");
    gold.append("\n    super(__monitor);");
    gold.append("\n    z = new RxInt32(this, 0);");
    gold.append("\n    cc = new RxInt32(this, 0);");
    gold.append("\n    __goodwillBudget = 100000;");
    gold.append("\n    __goodwillLimitOfBudget = 100000;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __insert(JsonStreamReader __reader) {");
    gold.append("\n    if (__reader.startObject()) {");
    gold.append("\n      while(__reader.notEndOfObject()) {");
    gold.append("\n        String __fieldName = __reader.fieldName();");
    gold.append("\n        switch (__fieldName) {");
    gold.append("\n          case \"z\":");
    gold.append("\n            z.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"cc\":");
    gold.append("\n            cc.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__state\":");
    gold.append("\n            __state.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__constructed\":");
    gold.append("\n            __constructed.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__next_time\":");
    gold.append("\n            __next_time.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__blocked\":");
    gold.append("\n            __blocked.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__seq\":");
    gold.append("\n            __seq.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__entropy\":");
    gold.append("\n            __entropy.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__auto_future_id\":");
    gold.append("\n            __auto_future_id.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__connection_id\":");
    gold.append("\n            __connection_id.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__message_id\":");
    gold.append("\n            __message_id.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__time\":");
    gold.append("\n            __time.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__clients\":");
    gold.append("\n            __hydrateClients(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__messages\":");
    gold.append("\n            __hydrateMessages(__reader);");
    gold.append("\n            break;");
    gold.append("\n          default:");
    gold.append("\n            __reader.skipValue();");
    gold.append("\n        }");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __dump(JsonStreamWriter __writer) {");
    gold.append("\n    __writer.beginObject();");
    gold.append("\n    __writer.writeObjectFieldIntro(\"z\");");
    gold.append("\n    z.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"cc\");");
    gold.append("\n    cc.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__state\");");
    gold.append("\n    __state.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__constructed\");");
    gold.append("\n    __constructed.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__next_time\");");
    gold.append("\n    __next_time.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__blocked\");");
    gold.append("\n    __blocked.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__seq\");");
    gold.append("\n    __seq.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__entropy\");");
    gold.append("\n    __entropy.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__auto_future_id\");");
    gold.append("\n    __auto_future_id.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__connection_id\");");
    gold.append("\n    __connection_id.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__message_id\");");
    gold.append("\n    __message_id.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__time\");");
    gold.append("\n    __time.__dump(__writer);");
    gold.append("\n    __dumpClients(__writer);");
    gold.append("\n    __dumpMessages(__writer);");
    gold.append("\n    __writer.endObject();");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __commit(String __name, JsonStreamWriter __forward, JsonStreamWriter __reverse) {");
    gold.append("\n    __state.__commit(\"__state\", __forward, __reverse);");
    gold.append("\n    __constructed.__commit(\"__constructed\", __forward, __reverse);");
    gold.append("\n    __next_time.__commit(\"__next_time\", __forward, __reverse);");
    gold.append("\n    __blocked.__commit(\"__blocked\", __forward, __reverse);");
    gold.append("\n    __seq.__commit(\"__seq\", __forward, __reverse);");
    gold.append("\n    __entropy.__commit(\"__entropy\", __forward, __reverse);");
    gold.append("\n    __auto_future_id.__commit(\"__auto_future_id\", __forward, __reverse);");
    gold.append("\n    __connection_id.__commit(\"__connection_id\", __forward, __reverse);");
    gold.append("\n    __message_id.__commit(\"__message_id\", __forward, __reverse);");
    gold.append("\n    __time.__commit(\"__time\", __forward, __reverse);");
    gold.append("\n    z.__commit(\"z\", __forward, __reverse);");
    gold.append("\n    cc.__commit(\"cc\", __forward, __reverse);");
    gold.append("\n    /* root */");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __revert() {");
    gold.append("\n    __state.__revert();");
    gold.append("\n    __constructed.__revert();");
    gold.append("\n    __next_time.__revert();");
    gold.append("\n    __blocked.__revert();");
    gold.append("\n    __seq.__revert();");
    gold.append("\n    __entropy.__revert();");
    gold.append("\n    __auto_future_id.__revert();");
    gold.append("\n    __connection_id.__revert();");
    gold.append("\n    __message_id.__revert();");
    gold.append("\n    __time.__revert();");
    gold.append("\n    z.__revert();");
    gold.append("\n    cc.__revert();");
    gold.append("\n    /* root */");
    gold.append("\n  }");
    gold.append("\n  private class DeltaHappy_6 {");
    gold.append("\n    private boolean __emitted;");
    gold.append("\n    private DeltaHappy_6() {");
    gold.append("\n      __emitted = false;");
    gold.append("\n    }");
    gold.append("\n    public void show(Happy_6 __item, PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      PrivateLazyDeltaWriter __obj = __writer.planObject();");
    gold.append("\n      __obj.manifest();");
    gold.append("\n      if (__obj.end()) {");
    gold.append("\n        __emitted = true;");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n    public void hide(PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      if (__emitted) {");
    gold.append("\n        __emitted = false;");
    gold.append("\n        __writer.writeNull();");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public PrivateView __createPrivateView(NtClient __who, Consumer<String> __updates) {");
    gold.append("\n    Happy_6 __self = this;");
    gold.append("\n    DeltaHappy_6 __state = new DeltaHappy_6();");
    gold.append("\n    return new PrivateView(__who, __updates) {");
    gold.append("\n      @Override");
    gold.append("\n      public void update(JsonStreamWriter __writer) {");
    gold.append("\n        __state.show(__self, PrivateLazyDeltaWriter.bind(__who, __writer));");
    gold.append("\n      }");
    gold.append("\n    };");
    gold.append("\n  }");
    gold.append("\n  private int __FUNC_0_square_proc(int x) {");
    gold.append("\n    __code_cost += 2;");
    gold.append("\n    __track(0);");
    gold.append("\n    return x * x;");
    gold.append("\n  }");
    gold.append("\n  private int __FUNC_1_square_func(int x) {");
    gold.append("\n    __code_cost += 2;");
    gold.append("\n    __track(0);");
    gold.append("\n    return x * x;");
    gold.append("\n  }");
    gold.append("\n  private int __FUNC_2_mult_func(int x, int y) {");
    gold.append("\n    __code_cost += 2;");
    gold.append("\n    __track(0);");
    gold.append("\n    return x * y;");
    gold.append("\n  }");
    gold.append("\n  private int __FUNC_3_pos_cube_func(int x) {");
    gold.append("\n    __code_cost += 2;");
    gold.append("\n    __track(0);");
    gold.append("\n    if (x > 0) {");
    gold.append("\n      __code_cost += 2;");
    gold.append("\n      __track(1);");
    gold.append("\n      return x * x * x;");
    gold.append("\n    } else {");
    gold.append("\n      __code_cost += 2;");
    gold.append("\n      __track(2);");
    gold.append("\n      return -x * x * x;");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __route(AsyncTask task) {");
    gold.append("\n    return;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected Object __parse_message2(String channel, JsonStreamReader __reader) {");
    gold.append("\n    __reader.skipValue();");
    gold.append("\n    return NtMessageBase.NULL;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __reset_future_queues() {");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __invoke_label(String __new_state) {}");
    gold.append("\n  @Override");
    gold.append("\n  public boolean __onConnected(NtClient __cvalue) {");
    gold.append("\n    boolean __result = false;");
    gold.append("\n    return __result;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __onDisconnected(NtClient __cvalue) {}");
    gold.append("\n  @Override");
    gold.append("\n  public String[] __getTests() {");
    gold.append("\n    return new String[] {};");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __test(TestReportBuilder report, String testName) {}");
    gold.append("\n  private void __construct_0(NtClient __who, NtMessageBase __object) {");
    gold.append("\n    __code_cost += 5;");
    gold.append("\n    __track(1);");
    gold.append("\n    z.set(__FUNC_0_square_proc(42));");
    gold.append("\n    __track(2);");
    gold.append("\n    int x = __FUNC_1_square_func(z.get());");
    gold.append("\n    __track(3);");
    gold.append("\n    int cube = __FUNC_3_pos_cube_func(x);");
    gold.append("\n    __track(4);");
    gold.append("\n    cc.set(__FUNC_2_mult_func(x, cube));");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected NtMessageBase __parse_construct_arg(JsonStreamReader __reader) {");
    gold.append("\n    __reader.skipValue();");
    gold.append("\n    return NtMessageBase.NULL;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __construct_intern(NtClient __who, NtMessageBase __object) {");
    gold.append("\n    __construct_0(__who, __object);");
    gold.append("\n  }");
    gold.append("\n  /* end of file */");
    gold.append("\n}");
    gold.append("\n");
    gold.append("\n--JAVA COMPILE RESULTS-----------------------------");
    gold.append("\n--JAVA RUNNING-------------------------------------");
    gold.append("\n{\"command\":\"construct\",\"timestamp\":\"0\",\"who\":{\"agent\":\"?\",\"authority\":\"?\"},\"arg\":{},\"entropy\":\"0\"}-->{\"__constructed\":true,\"__entropy\":\"0\",\"z\":1764,\"cc\":885063680} need:true in:0");
    gold.append("\nNO_ONE was DENIED:5011");
    gold.append("\nRANDO was DENIED:5011");
    gold.append("\n+ NO_ONE DELTA:{\"data\":{},\"outstanding\":[],\"blockers\":[],\"seq\":1}");
    gold.append("\n+ RANDO DELTA:{\"data\":{},\"outstanding\":[],\"blockers\":[],\"seq\":1}");
    gold.append("\n{\"command\":\"invalidate\",\"timestamp\":\"25\"}-->{\"__messages\":null,\"__seq\":1,\"__entropy\":\"-4962768465676381896\",\"__time\":\"25\"} need:false in:-25");
    gold.append("\n{\"command\":\"bill\",\"timestamp\":\"50\"}-->{\"__goodwill_used\":0,\"__cost\":15,\"__billing_seq\":1} need:true in:0");
    gold.append("\n--JAVA RESULTS-------------------------------------");
    gold.append("\n{\"__constructed\":true,\"__entropy\":\"-4962768465676381896\",\"z\":1764,\"cc\":885063680,\"__seq\":1,\"__time\":\"25\",\"__goodwill_used\":0,\"__cost\":15,\"__billing_seq\":1}");
    gold.append("\n--DUMP RESULTS-------------------------------------");
    gold.append("\n{\"z\":1764,\"cc\":885063680,\"__state\":\"\",\"__constructed\":true,\"__next_time\":\"0\",\"__blocked\":false,\"__seq\":1,\"__entropy\":\"-4962768465676381896\",\"__auto_future_id\":0,\"__connection_id\":0,\"__message_id\":0,\"__time\":\"50\"}");
    gold.append("\n{\"z\":1764,\"cc\":885063680,\"__state\":\"\",\"__constructed\":true,\"__next_time\":\"0\",\"__blocked\":false,\"__seq\":1,\"__entropy\":\"-4962768465676381896\",\"__auto_future_id\":0,\"__connection_id\":0,\"__message_id\":0,\"__time\":\"50\"}");
    gold.append("\n--JAVA TEST RESULTS--------------------------------");
    gold.append("\n");
    gold.append("\nSuccess");
    assertStable(live, gold);
  }
  private String cached_IncompatibleReturnValue_7 = null;
  private String get_IncompatibleReturnValue_7() {
    if (cached_IncompatibleReturnValue_7 != null) {
      return cached_IncompatibleReturnValue_7;
    }
    cached_IncompatibleReturnValue_7 = generateTestOutput(false, "IncompatibleReturnValue_7", "./test_code/Functions_IncompatibleReturnValue_failure.a");
    return cached_IncompatibleReturnValue_7;
  }

  @Test
  public void testIncompatibleReturnValueFailure() {
    assertLiveFail(get_IncompatibleReturnValue_7());
  }

  @Test
  public void testIncompatibleReturnValueNotTerribleLineNumbers() {
    assertNotTerribleLineNumbers(get_IncompatibleReturnValue_7());
  }

  @Test
  public void testIncompatibleReturnValueExceptionFree() {
    assertExceptionFree(get_IncompatibleReturnValue_7());
  }

  @Test
  public void testIncompatibleReturnValueTODOFree() {
    assertTODOFree(get_IncompatibleReturnValue_7());
  }

  @Test
  public void stable_IncompatibleReturnValue_7() {
    String live = get_IncompatibleReturnValue_7();
    StringBuilder gold = new StringBuilder();
    gold.append("Path:Functions_IncompatibleReturnValue_failure.a");
    gold.append("\n--ISSUES-------------------------------------------");
    gold.append("\n[ {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 0,");
    gold.append("\n      \"character\" : 31");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 0,");
    gold.append("\n      \"character\" : 34");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"Type check failure: the type 'int' is unable to store type 'string'. (TypeCheckReferences)\"");
    gold.append("\n}, {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 0,");
    gold.append("\n      \"character\" : 0");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 2,");
    gold.append("\n      \"character\" : 1");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"The function 'square_func' does not return in all cases (FunctionDefine)\"");
    gold.append("\n} ]");
    gold.append("\n--JAVA---------------------------------------------");
    gold.append("\n");
    gold.append("\nFailedValidation");
    assertStable(live, gold);
  }
  private String cached_LookupFailures_8 = null;
  private String get_LookupFailures_8() {
    if (cached_LookupFailures_8 != null) {
      return cached_LookupFailures_8;
    }
    cached_LookupFailures_8 = generateTestOutput(false, "LookupFailures_8", "./test_code/Functions_LookupFailures_failure.a");
    return cached_LookupFailures_8;
  }

  @Test
  public void testLookupFailuresFailure() {
    assertLiveFail(get_LookupFailures_8());
  }

  @Test
  public void testLookupFailuresNotTerribleLineNumbers() {
    assertNotTerribleLineNumbers(get_LookupFailures_8());
  }

  @Test
  public void testLookupFailuresExceptionFree() {
    assertExceptionFree(get_LookupFailures_8());
  }

  @Test
  public void testLookupFailuresTODOFree() {
    assertTODOFree(get_LookupFailures_8());
  }

  @Test
  public void stable_LookupFailures_8() {
    String live = get_LookupFailures_8();
    StringBuilder gold = new StringBuilder();
    gold.append("Path:Functions_LookupFailures_failure.a");
    gold.append("\n--ISSUES-------------------------------------------");
    gold.append("\n[ {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 15,");
    gold.append("\n      \"character\" : 2");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 15,");
    gold.append("\n      \"character\" : 7");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"Type check failure: The given type was expected to be a function: 'label' (RuleSetFunctions)\"");
    gold.append("\n}, {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 15,");
    gold.append("\n      \"character\" : 2");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 15,");
    gold.append("\n      \"character\" : 7");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"Expression is not a function (FunctionInvoke)\"");
    gold.append("\n}, {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 16,");
    gold.append("\n      \"character\" : 2");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 16,");
    gold.append("\n      \"character\" : 8");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"Record 'R' lacks field 'nope' (FieldLookup)\"");
    gold.append("\n}, {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 16,");
    gold.append("\n      \"character\" : 2");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 16,");
    gold.append("\n      \"character\" : 8");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"Expression is not a function (FunctionInvoke)\"");
    gold.append("\n}, {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 18,");
    gold.append("\n      \"character\" : 11");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 18,");
    gold.append("\n      \"character\" : 17");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"Record 'R' lacks field 'nope' (FieldLookup)\"");
    gold.append("\n}, {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 18,");
    gold.append("\n      \"character\" : 11");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 18,");
    gold.append("\n      \"character\" : 17");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"Expression is not a function (FunctionInvoke)\"");
    gold.append("\n}, {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 19,");
    gold.append("\n      \"character\" : 11");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 19,");
    gold.append("\n      \"character\" : 19");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"Record 'channel<M>' lacks field 'nope' (FieldLookup)\"");
    gold.append("\n}, {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 19,");
    gold.append("\n      \"character\" : 11");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 19,");
    gold.append("\n      \"character\" : 19");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"Expression is not a function (FunctionInvoke)\"");
    gold.append("\n}, {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 20,");
    gold.append("\n      \"character\" : 11");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 20,");
    gold.append("\n      \"character\" : 23");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"Record 'client' lacks field 'nope' (FieldLookup)\"");
    gold.append("\n}, {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 20,");
    gold.append("\n      \"character\" : 11");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 20,");
    gold.append("\n      \"character\" : 23");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"Expression is not a function (FunctionInvoke)\"");
    gold.append("\n}, {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 21,");
    gold.append("\n      \"character\" : 11");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 21,");
    gold.append("\n      \"character\" : 22");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"Record 'E' lacks field 'nope' (FieldLookup)\"");
    gold.append("\n}, {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 21,");
    gold.append("\n      \"character\" : 11");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 21,");
    gold.append("\n      \"character\" : 22");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"Expression is not a function (FunctionInvoke)\"");
    gold.append("\n}, {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 22,");
    gold.append("\n      \"character\" : 11");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 22,");
    gold.append("\n      \"character\" : 23");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"Record 'E[]' lacks field 'nope' (FieldLookup)\"");
    gold.append("\n}, {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 22,");
    gold.append("\n      \"character\" : 11");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 22,");
    gold.append("\n      \"character\" : 23");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"Expression is not a function (FunctionInvoke)\"");
    gold.append("\n}, {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 24,");
    gold.append("\n      \"character\" : 11");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 24,");
    gold.append("\n      \"character\" : 18");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"Record 'future<M>' lacks field 'nope' (FieldLookup)\"");
    gold.append("\n}, {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 24,");
    gold.append("\n      \"character\" : 11");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 24,");
    gold.append("\n      \"character\" : 18");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"Expression is not a function (FunctionInvoke)\"");
    gold.append("\n}, {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 25,");
    gold.append("\n      \"character\" : 11");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 25,");
    gold.append("\n      \"character\" : 26");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"Record 'maybe<int>' lacks field 'nope' (FieldLookup)\"");
    gold.append("\n}, {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 25,");
    gold.append("\n      \"character\" : 11");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 25,");
    gold.append("\n      \"character\" : 26");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"Expression is not a function (FunctionInvoke)\"");
    gold.append("\n}, {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 27,");
    gold.append("\n      \"character\" : 11");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 27,");
    gold.append("\n      \"character\" : 21");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"Record 'list<M>' lacks field 'nope' (FieldLookup)\"");
    gold.append("\n}, {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 27,");
    gold.append("\n      \"character\" : 11");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 27,");
    gold.append("\n      \"character\" : 21");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"Expression is not a function (FunctionInvoke)\"");
    gold.append("\n}, {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 42,");
    gold.append("\n      \"character\" : 11");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 42,");
    gold.append("\n      \"character\" : 18");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"Record 'bool' lacks field 'nope' (FieldLookup)\"");
    gold.append("\n}, {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 42,");
    gold.append("\n      \"character\" : 11");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 42,");
    gold.append("\n      \"character\" : 18");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"Expression is not a function (FunctionInvoke)\"");
    gold.append("\n}, {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 43,");
    gold.append("\n      \"character\" : 11");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 43,");
    gold.append("\n      \"character\" : 18");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"Record 'client' lacks field 'nope' (FieldLookup)\"");
    gold.append("\n}, {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 43,");
    gold.append("\n      \"character\" : 11");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 43,");
    gold.append("\n      \"character\" : 18");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"Expression is not a function (FunctionInvoke)\"");
    gold.append("\n}, {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 44,");
    gold.append("\n      \"character\" : 11");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 44,");
    gold.append("\n      \"character\" : 18");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"Record 'double' lacks field 'nope' (FieldLookup)\"");
    gold.append("\n}, {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 44,");
    gold.append("\n      \"character\" : 11");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 44,");
    gold.append("\n      \"character\" : 18");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"Expression is not a function (FunctionInvoke)\"");
    gold.append("\n}, {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 45,");
    gold.append("\n      \"character\" : 11");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 45,");
    gold.append("\n      \"character\" : 18");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"Record 'E' lacks field 'nope' (FieldLookup)\"");
    gold.append("\n}, {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 45,");
    gold.append("\n      \"character\" : 11");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 45,");
    gold.append("\n      \"character\" : 18");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"Expression is not a function (FunctionInvoke)\"");
    gold.append("\n}, {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 46,");
    gold.append("\n      \"character\" : 11");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 46,");
    gold.append("\n      \"character\" : 18");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"Record 'int' lacks field 'nope' (FieldLookup)\"");
    gold.append("\n}, {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 46,");
    gold.append("\n      \"character\" : 11");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 46,");
    gold.append("\n      \"character\" : 18");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"Expression is not a function (FunctionInvoke)\"");
    gold.append("\n}, {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 47,");
    gold.append("\n      \"character\" : 11");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 47,");
    gold.append("\n      \"character\" : 18");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"Record 'double' lacks field 'nope' (FieldLookup)\"");
    gold.append("\n}, {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 47,");
    gold.append("\n      \"character\" : 11");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 47,");
    gold.append("\n      \"character\" : 18");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"Expression is not a function (FunctionInvoke)\"");
    gold.append("\n}, {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 48,");
    gold.append("\n      \"character\" : 11");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 48,");
    gold.append("\n      \"character\" : 19");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"Record 'maybe<int>' lacks field 'nope' (FieldLookup)\"");
    gold.append("\n}, {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 48,");
    gold.append("\n      \"character\" : 11");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 48,");
    gold.append("\n      \"character\" : 19");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"Expression is not a function (FunctionInvoke)\"");
    gold.append("\n}, {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 49,");
    gold.append("\n      \"character\" : 11");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 49,");
    gold.append("\n      \"character\" : 17");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"Record 'R' lacks field 'nope' (FieldLookup)\"");
    gold.append("\n}, {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 49,");
    gold.append("\n      \"character\" : 11");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 49,");
    gold.append("\n      \"character\" : 17");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"Expression is not a function (FunctionInvoke)\"");
    gold.append("\n}, {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 50,");
    gold.append("\n      \"character\" : 11");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 50,");
    gold.append("\n      \"character\" : 18");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"Record 'label' lacks field 'nope' (FieldLookup)\"");
    gold.append("\n}, {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 50,");
    gold.append("\n      \"character\" : 11");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 50,");
    gold.append("\n      \"character\" : 18");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"Expression is not a function (FunctionInvoke)\"");
    gold.append("\n}, {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 51,");
    gold.append("\n      \"character\" : 11");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 51,");
    gold.append("\n      \"character\" : 18");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"Record 'string' lacks field 'nope' (FieldLookup)\"");
    gold.append("\n}, {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 51,");
    gold.append("\n      \"character\" : 11");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 51,");
    gold.append("\n      \"character\" : 18");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"Expression is not a function (FunctionInvoke)\"");
    gold.append("\n}, {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 52,");
    gold.append("\n      \"character\" : 12");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 52,");
    gold.append("\n      \"character\" : 20");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"Record 'table<R>' lacks field 'nope' (FieldLookup)\"");
    gold.append("\n}, {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 52,");
    gold.append("\n      \"character\" : 12");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 52,");
    gold.append("\n      \"character\" : 20");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"Expression is not a function (FunctionInvoke)\"");
    gold.append("\n} ]");
    gold.append("\n--JAVA---------------------------------------------");
    gold.append("\n");
    gold.append("\nFailedValidation");
    assertStable(live, gold);
  }
  private String cached_MethodsOnLists_9 = null;
  private String get_MethodsOnLists_9() {
    if (cached_MethodsOnLists_9 != null) {
      return cached_MethodsOnLists_9;
    }
    cached_MethodsOnLists_9 = generateTestOutput(true, "MethodsOnLists_9", "./test_code/Functions_MethodsOnLists_success.a");
    return cached_MethodsOnLists_9;
  }

  @Test
  public void testMethodsOnListsEmission() {
    assertEmissionGood(get_MethodsOnLists_9());
  }

  @Test
  public void testMethodsOnListsSuccess() {
    assertLivePass(get_MethodsOnLists_9());
  }

  @Test
  public void testMethodsOnListsGoodWillHappy() {
    assertGoodWillHappy(get_MethodsOnLists_9());
  }

  @Test
  public void testMethodsOnListsExceptionFree() {
    assertExceptionFree(get_MethodsOnLists_9());
  }

  @Test
  public void testMethodsOnListsTODOFree() {
    assertTODOFree(get_MethodsOnLists_9());
  }

  @Test
  public void stable_MethodsOnLists_9() {
    String live = get_MethodsOnLists_9();
    StringBuilder gold = new StringBuilder();
    gold.append("Path:Functions_MethodsOnLists_success.a");
    gold.append("\n--EMISSION-----------------------------------------");
    gold.append("\nEmission Success, Yay");
    gold.append("\n--ISSUES-------------------------------------------");
    gold.append("\n[ ]");
    gold.append("\n--JAVA---------------------------------------------");
    gold.append("\nimport com.fasterxml.jackson.databind.JsonNode;");
    gold.append("\nimport com.fasterxml.jackson.databind.node.ArrayNode;");
    gold.append("\nimport com.fasterxml.jackson.databind.node.ObjectNode;");
    gold.append("\nimport org.adamalang.runtime.*;");
    gold.append("\nimport org.adamalang.runtime.async.*;");
    gold.append("\nimport org.adamalang.runtime.contracts.*;");
    gold.append("\nimport org.adamalang.runtime.delta.*;");
    gold.append("\nimport org.adamalang.runtime.exceptions.*;");
    gold.append("\nimport org.adamalang.runtime.index.*;");
    gold.append("\nimport org.adamalang.runtime.json.*;");
    gold.append("\nimport org.adamalang.runtime.natives.*;");
    gold.append("\nimport org.adamalang.runtime.natives.lists.*;");
    gold.append("\nimport org.adamalang.runtime.ops.*;");
    gold.append("\nimport org.adamalang.runtime.reactives.*;");
    gold.append("\nimport org.adamalang.runtime.stdlib.*;");
    gold.append("\nimport java.util.function.Consumer;");
    gold.append("\nimport java.util.function.Function;");
    gold.append("\nimport java.util.ArrayList;");
    gold.append("\nimport java.util.Comparator;");
    gold.append("\nimport java.util.Map;");
    gold.append("\nimport java.lang.Math;");
    gold.append("\npublic class MethodsOnLists_9 extends LivingDocument {");
    gold.append("\n  private final RxTable<RTxX> t;");
    gold.append("\n  private final RxInt32 value;");
    gold.append("\n  private final RxInt32 value5;");
    gold.append("\n  private final RxInt32 v2;");
    gold.append("\n  public MethodsOnLists_9(DocumentMonitor __monitor) {");
    gold.append("\n    super(__monitor);");
    gold.append("\n    t = new RxTable<>(__self, this, \"t\", (RxParent __parent) -> new RTxX(__parent), 0);");
    gold.append("\n    value = new RxInt32(this, 0);");
    gold.append("\n    value5 = new RxInt32(this, 0);");
    gold.append("\n    v2 = new RxInt32(this, 0);");
    gold.append("\n    __goodwillBudget = 100000;");
    gold.append("\n    __goodwillLimitOfBudget = 100000;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __insert(JsonStreamReader __reader) {");
    gold.append("\n    if (__reader.startObject()) {");
    gold.append("\n      while(__reader.notEndOfObject()) {");
    gold.append("\n        String __fieldName = __reader.fieldName();");
    gold.append("\n        switch (__fieldName) {");
    gold.append("\n          case \"t\":");
    gold.append("\n            t.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"value\":");
    gold.append("\n            value.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"value5\":");
    gold.append("\n            value5.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"v2\":");
    gold.append("\n            v2.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__state\":");
    gold.append("\n            __state.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__constructed\":");
    gold.append("\n            __constructed.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__next_time\":");
    gold.append("\n            __next_time.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__blocked\":");
    gold.append("\n            __blocked.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__seq\":");
    gold.append("\n            __seq.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__entropy\":");
    gold.append("\n            __entropy.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__auto_future_id\":");
    gold.append("\n            __auto_future_id.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__connection_id\":");
    gold.append("\n            __connection_id.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__message_id\":");
    gold.append("\n            __message_id.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__time\":");
    gold.append("\n            __time.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__clients\":");
    gold.append("\n            __hydrateClients(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__messages\":");
    gold.append("\n            __hydrateMessages(__reader);");
    gold.append("\n            break;");
    gold.append("\n          default:");
    gold.append("\n            __reader.skipValue();");
    gold.append("\n        }");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __dump(JsonStreamWriter __writer) {");
    gold.append("\n    __writer.beginObject();");
    gold.append("\n    __writer.writeObjectFieldIntro(\"t\");");
    gold.append("\n    t.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"value\");");
    gold.append("\n    value.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"value5\");");
    gold.append("\n    value5.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"v2\");");
    gold.append("\n    v2.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__state\");");
    gold.append("\n    __state.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__constructed\");");
    gold.append("\n    __constructed.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__next_time\");");
    gold.append("\n    __next_time.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__blocked\");");
    gold.append("\n    __blocked.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__seq\");");
    gold.append("\n    __seq.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__entropy\");");
    gold.append("\n    __entropy.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__auto_future_id\");");
    gold.append("\n    __auto_future_id.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__connection_id\");");
    gold.append("\n    __connection_id.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__message_id\");");
    gold.append("\n    __message_id.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__time\");");
    gold.append("\n    __time.__dump(__writer);");
    gold.append("\n    __dumpClients(__writer);");
    gold.append("\n    __dumpMessages(__writer);");
    gold.append("\n    __writer.endObject();");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __commit(String __name, JsonStreamWriter __forward, JsonStreamWriter __reverse) {");
    gold.append("\n    __state.__commit(\"__state\", __forward, __reverse);");
    gold.append("\n    __constructed.__commit(\"__constructed\", __forward, __reverse);");
    gold.append("\n    __next_time.__commit(\"__next_time\", __forward, __reverse);");
    gold.append("\n    __blocked.__commit(\"__blocked\", __forward, __reverse);");
    gold.append("\n    __seq.__commit(\"__seq\", __forward, __reverse);");
    gold.append("\n    __entropy.__commit(\"__entropy\", __forward, __reverse);");
    gold.append("\n    __auto_future_id.__commit(\"__auto_future_id\", __forward, __reverse);");
    gold.append("\n    __connection_id.__commit(\"__connection_id\", __forward, __reverse);");
    gold.append("\n    __message_id.__commit(\"__message_id\", __forward, __reverse);");
    gold.append("\n    __time.__commit(\"__time\", __forward, __reverse);");
    gold.append("\n    t.__commit(\"t\", __forward, __reverse);");
    gold.append("\n    value.__commit(\"value\", __forward, __reverse);");
    gold.append("\n    value5.__commit(\"value5\", __forward, __reverse);");
    gold.append("\n    v2.__commit(\"v2\", __forward, __reverse);");
    gold.append("\n    /* root */");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __revert() {");
    gold.append("\n    __state.__revert();");
    gold.append("\n    __constructed.__revert();");
    gold.append("\n    __next_time.__revert();");
    gold.append("\n    __blocked.__revert();");
    gold.append("\n    __seq.__revert();");
    gold.append("\n    __entropy.__revert();");
    gold.append("\n    __auto_future_id.__revert();");
    gold.append("\n    __connection_id.__revert();");
    gold.append("\n    __message_id.__revert();");
    gold.append("\n    __time.__revert();");
    gold.append("\n    t.__revert();");
    gold.append("\n    value.__revert();");
    gold.append("\n    value5.__revert();");
    gold.append("\n    v2.__revert();");
    gold.append("\n    /* root */");
    gold.append("\n  }");
    gold.append("\n  private class DeltaMethodsOnLists_9 {");
    gold.append("\n    private DInt32 __dvalue;");
    gold.append("\n    private DInt32 __dvalue5;");
    gold.append("\n    private DInt32 __dv2;");
    gold.append("\n    private boolean __emitted;");
    gold.append("\n    private DeltaMethodsOnLists_9() {");
    gold.append("\n      __dvalue = new DInt32();");
    gold.append("\n      __dvalue5 = new DInt32();");
    gold.append("\n      __dv2 = new DInt32();");
    gold.append("\n      __emitted = false;");
    gold.append("\n    }");
    gold.append("\n    public void show(MethodsOnLists_9 __item, PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      __code_cost += 3;");
    gold.append("\n      PrivateLazyDeltaWriter __obj = __writer.planObject();");
    gold.append("\n      __obj.manifest();");
    gold.append("\n      __dvalue.show(__item.value.get(), __obj.planField(\"value\"));");
    gold.append("\n      __dvalue5.show(__item.value5.get(), __obj.planField(\"value5\"));");
    gold.append("\n      __dv2.show(__item.v2.get(), __obj.planField(\"v2\"));");
    gold.append("\n      if (__obj.end()) {");
    gold.append("\n        __emitted = true;");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n    public void hide(PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      if (__emitted) {");
    gold.append("\n        __emitted = false;");
    gold.append("\n        __writer.writeNull();");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public PrivateView __createPrivateView(NtClient __who, Consumer<String> __updates) {");
    gold.append("\n    MethodsOnLists_9 __self = this;");
    gold.append("\n    DeltaMethodsOnLists_9 __state = new DeltaMethodsOnLists_9();");
    gold.append("\n    return new PrivateView(__who, __updates) {");
    gold.append("\n      @Override");
    gold.append("\n      public void update(JsonStreamWriter __writer) {");
    gold.append("\n        __state.show(__self, PrivateLazyDeltaWriter.bind(__who, __writer));");
    gold.append("\n      }");
    gold.append("\n    };");
    gold.append("\n  }");
    gold.append("\n  private class RTxX extends RxRecordBase<RTxX> {");
    gold.append("\n    private final RxInt32 x;");
    gold.append("\n    private final RxInt32 zzzz;");
    gold.append("\n    private final RxInt32 id;");
    gold.append("\n    private RTxX(RxParent __owner) {");
    gold.append("\n      super(__owner);");
    gold.append("\n      x = new RxInt32(this, 0);");
    gold.append("\n      zzzz = new RxInt32(this, 0);");
    gold.append("\n      id = new RxInt32(this, 0);");
    gold.append("\n      if (__owner instanceof RxTable) {");
    gold.append("\n        /* ok */");
    gold.append("\n      } else {");
    gold.append("\n        /* ok */");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n    private void __METH_0_foo(int z) {");
    gold.append("\n      __code_cost += 2;");
    gold.append("\n      __track(0);");
    gold.append("\n      x.opMultBy(10);");
    gold.append("\n    }");
    gold.append("\n    private int __METH_1_goo() {");
    gold.append("\n      __code_cost += 2;");
    gold.append("\n      __track(1);");
    gold.append("\n      return x.get();");
    gold.append("\n    }");
    gold.append("\n    private int __METH_2_square_plus(int z) {");
    gold.append("\n      __code_cost += 2;");
    gold.append("\n      __track(2);");
    gold.append("\n      return x.get() * x.get() + z;");
    gold.append("\n    }");
    gold.append("\n    private int __METH_3_square_plus_plus(int z, int u, int w) {");
    gold.append("\n      __code_cost += 2;");
    gold.append("\n      __track(3);");
    gold.append("\n      return x.get() * x.get() + z * (u + w);");
    gold.append("\n    }");
    gold.append("\n    String[] __INDEX_COLUMNS = new String[] {\"x\", \"zzzz\"};");
    gold.append("\n    @Override");
    gold.append("\n    public String[] __getIndexColumns() {");
    gold.append("\n      return __INDEX_COLUMNS;");
    gold.append("\n    }");
    gold.append("\n    @Override");
    gold.append("\n    public int[] __getIndexValues() {");
    gold.append("\n      return new int[] {x.getIndexValue(), zzzz.getIndexValue()};");
    gold.append("\n    }");
    gold.append("\n    @Override");
    gold.append("\n    public void __insert(JsonStreamReader __reader) {");
    gold.append("\n      if (__reader.startObject()) {");
    gold.append("\n        while(__reader.notEndOfObject()) {");
    gold.append("\n          String __fieldName = __reader.fieldName();");
    gold.append("\n          switch (__fieldName) {");
    gold.append("\n            case \"x\":");
    gold.append("\n              x.__insert(__reader);");
    gold.append("\n              break;");
    gold.append("\n            case \"zzzz\":");
    gold.append("\n              zzzz.__insert(__reader);");
    gold.append("\n              break;");
    gold.append("\n            case \"id\":");
    gold.append("\n              id.__insert(__reader);");
    gold.append("\n              break;");
    gold.append("\n            default:");
    gold.append("\n              __reader.skipValue();");
    gold.append("\n          }");
    gold.append("\n        }");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n    @Override");
    gold.append("\n    public void __dump(JsonStreamWriter __writer) {");
    gold.append("\n      __writer.beginObject();");
    gold.append("\n      __writer.writeObjectFieldIntro(\"x\");");
    gold.append("\n      x.__dump(__writer);");
    gold.append("\n      __writer.writeObjectFieldIntro(\"zzzz\");");
    gold.append("\n      zzzz.__dump(__writer);");
    gold.append("\n      __writer.writeObjectFieldIntro(\"id\");");
    gold.append("\n      id.__dump(__writer);");
    gold.append("\n      __writer.endObject();");
    gold.append("\n    }");
    gold.append("\n    @Override");
    gold.append("\n    public void __commit(String __name, JsonStreamWriter __forward, JsonStreamWriter __reverse) {");
    gold.append("\n      if (__isDirty()) {");
    gold.append("\n        __forward.writeObjectFieldIntro(__name);");
    gold.append("\n        __forward.beginObject();");
    gold.append("\n        __reverse.writeObjectFieldIntro(__name);");
    gold.append("\n        __reverse.beginObject();");
    gold.append("\n        x.__commit(\"x\", __forward, __reverse);");
    gold.append("\n        zzzz.__commit(\"zzzz\", __forward, __reverse);");
    gold.append("\n        id.__commit(\"id\", __forward, __reverse);");
    gold.append("\n        __forward.endObject();");
    gold.append("\n        __reverse.endObject();");
    gold.append("\n        __lowerDirtyCommit();");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n    @Override");
    gold.append("\n    public void __revert() {");
    gold.append("\n      if (__isDirty()) {");
    gold.append("\n        __isDying = false;");
    gold.append("\n        x.__revert();");
    gold.append("\n        zzzz.__revert();");
    gold.append("\n        id.__revert();");
    gold.append("\n        __lowerDirtyRevert();");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n    @Override");
    gold.append("\n    public String __name() {");
    gold.append("\n      return \"X\";");
    gold.append("\n    }");
    gold.append("\n    @Override");
    gold.append("\n    public void __deindex() {");
    gold.append("\n      /* ok */");
    gold.append("\n    }");
    gold.append("\n    public void __reindex() {");
    gold.append("\n      /* ok */");
    gold.append("\n    }");
    gold.append("\n    @Override");
    gold.append("\n    public int __id() {");
    gold.append("\n      return id.get();");
    gold.append("\n    }");
    gold.append("\n    @Override");
    gold.append("\n    public void __setId(int __id, boolean __force) {");
    gold.append("\n      if (__force) {");
    gold.append("\n        id.forceSet(__id);");
    gold.append("\n      } else {");
    gold.append("\n        id.set(__id);");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  private class DeltaRTxX {");
    gold.append("\n    private boolean __emitted;");
    gold.append("\n    private DeltaRTxX() {");
    gold.append("\n      __emitted = false;");
    gold.append("\n    }");
    gold.append("\n    public void show(RTxX __item, PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      PrivateLazyDeltaWriter __obj = __writer.planObject();");
    gold.append("\n      if (__obj.end()) {");
    gold.append("\n        __emitted = true;");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n    public void hide(PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      if (__emitted) {");
    gold.append("\n        __emitted = false;");
    gold.append("\n        __writer.writeNull();");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  private static class RTx_AnonObjConvert_4 implements NtMessageBase {");
    gold.append("\n    private int x = 0;");
    gold.append("\n    private RTx_AnonObjConvert_4(JsonStreamReader __reader) {");
    gold.append("\n      if (__reader.startObject()) {");
    gold.append("\n        while (__reader.notEndOfObject()) {");
    gold.append("\n          String __fieldName = __reader.fieldName();");
    gold.append("\n          switch (__fieldName) {");
    gold.append("\n            case \"x\":");
    gold.append("\n              this.x = __reader.readInteger();");
    gold.append("\n              break;");
    gold.append("\n            default:");
    gold.append("\n              __reader.skipValue();");
    gold.append("\n          }");
    gold.append("\n        }");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n    @Override");
    gold.append("\n    public void __writeOut(JsonStreamWriter __writer) {");
    gold.append("\n      __writer.beginObject();");
    gold.append("\n      __writer.writeObjectFieldIntro(\"x\");");
    gold.append("\n      __writer.writeInteger(x);");
    gold.append("\n      __writer.endObject();");
    gold.append("\n    }");
    gold.append("\n    private RTx_AnonObjConvert_4() {}");
    gold.append("\n    private RTx_AnonObjConvert_4(int x) {");
    gold.append("\n      this.x = x;");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  private class DeltaRTx_AnonObjConvert_4 {");
    gold.append("\n    private DInt32 __dx;");
    gold.append("\n    private boolean __emitted;");
    gold.append("\n    private DeltaRTx_AnonObjConvert_4() {");
    gold.append("\n      __dx = new DInt32();");
    gold.append("\n      __emitted = false;");
    gold.append("\n    }");
    gold.append("\n    public void show(RTx_AnonObjConvert_4 __item, PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      __code_cost += 1;");
    gold.append("\n      PrivateLazyDeltaWriter __obj = __writer.planObject();");
    gold.append("\n      __dx.show(__item.x, __obj.planField(\"x\"));");
    gold.append("\n      if (__obj.end()) {");
    gold.append("\n        __emitted = true;");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n    public void hide(PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      if (__emitted) {");
    gold.append("\n        __emitted = false;");
    gold.append("\n        __writer.writeNull();");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __route(AsyncTask task) {");
    gold.append("\n    return;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected Object __parse_message2(String channel, JsonStreamReader __reader) {");
    gold.append("\n    __reader.skipValue();");
    gold.append("\n    return NtMessageBase.NULL;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __reset_future_queues() {");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __invoke_label(String __new_state) {}");
    gold.append("\n  public boolean __onConnected__0(NtClient who){");
    gold.append("\n    __code_cost += 2;");
    gold.append("\n    __track(4);");
    gold.append("\n    return (who.equals(NtClient.NO_ONE));");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public boolean __onConnected(NtClient __cvalue) {");
    gold.append("\n    boolean __result = false;");
    gold.append("\n    if (__onConnected__0(__cvalue)) __result = true;");
    gold.append("\n    return __result;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __onDisconnected(NtClient __cvalue) {}");
    gold.append("\n  @Override");
    gold.append("\n  public String[] __getTests() {");
    gold.append("\n    return new String[] {};");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __test(TestReportBuilder report, String testName) {}");
    gold.append("\n  private void __construct_0(NtClient __who, NtMessageBase __object) {");
    gold.append("\n    __code_cost += 14;");
    gold.append("\n    __track(5);");
    gold.append("\n    {");
    gold.append("\n      RxTable<RTxX> _AutoRef7 = t;");
    gold.append("\n      RTx_AnonObjConvert_4 _AutoExpr9 = new RTx_AnonObjConvert_4(1);");
    gold.append("\n      RTxX _CreateRef8 = _AutoRef7.make();");
    gold.append("\n      __code_cost += 1;");
    gold.append("\n      _CreateRef8.x.set(_AutoExpr9.x);");
    gold.append("\n    }");
    gold.append("\n    __track(6);");
    gold.append("\n    {");
    gold.append("\n      RxTable<RTxX> _AutoRef10 = t;");
    gold.append("\n      RTx_AnonObjConvert_4 _AutoExpr12 = new RTx_AnonObjConvert_4(2);");
    gold.append("\n      RTxX _CreateRef11 = _AutoRef10.make();");
    gold.append("\n      __code_cost += 1;");
    gold.append("\n      _CreateRef11.x.set(_AutoExpr12.x);");
    gold.append("\n    }");
    gold.append("\n    __track(7);");
    gold.append("\n    {");
    gold.append("\n      RxTable<RTxX> _AutoRef13 = t;");
    gold.append("\n      RTx_AnonObjConvert_4 _AutoExpr15 = new RTx_AnonObjConvert_4(3);");
    gold.append("\n      RTxX _CreateRef14 = _AutoRef13.make();");
    gold.append("\n      __code_cost += 1;");
    gold.append("\n      _CreateRef14.x.set(_AutoExpr15.x);");
    gold.append("\n    }");
    gold.append("\n    __track(8);");
    gold.append("\n    int y = 42;");
    gold.append("\n    __track(9);");
    gold.append("\n    int seven = 7;");
    gold.append("\n    __track(10);");
    gold.append("\n    int five = 5;");
    gold.append("\n    __track(11);");
    gold.append("\n    int three = 3;");
    gold.append("\n    __track(12);");
    gold.append("\n    (t.iterate(true)).map(new __CLOSURE_Apply_16(y));");
    gold.append("\n    __track(13);");
    gold.append("\n    value.set(LibStatistics.sumInts((t.iterate(true)).transform(new __CLOSURE_Apply_17(seven))));");
    gold.append("\n    __track(14);");
    gold.append("\n    value5.set(LibStatistics.sumInts((t.iterate(true)).transform(new __CLOSURE_Apply_18(five, seven, three))));");
    gold.append("\n    __track(15);");
    gold.append("\n    y = 100;");
    gold.append("\n    __track(16);");
    gold.append("\n    v2.set(LibStatistics.sumInts((t.iterate(true)).transform((__item) -> __item.__METH_1_goo())));");
    gold.append("\n    __track(17);");
    gold.append("\n    (t.iterate(true)).map((__item) -> { __item.__delete(); });");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected NtMessageBase __parse_construct_arg(JsonStreamReader __reader) {");
    gold.append("\n    __reader.skipValue();");
    gold.append("\n    return NtMessageBase.NULL;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __construct_intern(NtClient __who, NtMessageBase __object) {");
    gold.append("\n    __construct_0(__who, __object);");
    gold.append("\n  }");
    gold.append("\n  private class __CLOSURE_Apply_16 implements Consumer<RTxX> {");
    gold.append("\n    private int y;");
    gold.append("\n    private __CLOSURE_Apply_16(int y) {");
    gold.append("\n    this.y = y;");
    gold.append("\n    }");
    gold.append("\n    @Override");
    gold.append("\n    public void accept(RTxX __item) {");
    gold.append("\n      __item.__METH_0_foo(y);");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  private class __CLOSURE_Apply_17 implements Function<RTxX,Integer> {");
    gold.append("\n    private int seven;");
    gold.append("\n    private __CLOSURE_Apply_17(int seven) {");
    gold.append("\n    this.seven = seven;");
    gold.append("\n    }");
    gold.append("\n    @Override");
    gold.append("\n    public Integer apply(RTxX __item) {");
    gold.append("\n      return __item.__METH_2_square_plus(seven);");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  private class __CLOSURE_Apply_18 implements Function<RTxX,Integer> {");
    gold.append("\n    private int five;");
    gold.append("\n    private int seven;");
    gold.append("\n    private int three;");
    gold.append("\n    private __CLOSURE_Apply_18(int five, int seven, int three) {");
    gold.append("\n    this.five = five;");
    gold.append("\n    this.seven = seven;");
    gold.append("\n    this.three = three;");
    gold.append("\n    }");
    gold.append("\n    @Override");
    gold.append("\n    public Integer apply(RTxX __item) {");
    gold.append("\n      return __item.__METH_3_square_plus_plus(seven, five, three);");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  /* end of file */");
    gold.append("\n}");
    gold.append("\n");
    gold.append("\n--JAVA COMPILE RESULTS-----------------------------");
    gold.append("\n--JAVA RUNNING-------------------------------------");
    gold.append("\n{\"command\":\"construct\",\"timestamp\":\"0\",\"who\":{\"agent\":\"?\",\"authority\":\"?\"},\"arg\":{},\"entropy\":\"0\"}-->{\"__constructed\":true,\"__entropy\":\"0\",\"t\":{\"auto_key\":3,\"rows\":{}},\"value\":1421,\"value5\":1568,\"v2\":60} need:true in:0");
    gold.append("\n{\"command\":\"connect\",\"timestamp\":\"25\",\"who\":{\"agent\":\"?\",\"authority\":\"?\"}}-->{\"__seq\":1,\"__connection_id\":1,\"__time\":\"25\",\"__clients\":{\"0\":{\"agent\":\"?\",\"authority\":\"?\"}}} need:true in:0");
    gold.append("\nRANDO was DENIED:5011");
    gold.append("\n+ NO_ONE DELTA:{\"data\":{\"value\":1421,\"value5\":1568,\"v2\":60},\"outstanding\":[],\"blockers\":[],\"seq\":2}");
    gold.append("\n+ RANDO DELTA:{\"data\":{\"value\":1421,\"value5\":1568,\"v2\":60},\"outstanding\":[],\"blockers\":[],\"seq\":2}");
    gold.append("\n{\"command\":\"invalidate\",\"timestamp\":\"50\"}-->{\"__messages\":null,\"__seq\":2,\"__entropy\":\"-4962768465676381896\",\"__time\":\"50\"} need:false in:-50");
    gold.append("\n{\"command\":\"bill\",\"timestamp\":\"75\"}-->{\"__goodwill_used\":0,\"__cost\":51,\"__billing_seq\":2} need:true in:0");
    gold.append("\n--JAVA RESULTS-------------------------------------");
    gold.append("\n{\"__constructed\":true,\"__entropy\":\"-4962768465676381896\",\"t\":{\"auto_key\":3,\"rows\":{}},\"value\":1421,\"value5\":1568,\"v2\":60,\"__seq\":2,\"__connection_id\":1,\"__time\":\"50\",\"__clients\":{\"0\":{\"agent\":\"?\",\"authority\":\"?\"}},\"__goodwill_used\":0,\"__cost\":51,\"__billing_seq\":2}");
    gold.append("\n--DUMP RESULTS-------------------------------------");
    gold.append("\n{\"t\":{\"auto_key\":3,\"rows\":{}},\"value\":1421,\"value5\":1568,\"v2\":60,\"__state\":\"\",\"__constructed\":true,\"__next_time\":\"0\",\"__blocked\":false,\"__seq\":2,\"__entropy\":\"-4962768465676381896\",\"__auto_future_id\":0,\"__connection_id\":1,\"__message_id\":0,\"__time\":\"75\",\"__clients\":{\"0\":{\"agent\":\"?\",\"authority\":\"?\"}}}");
    gold.append("\n{\"t\":{\"auto_key\":3,\"rows\":{}},\"value\":1421,\"value5\":1568,\"v2\":60,\"__state\":\"\",\"__constructed\":true,\"__next_time\":\"0\",\"__blocked\":false,\"__seq\":2,\"__entropy\":\"-4962768465676381896\",\"__auto_future_id\":0,\"__connection_id\":1,\"__message_id\":0,\"__time\":\"75\",\"__clients\":{\"0\":{\"agent\":\"?\",\"authority\":\"?\"}}}");
    gold.append("\n--JAVA TEST RESULTS--------------------------------");
    gold.append("\n");
    gold.append("\nSuccess");
    assertStable(live, gold);
  }
  private String cached_MultiArgs_10 = null;
  private String get_MultiArgs_10() {
    if (cached_MultiArgs_10 != null) {
      return cached_MultiArgs_10;
    }
    cached_MultiArgs_10 = generateTestOutput(true, "MultiArgs_10", "./test_code/Functions_MultiArgs_success.a");
    return cached_MultiArgs_10;
  }

  @Test
  public void testMultiArgsEmission() {
    assertEmissionGood(get_MultiArgs_10());
  }

  @Test
  public void testMultiArgsSuccess() {
    assertLivePass(get_MultiArgs_10());
  }

  @Test
  public void testMultiArgsGoodWillHappy() {
    assertGoodWillHappy(get_MultiArgs_10());
  }

  @Test
  public void testMultiArgsExceptionFree() {
    assertExceptionFree(get_MultiArgs_10());
  }

  @Test
  public void testMultiArgsTODOFree() {
    assertTODOFree(get_MultiArgs_10());
  }

  @Test
  public void stable_MultiArgs_10() {
    String live = get_MultiArgs_10();
    StringBuilder gold = new StringBuilder();
    gold.append("Path:Functions_MultiArgs_success.a");
    gold.append("\n--EMISSION-----------------------------------------");
    gold.append("\nEmission Success, Yay");
    gold.append("\n--ISSUES-------------------------------------------");
    gold.append("\n[ ]");
    gold.append("\n--JAVA---------------------------------------------");
    gold.append("\nimport com.fasterxml.jackson.databind.JsonNode;");
    gold.append("\nimport com.fasterxml.jackson.databind.node.ArrayNode;");
    gold.append("\nimport com.fasterxml.jackson.databind.node.ObjectNode;");
    gold.append("\nimport org.adamalang.runtime.*;");
    gold.append("\nimport org.adamalang.runtime.async.*;");
    gold.append("\nimport org.adamalang.runtime.contracts.*;");
    gold.append("\nimport org.adamalang.runtime.delta.*;");
    gold.append("\nimport org.adamalang.runtime.exceptions.*;");
    gold.append("\nimport org.adamalang.runtime.index.*;");
    gold.append("\nimport org.adamalang.runtime.json.*;");
    gold.append("\nimport org.adamalang.runtime.natives.*;");
    gold.append("\nimport org.adamalang.runtime.natives.lists.*;");
    gold.append("\nimport org.adamalang.runtime.ops.*;");
    gold.append("\nimport org.adamalang.runtime.reactives.*;");
    gold.append("\nimport org.adamalang.runtime.stdlib.*;");
    gold.append("\nimport java.util.function.Consumer;");
    gold.append("\nimport java.util.function.Function;");
    gold.append("\nimport java.util.ArrayList;");
    gold.append("\nimport java.util.Comparator;");
    gold.append("\nimport java.util.Map;");
    gold.append("\nimport java.lang.Math;");
    gold.append("\npublic class MultiArgs_10 extends LivingDocument {");
    gold.append("\n  public MultiArgs_10(DocumentMonitor __monitor) {");
    gold.append("\n    super(__monitor);");
    gold.append("\n    __goodwillBudget = 100000;");
    gold.append("\n    __goodwillLimitOfBudget = 100000;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __insert(JsonStreamReader __reader) {");
    gold.append("\n    if (__reader.startObject()) {");
    gold.append("\n      while(__reader.notEndOfObject()) {");
    gold.append("\n        String __fieldName = __reader.fieldName();");
    gold.append("\n        switch (__fieldName) {");
    gold.append("\n          case \"__state\":");
    gold.append("\n            __state.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__constructed\":");
    gold.append("\n            __constructed.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__next_time\":");
    gold.append("\n            __next_time.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__blocked\":");
    gold.append("\n            __blocked.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__seq\":");
    gold.append("\n            __seq.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__entropy\":");
    gold.append("\n            __entropy.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__auto_future_id\":");
    gold.append("\n            __auto_future_id.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__connection_id\":");
    gold.append("\n            __connection_id.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__message_id\":");
    gold.append("\n            __message_id.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__time\":");
    gold.append("\n            __time.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__clients\":");
    gold.append("\n            __hydrateClients(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__messages\":");
    gold.append("\n            __hydrateMessages(__reader);");
    gold.append("\n            break;");
    gold.append("\n          default:");
    gold.append("\n            __reader.skipValue();");
    gold.append("\n        }");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __dump(JsonStreamWriter __writer) {");
    gold.append("\n    __writer.beginObject();");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__state\");");
    gold.append("\n    __state.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__constructed\");");
    gold.append("\n    __constructed.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__next_time\");");
    gold.append("\n    __next_time.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__blocked\");");
    gold.append("\n    __blocked.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__seq\");");
    gold.append("\n    __seq.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__entropy\");");
    gold.append("\n    __entropy.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__auto_future_id\");");
    gold.append("\n    __auto_future_id.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__connection_id\");");
    gold.append("\n    __connection_id.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__message_id\");");
    gold.append("\n    __message_id.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__time\");");
    gold.append("\n    __time.__dump(__writer);");
    gold.append("\n    __dumpClients(__writer);");
    gold.append("\n    __dumpMessages(__writer);");
    gold.append("\n    __writer.endObject();");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __commit(String __name, JsonStreamWriter __forward, JsonStreamWriter __reverse) {");
    gold.append("\n    __state.__commit(\"__state\", __forward, __reverse);");
    gold.append("\n    __constructed.__commit(\"__constructed\", __forward, __reverse);");
    gold.append("\n    __next_time.__commit(\"__next_time\", __forward, __reverse);");
    gold.append("\n    __blocked.__commit(\"__blocked\", __forward, __reverse);");
    gold.append("\n    __seq.__commit(\"__seq\", __forward, __reverse);");
    gold.append("\n    __entropy.__commit(\"__entropy\", __forward, __reverse);");
    gold.append("\n    __auto_future_id.__commit(\"__auto_future_id\", __forward, __reverse);");
    gold.append("\n    __connection_id.__commit(\"__connection_id\", __forward, __reverse);");
    gold.append("\n    __message_id.__commit(\"__message_id\", __forward, __reverse);");
    gold.append("\n    __time.__commit(\"__time\", __forward, __reverse);");
    gold.append("\n    /* root */");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __revert() {");
    gold.append("\n    __state.__revert();");
    gold.append("\n    __constructed.__revert();");
    gold.append("\n    __next_time.__revert();");
    gold.append("\n    __blocked.__revert();");
    gold.append("\n    __seq.__revert();");
    gold.append("\n    __entropy.__revert();");
    gold.append("\n    __auto_future_id.__revert();");
    gold.append("\n    __connection_id.__revert();");
    gold.append("\n    __message_id.__revert();");
    gold.append("\n    __time.__revert();");
    gold.append("\n    /* root */");
    gold.append("\n  }");
    gold.append("\n  private class DeltaMultiArgs_10 {");
    gold.append("\n    private boolean __emitted;");
    gold.append("\n    private DeltaMultiArgs_10() {");
    gold.append("\n      __emitted = false;");
    gold.append("\n    }");
    gold.append("\n    public void show(MultiArgs_10 __item, PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      PrivateLazyDeltaWriter __obj = __writer.planObject();");
    gold.append("\n      __obj.manifest();");
    gold.append("\n      if (__obj.end()) {");
    gold.append("\n        __emitted = true;");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n    public void hide(PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      if (__emitted) {");
    gold.append("\n        __emitted = false;");
    gold.append("\n        __writer.writeNull();");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public PrivateView __createPrivateView(NtClient __who, Consumer<String> __updates) {");
    gold.append("\n    MultiArgs_10 __self = this;");
    gold.append("\n    DeltaMultiArgs_10 __state = new DeltaMultiArgs_10();");
    gold.append("\n    return new PrivateView(__who, __updates) {");
    gold.append("\n      @Override");
    gold.append("\n      public void update(JsonStreamWriter __writer) {");
    gold.append("\n        __state.show(__self, PrivateLazyDeltaWriter.bind(__who, __writer));");
    gold.append("\n      }");
    gold.append("\n    };");
    gold.append("\n  }");
    gold.append("\n  private class RTxX extends RxRecordBase<RTxX> {");
    gold.append("\n    private final RxInt32 id;");
    gold.append("\n    private RTxX(RxParent __owner) {");
    gold.append("\n      super(__owner);");
    gold.append("\n      id = new RxInt32(this, 0);");
    gold.append("\n      if (__owner instanceof RxTable) {");
    gold.append("\n        /* ok */");
    gold.append("\n      } else {");
    gold.append("\n        /* ok */");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n    private void __METH_1_y(int a, int b) {}");
    gold.append("\n    String[] __INDEX_COLUMNS = new String[] {};");
    gold.append("\n    @Override");
    gold.append("\n    public String[] __getIndexColumns() {");
    gold.append("\n      return __INDEX_COLUMNS;");
    gold.append("\n    }");
    gold.append("\n    @Override");
    gold.append("\n    public int[] __getIndexValues() {");
    gold.append("\n      return new int[] {};");
    gold.append("\n    }");
    gold.append("\n    @Override");
    gold.append("\n    public void __insert(JsonStreamReader __reader) {");
    gold.append("\n      if (__reader.startObject()) {");
    gold.append("\n        while(__reader.notEndOfObject()) {");
    gold.append("\n          String __fieldName = __reader.fieldName();");
    gold.append("\n          switch (__fieldName) {");
    gold.append("\n            case \"id\":");
    gold.append("\n              id.__insert(__reader);");
    gold.append("\n              break;");
    gold.append("\n            default:");
    gold.append("\n              __reader.skipValue();");
    gold.append("\n          }");
    gold.append("\n        }");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n    @Override");
    gold.append("\n    public void __dump(JsonStreamWriter __writer) {");
    gold.append("\n      __writer.beginObject();");
    gold.append("\n      __writer.writeObjectFieldIntro(\"id\");");
    gold.append("\n      id.__dump(__writer);");
    gold.append("\n      __writer.endObject();");
    gold.append("\n    }");
    gold.append("\n    @Override");
    gold.append("\n    public void __commit(String __name, JsonStreamWriter __forward, JsonStreamWriter __reverse) {");
    gold.append("\n      if (__isDirty()) {");
    gold.append("\n        __forward.writeObjectFieldIntro(__name);");
    gold.append("\n        __forward.beginObject();");
    gold.append("\n        __reverse.writeObjectFieldIntro(__name);");
    gold.append("\n        __reverse.beginObject();");
    gold.append("\n        id.__commit(\"id\", __forward, __reverse);");
    gold.append("\n        __forward.endObject();");
    gold.append("\n        __reverse.endObject();");
    gold.append("\n        __lowerDirtyCommit();");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n    @Override");
    gold.append("\n    public void __revert() {");
    gold.append("\n      if (__isDirty()) {");
    gold.append("\n        __isDying = false;");
    gold.append("\n        id.__revert();");
    gold.append("\n        __lowerDirtyRevert();");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n    @Override");
    gold.append("\n    public String __name() {");
    gold.append("\n      return \"X\";");
    gold.append("\n    }");
    gold.append("\n    @Override");
    gold.append("\n    public void __deindex() {");
    gold.append("\n      /* ok */");
    gold.append("\n    }");
    gold.append("\n    public void __reindex() {");
    gold.append("\n      /* ok */");
    gold.append("\n    }");
    gold.append("\n    @Override");
    gold.append("\n    public int __id() {");
    gold.append("\n      return id.get();");
    gold.append("\n    }");
    gold.append("\n    @Override");
    gold.append("\n    public void __setId(int __id, boolean __force) {");
    gold.append("\n      if (__force) {");
    gold.append("\n        id.forceSet(__id);");
    gold.append("\n      } else {");
    gold.append("\n        id.set(__id);");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  private class DeltaRTxX {");
    gold.append("\n    private boolean __emitted;");
    gold.append("\n    private DeltaRTxX() {");
    gold.append("\n      __emitted = false;");
    gold.append("\n    }");
    gold.append("\n    public void show(RTxX __item, PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      PrivateLazyDeltaWriter __obj = __writer.planObject();");
    gold.append("\n      if (__obj.end()) {");
    gold.append("\n        __emitted = true;");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n    public void hide(PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      if (__emitted) {");
    gold.append("\n        __emitted = false;");
    gold.append("\n        __writer.writeNull();");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  private void __FUNC_0_x(int a, int b) {}");
    gold.append("\n  @Override");
    gold.append("\n  protected void __route(AsyncTask task) {");
    gold.append("\n    return;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected Object __parse_message2(String channel, JsonStreamReader __reader) {");
    gold.append("\n    __reader.skipValue();");
    gold.append("\n    return NtMessageBase.NULL;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __reset_future_queues() {");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __invoke_label(String __new_state) {}");
    gold.append("\n  @Override");
    gold.append("\n  public boolean __onConnected(NtClient __cvalue) {");
    gold.append("\n    boolean __result = false;");
    gold.append("\n    return __result;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __onDisconnected(NtClient __cvalue) {}");
    gold.append("\n  @Override");
    gold.append("\n  public String[] __getTests() {");
    gold.append("\n    return new String[] {};");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __test(TestReportBuilder report, String testName) {}");
    gold.append("\n  @Override");
    gold.append("\n  protected void __construct_intern(NtClient who, NtMessageBase message) {}");
    gold.append("\n  @Override");
    gold.append("\n  protected NtMessageBase __parse_construct_arg(JsonStreamReader __reader) {");
    gold.append("\n    __reader.skipValue();");
    gold.append("\n    return NtMessageBase.NULL;");
    gold.append("\n  }");
    gold.append("\n  /* end of file */");
    gold.append("\n}");
    gold.append("\n");
    gold.append("\n--JAVA COMPILE RESULTS-----------------------------");
    gold.append("\n--JAVA RUNNING-------------------------------------");
    gold.append("\n{\"command\":\"construct\",\"timestamp\":\"0\",\"who\":{\"agent\":\"?\",\"authority\":\"?\"},\"arg\":{},\"entropy\":\"0\"}-->{\"__constructed\":true,\"__entropy\":\"0\"} need:true in:0");
    gold.append("\nNO_ONE was DENIED:5011");
    gold.append("\nRANDO was DENIED:5011");
    gold.append("\n+ NO_ONE DELTA:{\"data\":{},\"outstanding\":[],\"blockers\":[],\"seq\":1}");
    gold.append("\n+ RANDO DELTA:{\"data\":{},\"outstanding\":[],\"blockers\":[],\"seq\":1}");
    gold.append("\n{\"command\":\"invalidate\",\"timestamp\":\"25\"}-->{\"__messages\":null,\"__seq\":1,\"__entropy\":\"-4962768465676381896\",\"__time\":\"25\"} need:false in:-25");
    gold.append("\n{\"command\":\"bill\",\"timestamp\":\"50\"}-->{\"__goodwill_used\":0,\"__cost\":0,\"__billing_seq\":1} need:true in:0");
    gold.append("\n--JAVA RESULTS-------------------------------------");
    gold.append("\n{\"__constructed\":true,\"__entropy\":\"-4962768465676381896\",\"__seq\":1,\"__time\":\"25\",\"__goodwill_used\":0,\"__cost\":0,\"__billing_seq\":1}");
    gold.append("\n--DUMP RESULTS-------------------------------------");
    gold.append("\n{\"__state\":\"\",\"__constructed\":true,\"__next_time\":\"0\",\"__blocked\":false,\"__seq\":1,\"__entropy\":\"-4962768465676381896\",\"__auto_future_id\":0,\"__connection_id\":0,\"__message_id\":0,\"__time\":\"50\"}");
    gold.append("\n{\"__state\":\"\",\"__constructed\":true,\"__next_time\":\"0\",\"__blocked\":false,\"__seq\":1,\"__entropy\":\"-4962768465676381896\",\"__auto_future_id\":0,\"__connection_id\":0,\"__message_id\":0,\"__time\":\"50\"}");
    gold.append("\n--JAVA TEST RESULTS--------------------------------");
    gold.append("\n");
    gold.append("\nSuccess");
    assertStable(live, gold);
  }
  private String cached_MustReturn_11 = null;
  private String get_MustReturn_11() {
    if (cached_MustReturn_11 != null) {
      return cached_MustReturn_11;
    }
    cached_MustReturn_11 = generateTestOutput(false, "MustReturn_11", "./test_code/Functions_MustReturn_failure.a");
    return cached_MustReturn_11;
  }

  @Test
  public void testMustReturnFailure() {
    assertLiveFail(get_MustReturn_11());
  }

  @Test
  public void testMustReturnNotTerribleLineNumbers() {
    assertNotTerribleLineNumbers(get_MustReturn_11());
  }

  @Test
  public void testMustReturnExceptionFree() {
    assertExceptionFree(get_MustReturn_11());
  }

  @Test
  public void testMustReturnTODOFree() {
    assertTODOFree(get_MustReturn_11());
  }

  @Test
  public void stable_MustReturn_11() {
    String live = get_MustReturn_11();
    StringBuilder gold = new StringBuilder();
    gold.append("Path:Functions_MustReturn_failure.a");
    gold.append("\n--ISSUES-------------------------------------------");
    gold.append("\n[ {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 1,");
    gold.append("\n      \"character\" : 0");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 6,");
    gold.append("\n      \"character\" : 1");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"The procedure 'x' does not return in all cases (FunctionDefine)\"");
    gold.append("\n}, {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 9,");
    gold.append("\n      \"character\" : 2");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 14,");
    gold.append("\n      \"character\" : 3");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"Function 'foo' does not return in all cases (MethodDefine)\"");
    gold.append("\n}, {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 16,");
    gold.append("\n      \"character\" : 9");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 17,");
    gold.append("\n      \"character\" : 3");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"Policy 'p' does not return in all cases (PolicyDefine)\"");
    gold.append("\n} ]");
    gold.append("\n--JAVA---------------------------------------------");
    gold.append("\n");
    gold.append("\nFailedValidation");
    assertStable(live, gold);
  }
  private String cached_PrepWorkReducers_12 = null;
  private String get_PrepWorkReducers_12() {
    if (cached_PrepWorkReducers_12 != null) {
      return cached_PrepWorkReducers_12;
    }
    cached_PrepWorkReducers_12 = generateTestOutput(true, "PrepWorkReducers_12", "./test_code/Functions_PrepWorkReducers_success.a");
    return cached_PrepWorkReducers_12;
  }

  @Test
  public void testPrepWorkReducersEmission() {
    assertEmissionGood(get_PrepWorkReducers_12());
  }

  @Test
  public void testPrepWorkReducersSuccess() {
    assertLivePass(get_PrepWorkReducers_12());
  }

  @Test
  public void testPrepWorkReducersGoodWillHappy() {
    assertGoodWillHappy(get_PrepWorkReducers_12());
  }

  @Test
  public void testPrepWorkReducersExceptionFree() {
    assertExceptionFree(get_PrepWorkReducers_12());
  }

  @Test
  public void testPrepWorkReducersTODOFree() {
    assertTODOFree(get_PrepWorkReducers_12());
  }

  @Test
  public void stable_PrepWorkReducers_12() {
    String live = get_PrepWorkReducers_12();
    StringBuilder gold = new StringBuilder();
    gold.append("Path:Functions_PrepWorkReducers_success.a");
    gold.append("\n--EMISSION-----------------------------------------");
    gold.append("\nEmission Success, Yay");
    gold.append("\n--ISSUES-------------------------------------------");
    gold.append("\n[ ]");
    gold.append("\n--JAVA---------------------------------------------");
    gold.append("\nimport com.fasterxml.jackson.databind.JsonNode;");
    gold.append("\nimport com.fasterxml.jackson.databind.node.ArrayNode;");
    gold.append("\nimport com.fasterxml.jackson.databind.node.ObjectNode;");
    gold.append("\nimport org.adamalang.runtime.*;");
    gold.append("\nimport org.adamalang.runtime.async.*;");
    gold.append("\nimport org.adamalang.runtime.contracts.*;");
    gold.append("\nimport org.adamalang.runtime.delta.*;");
    gold.append("\nimport org.adamalang.runtime.exceptions.*;");
    gold.append("\nimport org.adamalang.runtime.index.*;");
    gold.append("\nimport org.adamalang.runtime.json.*;");
    gold.append("\nimport org.adamalang.runtime.natives.*;");
    gold.append("\nimport org.adamalang.runtime.natives.lists.*;");
    gold.append("\nimport org.adamalang.runtime.ops.*;");
    gold.append("\nimport org.adamalang.runtime.reactives.*;");
    gold.append("\nimport org.adamalang.runtime.stdlib.*;");
    gold.append("\nimport java.util.function.Consumer;");
    gold.append("\nimport java.util.function.Function;");
    gold.append("\nimport java.util.ArrayList;");
    gold.append("\nimport java.util.Comparator;");
    gold.append("\nimport java.util.Map;");
    gold.append("\nimport java.lang.Math;");
    gold.append("\npublic class PrepWorkReducers_12 extends LivingDocument {");
    gold.append("\n  private final RxTable<RTxThing> things;");
    gold.append("\n  private final RxInt32 result;");
    gold.append("\n  private final RxInt32 result2;");
    gold.append("\n  private final RxDouble result3;");
    gold.append("\n  public PrepWorkReducers_12(DocumentMonitor __monitor) {");
    gold.append("\n    super(__monitor);");
    gold.append("\n    things = new RxTable<>(__self, this, \"things\", (RxParent __parent) -> new RTxThing(__parent), 0);");
    gold.append("\n    result = new RxInt32(this, 0);");
    gold.append("\n    result2 = new RxInt32(this, 0);");
    gold.append("\n    result3 = new RxDouble(this, 0.0);");
    gold.append("\n    __goodwillBudget = 100000;");
    gold.append("\n    __goodwillLimitOfBudget = 100000;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __insert(JsonStreamReader __reader) {");
    gold.append("\n    if (__reader.startObject()) {");
    gold.append("\n      while(__reader.notEndOfObject()) {");
    gold.append("\n        String __fieldName = __reader.fieldName();");
    gold.append("\n        switch (__fieldName) {");
    gold.append("\n          case \"things\":");
    gold.append("\n            things.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"result\":");
    gold.append("\n            result.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"result2\":");
    gold.append("\n            result2.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"result3\":");
    gold.append("\n            result3.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__state\":");
    gold.append("\n            __state.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__constructed\":");
    gold.append("\n            __constructed.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__next_time\":");
    gold.append("\n            __next_time.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__blocked\":");
    gold.append("\n            __blocked.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__seq\":");
    gold.append("\n            __seq.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__entropy\":");
    gold.append("\n            __entropy.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__auto_future_id\":");
    gold.append("\n            __auto_future_id.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__connection_id\":");
    gold.append("\n            __connection_id.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__message_id\":");
    gold.append("\n            __message_id.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__time\":");
    gold.append("\n            __time.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__clients\":");
    gold.append("\n            __hydrateClients(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__messages\":");
    gold.append("\n            __hydrateMessages(__reader);");
    gold.append("\n            break;");
    gold.append("\n          default:");
    gold.append("\n            __reader.skipValue();");
    gold.append("\n        }");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __dump(JsonStreamWriter __writer) {");
    gold.append("\n    __writer.beginObject();");
    gold.append("\n    __writer.writeObjectFieldIntro(\"things\");");
    gold.append("\n    things.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"result\");");
    gold.append("\n    result.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"result2\");");
    gold.append("\n    result2.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"result3\");");
    gold.append("\n    result3.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__state\");");
    gold.append("\n    __state.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__constructed\");");
    gold.append("\n    __constructed.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__next_time\");");
    gold.append("\n    __next_time.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__blocked\");");
    gold.append("\n    __blocked.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__seq\");");
    gold.append("\n    __seq.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__entropy\");");
    gold.append("\n    __entropy.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__auto_future_id\");");
    gold.append("\n    __auto_future_id.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__connection_id\");");
    gold.append("\n    __connection_id.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__message_id\");");
    gold.append("\n    __message_id.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__time\");");
    gold.append("\n    __time.__dump(__writer);");
    gold.append("\n    __dumpClients(__writer);");
    gold.append("\n    __dumpMessages(__writer);");
    gold.append("\n    __writer.endObject();");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __commit(String __name, JsonStreamWriter __forward, JsonStreamWriter __reverse) {");
    gold.append("\n    __state.__commit(\"__state\", __forward, __reverse);");
    gold.append("\n    __constructed.__commit(\"__constructed\", __forward, __reverse);");
    gold.append("\n    __next_time.__commit(\"__next_time\", __forward, __reverse);");
    gold.append("\n    __blocked.__commit(\"__blocked\", __forward, __reverse);");
    gold.append("\n    __seq.__commit(\"__seq\", __forward, __reverse);");
    gold.append("\n    __entropy.__commit(\"__entropy\", __forward, __reverse);");
    gold.append("\n    __auto_future_id.__commit(\"__auto_future_id\", __forward, __reverse);");
    gold.append("\n    __connection_id.__commit(\"__connection_id\", __forward, __reverse);");
    gold.append("\n    __message_id.__commit(\"__message_id\", __forward, __reverse);");
    gold.append("\n    __time.__commit(\"__time\", __forward, __reverse);");
    gold.append("\n    things.__commit(\"things\", __forward, __reverse);");
    gold.append("\n    result.__commit(\"result\", __forward, __reverse);");
    gold.append("\n    result2.__commit(\"result2\", __forward, __reverse);");
    gold.append("\n    result3.__commit(\"result3\", __forward, __reverse);");
    gold.append("\n    /* root */");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __revert() {");
    gold.append("\n    __state.__revert();");
    gold.append("\n    __constructed.__revert();");
    gold.append("\n    __next_time.__revert();");
    gold.append("\n    __blocked.__revert();");
    gold.append("\n    __seq.__revert();");
    gold.append("\n    __entropy.__revert();");
    gold.append("\n    __auto_future_id.__revert();");
    gold.append("\n    __connection_id.__revert();");
    gold.append("\n    __message_id.__revert();");
    gold.append("\n    __time.__revert();");
    gold.append("\n    things.__revert();");
    gold.append("\n    result.__revert();");
    gold.append("\n    result2.__revert();");
    gold.append("\n    result3.__revert();");
    gold.append("\n    /* root */");
    gold.append("\n  }");
    gold.append("\n  private class DeltaPrepWorkReducers_12 {");
    gold.append("\n    private boolean __emitted;");
    gold.append("\n    private DeltaPrepWorkReducers_12() {");
    gold.append("\n      __emitted = false;");
    gold.append("\n    }");
    gold.append("\n    public void show(PrepWorkReducers_12 __item, PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      PrivateLazyDeltaWriter __obj = __writer.planObject();");
    gold.append("\n      __obj.manifest();");
    gold.append("\n      if (__obj.end()) {");
    gold.append("\n        __emitted = true;");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n    public void hide(PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      if (__emitted) {");
    gold.append("\n        __emitted = false;");
    gold.append("\n        __writer.writeNull();");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public PrivateView __createPrivateView(NtClient __who, Consumer<String> __updates) {");
    gold.append("\n    PrepWorkReducers_12 __self = this;");
    gold.append("\n    DeltaPrepWorkReducers_12 __state = new DeltaPrepWorkReducers_12();");
    gold.append("\n    return new PrivateView(__who, __updates) {");
    gold.append("\n      @Override");
    gold.append("\n      public void update(JsonStreamWriter __writer) {");
    gold.append("\n        __state.show(__self, PrivateLazyDeltaWriter.bind(__who, __writer));");
    gold.append("\n      }");
    gold.append("\n    };");
    gold.append("\n  }");
    gold.append("\n  private class RTxThing extends RxRecordBase<RTxThing> {");
    gold.append("\n    private final RxInt32 x;");
    gold.append("\n    private final RxDouble y;");
    gold.append("\n    private final RxInt32 id;");
    gold.append("\n    private RTxThing(RxParent __owner) {");
    gold.append("\n      super(__owner);");
    gold.append("\n      x = new RxInt32(this, 0);");
    gold.append("\n      y = new RxDouble(this, 0.0);");
    gold.append("\n      id = new RxInt32(this, 0);");
    gold.append("\n      if (__owner instanceof RxTable) {");
    gold.append("\n        /* ok */");
    gold.append("\n      } else {");
    gold.append("\n        /* ok */");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n    String[] __INDEX_COLUMNS = new String[] {\"x\"};");
    gold.append("\n    @Override");
    gold.append("\n    public String[] __getIndexColumns() {");
    gold.append("\n      return __INDEX_COLUMNS;");
    gold.append("\n    }");
    gold.append("\n    @Override");
    gold.append("\n    public int[] __getIndexValues() {");
    gold.append("\n      return new int[] {x.getIndexValue()};");
    gold.append("\n    }");
    gold.append("\n    @Override");
    gold.append("\n    public void __insert(JsonStreamReader __reader) {");
    gold.append("\n      if (__reader.startObject()) {");
    gold.append("\n        while(__reader.notEndOfObject()) {");
    gold.append("\n          String __fieldName = __reader.fieldName();");
    gold.append("\n          switch (__fieldName) {");
    gold.append("\n            case \"x\":");
    gold.append("\n              x.__insert(__reader);");
    gold.append("\n              break;");
    gold.append("\n            case \"y\":");
    gold.append("\n              y.__insert(__reader);");
    gold.append("\n              break;");
    gold.append("\n            case \"id\":");
    gold.append("\n              id.__insert(__reader);");
    gold.append("\n              break;");
    gold.append("\n            default:");
    gold.append("\n              __reader.skipValue();");
    gold.append("\n          }");
    gold.append("\n        }");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n    @Override");
    gold.append("\n    public void __dump(JsonStreamWriter __writer) {");
    gold.append("\n      __writer.beginObject();");
    gold.append("\n      __writer.writeObjectFieldIntro(\"x\");");
    gold.append("\n      x.__dump(__writer);");
    gold.append("\n      __writer.writeObjectFieldIntro(\"y\");");
    gold.append("\n      y.__dump(__writer);");
    gold.append("\n      __writer.writeObjectFieldIntro(\"id\");");
    gold.append("\n      id.__dump(__writer);");
    gold.append("\n      __writer.endObject();");
    gold.append("\n    }");
    gold.append("\n    @Override");
    gold.append("\n    public void __commit(String __name, JsonStreamWriter __forward, JsonStreamWriter __reverse) {");
    gold.append("\n      if (__isDirty()) {");
    gold.append("\n        __forward.writeObjectFieldIntro(__name);");
    gold.append("\n        __forward.beginObject();");
    gold.append("\n        __reverse.writeObjectFieldIntro(__name);");
    gold.append("\n        __reverse.beginObject();");
    gold.append("\n        x.__commit(\"x\", __forward, __reverse);");
    gold.append("\n        y.__commit(\"y\", __forward, __reverse);");
    gold.append("\n        id.__commit(\"id\", __forward, __reverse);");
    gold.append("\n        __forward.endObject();");
    gold.append("\n        __reverse.endObject();");
    gold.append("\n        __lowerDirtyCommit();");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n    @Override");
    gold.append("\n    public void __revert() {");
    gold.append("\n      if (__isDirty()) {");
    gold.append("\n        __isDying = false;");
    gold.append("\n        x.__revert();");
    gold.append("\n        y.__revert();");
    gold.append("\n        id.__revert();");
    gold.append("\n        __lowerDirtyRevert();");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n    @Override");
    gold.append("\n    public String __name() {");
    gold.append("\n      return \"Thing\";");
    gold.append("\n    }");
    gold.append("\n    @Override");
    gold.append("\n    public void __deindex() {");
    gold.append("\n      /* ok */");
    gold.append("\n    }");
    gold.append("\n    public void __reindex() {");
    gold.append("\n      /* ok */");
    gold.append("\n    }");
    gold.append("\n    @Override");
    gold.append("\n    public int __id() {");
    gold.append("\n      return id.get();");
    gold.append("\n    }");
    gold.append("\n    @Override");
    gold.append("\n    public void __setId(int __id, boolean __force) {");
    gold.append("\n      if (__force) {");
    gold.append("\n        id.forceSet(__id);");
    gold.append("\n      } else {");
    gold.append("\n        id.set(__id);");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  private class DeltaRTxThing {");
    gold.append("\n    private boolean __emitted;");
    gold.append("\n    private DeltaRTxThing() {");
    gold.append("\n      __emitted = false;");
    gold.append("\n    }");
    gold.append("\n    public void show(RTxThing __item, PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      PrivateLazyDeltaWriter __obj = __writer.planObject();");
    gold.append("\n      if (__obj.end()) {");
    gold.append("\n        __emitted = true;");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n    public void hide(PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      if (__emitted) {");
    gold.append("\n        __emitted = false;");
    gold.append("\n        __writer.writeNull();");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  private static class RTx_AnonObjConvert_1 implements NtMessageBase {");
    gold.append("\n    private int x = 0;");
    gold.append("\n    private double y = 0.0;");
    gold.append("\n    private RTx_AnonObjConvert_1(JsonStreamReader __reader) {");
    gold.append("\n      if (__reader.startObject()) {");
    gold.append("\n        while (__reader.notEndOfObject()) {");
    gold.append("\n          String __fieldName = __reader.fieldName();");
    gold.append("\n          switch (__fieldName) {");
    gold.append("\n            case \"x\":");
    gold.append("\n              this.x = __reader.readInteger();");
    gold.append("\n              break;");
    gold.append("\n            case \"y\":");
    gold.append("\n              this.y = __reader.readDouble();");
    gold.append("\n              break;");
    gold.append("\n            default:");
    gold.append("\n              __reader.skipValue();");
    gold.append("\n          }");
    gold.append("\n        }");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n    @Override");
    gold.append("\n    public void __writeOut(JsonStreamWriter __writer) {");
    gold.append("\n      __writer.beginObject();");
    gold.append("\n      __writer.writeObjectFieldIntro(\"x\");");
    gold.append("\n      __writer.writeInteger(x);");
    gold.append("\n      __writer.writeObjectFieldIntro(\"y\");");
    gold.append("\n      __writer.writeDouble(y);");
    gold.append("\n      __writer.endObject();");
    gold.append("\n    }");
    gold.append("\n    private RTx_AnonObjConvert_1() {}");
    gold.append("\n    private RTx_AnonObjConvert_1(int x, double y) {");
    gold.append("\n      this.x = x;");
    gold.append("\n      this.y = y;");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  private class DeltaRTx_AnonObjConvert_1 {");
    gold.append("\n    private DInt32 __dx;");
    gold.append("\n    private DDouble __dy;");
    gold.append("\n    private boolean __emitted;");
    gold.append("\n    private DeltaRTx_AnonObjConvert_1() {");
    gold.append("\n      __dx = new DInt32();");
    gold.append("\n      __dy = new DDouble();");
    gold.append("\n      __emitted = false;");
    gold.append("\n    }");
    gold.append("\n    public void show(RTx_AnonObjConvert_1 __item, PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      __code_cost += 2;");
    gold.append("\n      PrivateLazyDeltaWriter __obj = __writer.planObject();");
    gold.append("\n      __dx.show(__item.x, __obj.planField(\"x\"));");
    gold.append("\n      __dy.show(__item.y, __obj.planField(\"y\"));");
    gold.append("\n      if (__obj.end()) {");
    gold.append("\n        __emitted = true;");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n    public void hide(PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      if (__emitted) {");
    gold.append("\n        __emitted = false;");
    gold.append("\n        __writer.writeNull();");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  private int __FUNC_0_foo(NtList<Integer> things) {");
    gold.append("\n    __code_cost += 4;");
    gold.append("\n    __track(0);");
    gold.append("\n    int sum = 0;");
    gold.append("\n    __track(1);");
    gold.append("\n    for(Integer x : things.get()) {");
    gold.append("\n      __code_cost += 2;");
    gold.append("\n      __track(2);");
    gold.append("\n      sum += x;");
    gold.append("\n    }");
    gold.append("\n    __track(3);");
    gold.append("\n    return sum;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __route(AsyncTask task) {");
    gold.append("\n    return;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected Object __parse_message2(String channel, JsonStreamReader __reader) {");
    gold.append("\n    __reader.skipValue();");
    gold.append("\n    return NtMessageBase.NULL;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __reset_future_queues() {");
    gold.append("\n  }");
    gold.append("\n  private void __step_setup() {");
    gold.append("\n    __code_cost += 7;");
    gold.append("\n    __track(4);");
    gold.append("\n    {");
    gold.append("\n      RxTable<RTxThing> _AutoRef4 = things;");
    gold.append("\n      RTx_AnonObjConvert_1 _AutoExpr6 = new RTx_AnonObjConvert_1(1, 3.14);");
    gold.append("\n      RTxThing _CreateRef5 = _AutoRef4.make();");
    gold.append("\n      __code_cost += 2;");
    gold.append("\n      _CreateRef5.x.set(_AutoExpr6.x);");
    gold.append("\n      _CreateRef5.y.set(_AutoExpr6.y);");
    gold.append("\n    }");
    gold.append("\n    __track(5);");
    gold.append("\n    {");
    gold.append("\n      RxTable<RTxThing> _AutoRef7 = things;");
    gold.append("\n      RTx_AnonObjConvert_1 _AutoExpr9 = new RTx_AnonObjConvert_1(2, 10.0);");
    gold.append("\n      RTxThing _CreateRef8 = _AutoRef7.make();");
    gold.append("\n      __code_cost += 2;");
    gold.append("\n      _CreateRef8.x.set(_AutoExpr9.x);");
    gold.append("\n      _CreateRef8.y.set(_AutoExpr9.y);");
    gold.append("\n    }");
    gold.append("\n    __track(6);");
    gold.append("\n    {");
    gold.append("\n      RxTable<RTxThing> _AutoRef10 = things;");
    gold.append("\n      RTx_AnonObjConvert_1 _AutoExpr12 = new RTx_AnonObjConvert_1(3, 1000.0);");
    gold.append("\n      RTxThing _CreateRef11 = _AutoRef10.make();");
    gold.append("\n      __code_cost += 2;");
    gold.append("\n      _CreateRef11.x.set(_AutoExpr12.x);");
    gold.append("\n      _CreateRef11.y.set(_AutoExpr12.y);");
    gold.append("\n    }");
    gold.append("\n    __track(7);");
    gold.append("\n    result.set(__FUNC_0_foo((things.iterate(true)).transform((item) -> item.x.get())));");
    gold.append("\n    __track(8);");
    gold.append("\n    result2.set(LibStatistics.sumInts((things.iterate(true)).transform((item) -> item.x.get())));");
    gold.append("\n    __track(9);");
    gold.append("\n    result3.set(LibStatistics.sumDoubles((things.iterate(true)).transform((item) -> item.y.get())));");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __invoke_label(String __new_state) {");
    gold.append("\n    switch(__new_state) {");
    gold.append("\n      case \"setup\":");
    gold.append("\n        __step_setup();");
    gold.append("\n        return;");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public boolean __onConnected(NtClient __cvalue) {");
    gold.append("\n    boolean __result = false;");
    gold.append("\n    return __result;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __onDisconnected(NtClient __cvalue) {}");
    gold.append("\n  @Override");
    gold.append("\n  public String[] __getTests() {");
    gold.append("\n    return new String[] {};");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __test(TestReportBuilder report, String testName) {}");
    gold.append("\n  private void __construct_0(NtClient __who, NtMessageBase __object) {");
    gold.append("\n    __code_cost += 2;");
    gold.append("\n    __track(10);");
    gold.append("\n    __transitionStateMachine(\"setup\", 0);");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected NtMessageBase __parse_construct_arg(JsonStreamReader __reader) {");
    gold.append("\n    __reader.skipValue();");
    gold.append("\n    return NtMessageBase.NULL;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __construct_intern(NtClient __who, NtMessageBase __object) {");
    gold.append("\n    __construct_0(__who, __object);");
    gold.append("\n  }");
    gold.append("\n  /* end of file */");
    gold.append("\n}");
    gold.append("\n");
    gold.append("\n--JAVA COMPILE RESULTS-----------------------------");
    gold.append("\n--JAVA RUNNING-------------------------------------");
    gold.append("\n{\"command\":\"construct\",\"timestamp\":\"0\",\"who\":{\"agent\":\"?\",\"authority\":\"?\"},\"arg\":{},\"entropy\":\"0\"}-->{\"__state\":\"setup\",\"__constructed\":true,\"__entropy\":\"0\"} need:true in:0");
    gold.append("\nNO_ONE was DENIED:5011");
    gold.append("\nRANDO was DENIED:5011");
    gold.append("\n+ NO_ONE DELTA:{\"data\":{},\"outstanding\":[],\"blockers\":[],\"seq\":1}");
    gold.append("\n+ RANDO DELTA:{\"data\":{},\"outstanding\":[],\"blockers\":[],\"seq\":1}");
    gold.append("\n{\"command\":\"invalidate\",\"timestamp\":\"25\"}-->{\"__messages\":null,\"__state\":\"\",\"__seq\":1,\"__entropy\":\"-4962768465676381896\",\"__time\":\"25\",\"things\":{\"auto_key\":3,\"rows\":{\"0\":{\"x\":1,\"y\":3.14,\"id\":0},\"1\":{\"x\":2,\"y\":10.0,\"id\":1},\"2\":{\"x\":3,\"y\":1000.0,\"id\":2}}},\"result\":6,\"result2\":6,\"result3\":1013.14} need:false in:-25");
    gold.append("\n{\"command\":\"bill\",\"timestamp\":\"50\"}-->{\"__goodwill_used\":0,\"__cost\":25,\"__billing_seq\":1} need:true in:0");
    gold.append("\n--JAVA RESULTS-------------------------------------");
    gold.append("\n{\"__state\":\"\",\"__constructed\":true,\"__entropy\":\"-4962768465676381896\",\"__seq\":1,\"__time\":\"25\",\"things\":{\"auto_key\":3,\"rows\":{\"0\":{\"x\":1,\"y\":3.14,\"id\":0},\"1\":{\"x\":2,\"y\":10.0,\"id\":1},\"2\":{\"x\":3,\"y\":1000.0,\"id\":2}}},\"result\":6,\"result2\":6,\"result3\":1013.14,\"__goodwill_used\":0,\"__cost\":25,\"__billing_seq\":1}");
    gold.append("\n--DUMP RESULTS-------------------------------------");
    gold.append("\n{\"things\":{\"auto_key\":3,\"rows\":{\"0\":{\"x\":1,\"y\":3.14,\"id\":0},\"1\":{\"x\":2,\"y\":10.0,\"id\":1},\"2\":{\"x\":3,\"y\":1000.0,\"id\":2}}},\"result\":6,\"result2\":6,\"result3\":1013.14,\"__state\":\"\",\"__constructed\":true,\"__next_time\":\"0\",\"__blocked\":false,\"__seq\":1,\"__entropy\":\"-4962768465676381896\",\"__auto_future_id\":0,\"__connection_id\":0,\"__message_id\":0,\"__time\":\"50\"}");
    gold.append("\n{\"things\":{\"auto_key\":3,\"rows\":{\"0\":{\"x\":1,\"y\":3.14,\"id\":0},\"1\":{\"x\":2,\"y\":10.0,\"id\":1},\"2\":{\"x\":3,\"y\":1000.0,\"id\":2}}},\"result\":6,\"result2\":6,\"result3\":1013.14,\"__state\":\"\",\"__constructed\":true,\"__next_time\":\"0\",\"__blocked\":false,\"__seq\":1,\"__entropy\":\"-4962768465676381896\",\"__auto_future_id\":0,\"__connection_id\":0,\"__message_id\":0,\"__time\":\"50\"}");
    gold.append("\n--JAVA TEST RESULTS--------------------------------");
    gold.append("\n");
    gold.append("\nSuccess");
    assertStable(live, gold);
  }
  private String cached_PureCantInvokeProcedure_13 = null;
  private String get_PureCantInvokeProcedure_13() {
    if (cached_PureCantInvokeProcedure_13 != null) {
      return cached_PureCantInvokeProcedure_13;
    }
    cached_PureCantInvokeProcedure_13 = generateTestOutput(false, "PureCantInvokeProcedure_13", "./test_code/Functions_PureCantInvokeProcedure_failure.a");
    return cached_PureCantInvokeProcedure_13;
  }

  @Test
  public void testPureCantInvokeProcedureFailure() {
    assertLiveFail(get_PureCantInvokeProcedure_13());
  }

  @Test
  public void testPureCantInvokeProcedureNotTerribleLineNumbers() {
    assertNotTerribleLineNumbers(get_PureCantInvokeProcedure_13());
  }

  @Test
  public void testPureCantInvokeProcedureExceptionFree() {
    assertExceptionFree(get_PureCantInvokeProcedure_13());
  }

  @Test
  public void testPureCantInvokeProcedureTODOFree() {
    assertTODOFree(get_PureCantInvokeProcedure_13());
  }

  @Test
  public void stable_PureCantInvokeProcedure_13() {
    String live = get_PureCantInvokeProcedure_13();
    StringBuilder gold = new StringBuilder();
    gold.append("Path:Functions_PureCantInvokeProcedure_failure.a");
    gold.append("\n--ISSUES-------------------------------------------");
    gold.append("\n[ {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 5,");
    gold.append("\n      \"character\" : 9");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 5,");
    gold.append("\n      \"character\" : 12");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"Pure functions can only call other pure functions (FunctionInvoke)\"");
    gold.append("\n}, {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 5,");
    gold.append("\n      \"character\" : 17");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 5,");
    gold.append("\n      \"character\" : 20");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"Pure functions can only call other pure functions (FunctionInvoke)\"");
    gold.append("\n} ]");
    gold.append("\n--JAVA---------------------------------------------");
    gold.append("\n");
    gold.append("\nFailedValidation");
    assertStable(live, gold);
  }
  private String cached_PureInvokePure_14 = null;
  private String get_PureInvokePure_14() {
    if (cached_PureInvokePure_14 != null) {
      return cached_PureInvokePure_14;
    }
    cached_PureInvokePure_14 = generateTestOutput(true, "PureInvokePure_14", "./test_code/Functions_PureInvokePure_success.a");
    return cached_PureInvokePure_14;
  }

  @Test
  public void testPureInvokePureEmission() {
    assertEmissionGood(get_PureInvokePure_14());
  }

  @Test
  public void testPureInvokePureSuccess() {
    assertLivePass(get_PureInvokePure_14());
  }

  @Test
  public void testPureInvokePureGoodWillHappy() {
    assertGoodWillHappy(get_PureInvokePure_14());
  }

  @Test
  public void testPureInvokePureExceptionFree() {
    assertExceptionFree(get_PureInvokePure_14());
  }

  @Test
  public void testPureInvokePureTODOFree() {
    assertTODOFree(get_PureInvokePure_14());
  }

  @Test
  public void stable_PureInvokePure_14() {
    String live = get_PureInvokePure_14();
    StringBuilder gold = new StringBuilder();
    gold.append("Path:Functions_PureInvokePure_success.a");
    gold.append("\n--EMISSION-----------------------------------------");
    gold.append("\nEmission Success, Yay");
    gold.append("\n--ISSUES-------------------------------------------");
    gold.append("\n[ ]");
    gold.append("\n--JAVA---------------------------------------------");
    gold.append("\nimport com.fasterxml.jackson.databind.JsonNode;");
    gold.append("\nimport com.fasterxml.jackson.databind.node.ArrayNode;");
    gold.append("\nimport com.fasterxml.jackson.databind.node.ObjectNode;");
    gold.append("\nimport org.adamalang.runtime.*;");
    gold.append("\nimport org.adamalang.runtime.async.*;");
    gold.append("\nimport org.adamalang.runtime.contracts.*;");
    gold.append("\nimport org.adamalang.runtime.delta.*;");
    gold.append("\nimport org.adamalang.runtime.exceptions.*;");
    gold.append("\nimport org.adamalang.runtime.index.*;");
    gold.append("\nimport org.adamalang.runtime.json.*;");
    gold.append("\nimport org.adamalang.runtime.natives.*;");
    gold.append("\nimport org.adamalang.runtime.natives.lists.*;");
    gold.append("\nimport org.adamalang.runtime.ops.*;");
    gold.append("\nimport org.adamalang.runtime.reactives.*;");
    gold.append("\nimport org.adamalang.runtime.stdlib.*;");
    gold.append("\nimport java.util.function.Consumer;");
    gold.append("\nimport java.util.function.Function;");
    gold.append("\nimport java.util.ArrayList;");
    gold.append("\nimport java.util.Comparator;");
    gold.append("\nimport java.util.Map;");
    gold.append("\nimport java.lang.Math;");
    gold.append("\npublic class PureInvokePure_14 extends LivingDocument {");
    gold.append("\n  public PureInvokePure_14(DocumentMonitor __monitor) {");
    gold.append("\n    super(__monitor);");
    gold.append("\n    __goodwillBudget = 100000;");
    gold.append("\n    __goodwillLimitOfBudget = 100000;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __insert(JsonStreamReader __reader) {");
    gold.append("\n    if (__reader.startObject()) {");
    gold.append("\n      while(__reader.notEndOfObject()) {");
    gold.append("\n        String __fieldName = __reader.fieldName();");
    gold.append("\n        switch (__fieldName) {");
    gold.append("\n          case \"__state\":");
    gold.append("\n            __state.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__constructed\":");
    gold.append("\n            __constructed.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__next_time\":");
    gold.append("\n            __next_time.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__blocked\":");
    gold.append("\n            __blocked.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__seq\":");
    gold.append("\n            __seq.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__entropy\":");
    gold.append("\n            __entropy.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__auto_future_id\":");
    gold.append("\n            __auto_future_id.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__connection_id\":");
    gold.append("\n            __connection_id.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__message_id\":");
    gold.append("\n            __message_id.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__time\":");
    gold.append("\n            __time.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__clients\":");
    gold.append("\n            __hydrateClients(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__messages\":");
    gold.append("\n            __hydrateMessages(__reader);");
    gold.append("\n            break;");
    gold.append("\n          default:");
    gold.append("\n            __reader.skipValue();");
    gold.append("\n        }");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __dump(JsonStreamWriter __writer) {");
    gold.append("\n    __writer.beginObject();");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__state\");");
    gold.append("\n    __state.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__constructed\");");
    gold.append("\n    __constructed.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__next_time\");");
    gold.append("\n    __next_time.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__blocked\");");
    gold.append("\n    __blocked.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__seq\");");
    gold.append("\n    __seq.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__entropy\");");
    gold.append("\n    __entropy.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__auto_future_id\");");
    gold.append("\n    __auto_future_id.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__connection_id\");");
    gold.append("\n    __connection_id.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__message_id\");");
    gold.append("\n    __message_id.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__time\");");
    gold.append("\n    __time.__dump(__writer);");
    gold.append("\n    __dumpClients(__writer);");
    gold.append("\n    __dumpMessages(__writer);");
    gold.append("\n    __writer.endObject();");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __commit(String __name, JsonStreamWriter __forward, JsonStreamWriter __reverse) {");
    gold.append("\n    __state.__commit(\"__state\", __forward, __reverse);");
    gold.append("\n    __constructed.__commit(\"__constructed\", __forward, __reverse);");
    gold.append("\n    __next_time.__commit(\"__next_time\", __forward, __reverse);");
    gold.append("\n    __blocked.__commit(\"__blocked\", __forward, __reverse);");
    gold.append("\n    __seq.__commit(\"__seq\", __forward, __reverse);");
    gold.append("\n    __entropy.__commit(\"__entropy\", __forward, __reverse);");
    gold.append("\n    __auto_future_id.__commit(\"__auto_future_id\", __forward, __reverse);");
    gold.append("\n    __connection_id.__commit(\"__connection_id\", __forward, __reverse);");
    gold.append("\n    __message_id.__commit(\"__message_id\", __forward, __reverse);");
    gold.append("\n    __time.__commit(\"__time\", __forward, __reverse);");
    gold.append("\n    /* root */");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __revert() {");
    gold.append("\n    __state.__revert();");
    gold.append("\n    __constructed.__revert();");
    gold.append("\n    __next_time.__revert();");
    gold.append("\n    __blocked.__revert();");
    gold.append("\n    __seq.__revert();");
    gold.append("\n    __entropy.__revert();");
    gold.append("\n    __auto_future_id.__revert();");
    gold.append("\n    __connection_id.__revert();");
    gold.append("\n    __message_id.__revert();");
    gold.append("\n    __time.__revert();");
    gold.append("\n    /* root */");
    gold.append("\n  }");
    gold.append("\n  private class DeltaPureInvokePure_14 {");
    gold.append("\n    private boolean __emitted;");
    gold.append("\n    private DeltaPureInvokePure_14() {");
    gold.append("\n      __emitted = false;");
    gold.append("\n    }");
    gold.append("\n    public void show(PureInvokePure_14 __item, PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      PrivateLazyDeltaWriter __obj = __writer.planObject();");
    gold.append("\n      __obj.manifest();");
    gold.append("\n      if (__obj.end()) {");
    gold.append("\n        __emitted = true;");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n    public void hide(PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      if (__emitted) {");
    gold.append("\n        __emitted = false;");
    gold.append("\n        __writer.writeNull();");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public PrivateView __createPrivateView(NtClient __who, Consumer<String> __updates) {");
    gold.append("\n    PureInvokePure_14 __self = this;");
    gold.append("\n    DeltaPureInvokePure_14 __state = new DeltaPureInvokePure_14();");
    gold.append("\n    return new PrivateView(__who, __updates) {");
    gold.append("\n      @Override");
    gold.append("\n      public void update(JsonStreamWriter __writer) {");
    gold.append("\n        __state.show(__self, PrivateLazyDeltaWriter.bind(__who, __writer));");
    gold.append("\n      }");
    gold.append("\n    };");
    gold.append("\n  }");
    gold.append("\n  private int __FUNC_0_foo() {");
    gold.append("\n    __code_cost += 2;");
    gold.append("\n    __track(0);");
    gold.append("\n    return 4;");
    gold.append("\n  }");
    gold.append("\n  private int __FUNC_1_goo() {");
    gold.append("\n    __code_cost += 2;");
    gold.append("\n    __track(0);");
    gold.append("\n    return __FUNC_0_foo() * __FUNC_0_foo();");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __route(AsyncTask task) {");
    gold.append("\n    return;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected Object __parse_message2(String channel, JsonStreamReader __reader) {");
    gold.append("\n    __reader.skipValue();");
    gold.append("\n    return NtMessageBase.NULL;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __reset_future_queues() {");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __invoke_label(String __new_state) {}");
    gold.append("\n  @Override");
    gold.append("\n  public boolean __onConnected(NtClient __cvalue) {");
    gold.append("\n    boolean __result = false;");
    gold.append("\n    return __result;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __onDisconnected(NtClient __cvalue) {}");
    gold.append("\n  @Override");
    gold.append("\n  public String[] __getTests() {");
    gold.append("\n    return new String[] {};");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __test(TestReportBuilder report, String testName) {}");
    gold.append("\n  @Override");
    gold.append("\n  protected void __construct_intern(NtClient who, NtMessageBase message) {}");
    gold.append("\n  @Override");
    gold.append("\n  protected NtMessageBase __parse_construct_arg(JsonStreamReader __reader) {");
    gold.append("\n    __reader.skipValue();");
    gold.append("\n    return NtMessageBase.NULL;");
    gold.append("\n  }");
    gold.append("\n  /* end of file */");
    gold.append("\n}");
    gold.append("\n");
    gold.append("\n--JAVA COMPILE RESULTS-----------------------------");
    gold.append("\n--JAVA RUNNING-------------------------------------");
    gold.append("\n{\"command\":\"construct\",\"timestamp\":\"0\",\"who\":{\"agent\":\"?\",\"authority\":\"?\"},\"arg\":{},\"entropy\":\"0\"}-->{\"__constructed\":true,\"__entropy\":\"0\"} need:true in:0");
    gold.append("\nNO_ONE was DENIED:5011");
    gold.append("\nRANDO was DENIED:5011");
    gold.append("\n+ NO_ONE DELTA:{\"data\":{},\"outstanding\":[],\"blockers\":[],\"seq\":1}");
    gold.append("\n+ RANDO DELTA:{\"data\":{},\"outstanding\":[],\"blockers\":[],\"seq\":1}");
    gold.append("\n{\"command\":\"invalidate\",\"timestamp\":\"25\"}-->{\"__messages\":null,\"__seq\":1,\"__entropy\":\"-4962768465676381896\",\"__time\":\"25\"} need:false in:-25");
    gold.append("\n{\"command\":\"bill\",\"timestamp\":\"50\"}-->{\"__goodwill_used\":0,\"__cost\":0,\"__billing_seq\":1} need:true in:0");
    gold.append("\n--JAVA RESULTS-------------------------------------");
    gold.append("\n{\"__constructed\":true,\"__entropy\":\"-4962768465676381896\",\"__seq\":1,\"__time\":\"25\",\"__goodwill_used\":0,\"__cost\":0,\"__billing_seq\":1}");
    gold.append("\n--DUMP RESULTS-------------------------------------");
    gold.append("\n{\"__state\":\"\",\"__constructed\":true,\"__next_time\":\"0\",\"__blocked\":false,\"__seq\":1,\"__entropy\":\"-4962768465676381896\",\"__auto_future_id\":0,\"__connection_id\":0,\"__message_id\":0,\"__time\":\"50\"}");
    gold.append("\n{\"__state\":\"\",\"__constructed\":true,\"__next_time\":\"0\",\"__blocked\":false,\"__seq\":1,\"__entropy\":\"-4962768465676381896\",\"__auto_future_id\":0,\"__connection_id\":0,\"__message_id\":0,\"__time\":\"50\"}");
    gold.append("\n--JAVA TEST RESULTS--------------------------------");
    gold.append("\n");
    gold.append("\nSuccess");
    assertStable(live, gold);
  }
  private String cached_PureMustReturn_15 = null;
  private String get_PureMustReturn_15() {
    if (cached_PureMustReturn_15 != null) {
      return cached_PureMustReturn_15;
    }
    cached_PureMustReturn_15 = generateTestOutput(false, "PureMustReturn_15", "./test_code/Functions_PureMustReturn_failure.a");
    return cached_PureMustReturn_15;
  }

  @Test
  public void testPureMustReturnFailure() {
    assertLiveFail(get_PureMustReturn_15());
  }

  @Test
  public void testPureMustReturnNotTerribleLineNumbers() {
    assertNotTerribleLineNumbers(get_PureMustReturn_15());
  }

  @Test
  public void testPureMustReturnExceptionFree() {
    assertExceptionFree(get_PureMustReturn_15());
  }

  @Test
  public void testPureMustReturnTODOFree() {
    assertTODOFree(get_PureMustReturn_15());
  }

  @Test
  public void stable_PureMustReturn_15() {
    String live = get_PureMustReturn_15();
    StringBuilder gold = new StringBuilder();
    gold.append("Path:Functions_PureMustReturn_failure.a");
    gold.append("\n--ISSUES-------------------------------------------");
    gold.append("\n[ {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 0,");
    gold.append("\n      \"character\" : 0");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 1,");
    gold.append("\n      \"character\" : 1");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"The function 'whoops1' does not return in all cases (FunctionDefine)\"");
    gold.append("\n}, {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 3,");
    gold.append("\n      \"character\" : 0");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 8,");
    gold.append("\n      \"character\" : 1");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"The function 'whoops2' does not return in all cases (FunctionDefine)\"");
    gold.append("\n} ]");
    gold.append("\n--JAVA---------------------------------------------");
    gold.append("\n");
    gold.append("\nFailedValidation");
    assertStable(live, gold);
  }
  private String cached_PureVariablesReadOnly_16 = null;
  private String get_PureVariablesReadOnly_16() {
    if (cached_PureVariablesReadOnly_16 != null) {
      return cached_PureVariablesReadOnly_16;
    }
    cached_PureVariablesReadOnly_16 = generateTestOutput(false, "PureVariablesReadOnly_16", "./test_code/Functions_PureVariablesReadOnly_failure.a");
    return cached_PureVariablesReadOnly_16;
  }

  @Test
  public void testPureVariablesReadOnlyFailure() {
    assertLiveFail(get_PureVariablesReadOnly_16());
  }

  @Test
  public void testPureVariablesReadOnlyNotTerribleLineNumbers() {
    assertNotTerribleLineNumbers(get_PureVariablesReadOnly_16());
  }

  @Test
  public void testPureVariablesReadOnlyExceptionFree() {
    assertExceptionFree(get_PureVariablesReadOnly_16());
  }

  @Test
  public void testPureVariablesReadOnlyTODOFree() {
    assertTODOFree(get_PureVariablesReadOnly_16());
  }

  @Test
  public void stable_PureVariablesReadOnly_16() {
    String live = get_PureVariablesReadOnly_16();
    StringBuilder gold = new StringBuilder();
    gold.append("Path:Functions_PureVariablesReadOnly_failure.a");
    gold.append("\n--ISSUES-------------------------------------------");
    gold.append("\n[ {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 1,");
    gold.append("\n      \"character\" : 2");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 1,");
    gold.append("\n      \"character\" : 3");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"The variable 'x' is readonly (VariableLookup)\"");
    gold.append("\n}, {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 0,");
    gold.append("\n      \"character\" : 0");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 2,");
    gold.append("\n      \"character\" : 1");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"The function 'whoops1' does not return in all cases (FunctionDefine)\"");
    gold.append("\n}, {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 11,");
    gold.append("\n      \"character\" : 2");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 11,");
    gold.append("\n      \"character\" : 3");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"The variable 'z' is readonly due to the environment (VariableLookup)\"");
    gold.append("\n}, {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 16,");
    gold.append("\n      \"character\" : 9");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 16,");
    gold.append("\n      \"character\" : 10");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"The variable 'z' was not defined (VariableLookup)\"");
    gold.append("\n}, {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 15,");
    gold.append("\n      \"character\" : 0");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 17,");
    gold.append("\n      \"character\" : 1");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"The function 'cantread' does not return in all cases (FunctionDefine)\"");
    gold.append("\n} ]");
    gold.append("\n--JAVA---------------------------------------------");
    gold.append("\n");
    gold.append("\nFailedValidation");
    assertStable(live, gold);
  }
  private String cached_ReactiveCantInvokeProcedure_17 = null;
  private String get_ReactiveCantInvokeProcedure_17() {
    if (cached_ReactiveCantInvokeProcedure_17 != null) {
      return cached_ReactiveCantInvokeProcedure_17;
    }
    cached_ReactiveCantInvokeProcedure_17 = generateTestOutput(false, "ReactiveCantInvokeProcedure_17", "./test_code/Functions_ReactiveCantInvokeProcedure_failure.a");
    return cached_ReactiveCantInvokeProcedure_17;
  }

  @Test
  public void testReactiveCantInvokeProcedureFailure() {
    assertLiveFail(get_ReactiveCantInvokeProcedure_17());
  }

  @Test
  public void testReactiveCantInvokeProcedureNotTerribleLineNumbers() {
    assertNotTerribleLineNumbers(get_ReactiveCantInvokeProcedure_17());
  }

  @Test
  public void testReactiveCantInvokeProcedureExceptionFree() {
    assertExceptionFree(get_ReactiveCantInvokeProcedure_17());
  }

  @Test
  public void testReactiveCantInvokeProcedureTODOFree() {
    assertTODOFree(get_ReactiveCantInvokeProcedure_17());
  }

  @Test
  public void stable_ReactiveCantInvokeProcedure_17() {
    String live = get_ReactiveCantInvokeProcedure_17();
    StringBuilder gold = new StringBuilder();
    gold.append("Path:Functions_ReactiveCantInvokeProcedure_failure.a");
    gold.append("\n--ISSUES-------------------------------------------");
    gold.append("\n[ {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 4,");
    gold.append("\n      \"character\" : 16");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 4,");
    gold.append("\n      \"character\" : 19");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"Reactive expressions can only invoke pure functions (FunctionInvoke)\"");
    gold.append("\n}, {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 6,");
    gold.append("\n      \"character\" : 21");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 6,");
    gold.append("\n      \"character\" : 24");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"Reactive expressions can only invoke pure functions (FunctionInvoke)\"");
    gold.append("\n} ]");
    gold.append("\n--JAVA---------------------------------------------");
    gold.append("\n");
    gold.append("\nFailedValidation");
    assertStable(live, gold);
  }
  private String cached_ReactiveInvokePure_18 = null;
  private String get_ReactiveInvokePure_18() {
    if (cached_ReactiveInvokePure_18 != null) {
      return cached_ReactiveInvokePure_18;
    }
    cached_ReactiveInvokePure_18 = generateTestOutput(true, "ReactiveInvokePure_18", "./test_code/Functions_ReactiveInvokePure_success.a");
    return cached_ReactiveInvokePure_18;
  }

  @Test
  public void testReactiveInvokePureEmission() {
    assertEmissionGood(get_ReactiveInvokePure_18());
  }

  @Test
  public void testReactiveInvokePureSuccess() {
    assertLivePass(get_ReactiveInvokePure_18());
  }

  @Test
  public void testReactiveInvokePureGoodWillHappy() {
    assertGoodWillHappy(get_ReactiveInvokePure_18());
  }

  @Test
  public void testReactiveInvokePureExceptionFree() {
    assertExceptionFree(get_ReactiveInvokePure_18());
  }

  @Test
  public void testReactiveInvokePureTODOFree() {
    assertTODOFree(get_ReactiveInvokePure_18());
  }

  @Test
  public void stable_ReactiveInvokePure_18() {
    String live = get_ReactiveInvokePure_18();
    StringBuilder gold = new StringBuilder();
    gold.append("Path:Functions_ReactiveInvokePure_success.a");
    gold.append("\n--EMISSION-----------------------------------------");
    gold.append("\nEmission Success, Yay");
    gold.append("\n--ISSUES-------------------------------------------");
    gold.append("\n[ ]");
    gold.append("\n--JAVA---------------------------------------------");
    gold.append("\nimport com.fasterxml.jackson.databind.JsonNode;");
    gold.append("\nimport com.fasterxml.jackson.databind.node.ArrayNode;");
    gold.append("\nimport com.fasterxml.jackson.databind.node.ObjectNode;");
    gold.append("\nimport org.adamalang.runtime.*;");
    gold.append("\nimport org.adamalang.runtime.async.*;");
    gold.append("\nimport org.adamalang.runtime.contracts.*;");
    gold.append("\nimport org.adamalang.runtime.delta.*;");
    gold.append("\nimport org.adamalang.runtime.exceptions.*;");
    gold.append("\nimport org.adamalang.runtime.index.*;");
    gold.append("\nimport org.adamalang.runtime.json.*;");
    gold.append("\nimport org.adamalang.runtime.natives.*;");
    gold.append("\nimport org.adamalang.runtime.natives.lists.*;");
    gold.append("\nimport org.adamalang.runtime.ops.*;");
    gold.append("\nimport org.adamalang.runtime.reactives.*;");
    gold.append("\nimport org.adamalang.runtime.stdlib.*;");
    gold.append("\nimport java.util.function.Consumer;");
    gold.append("\nimport java.util.function.Function;");
    gold.append("\nimport java.util.ArrayList;");
    gold.append("\nimport java.util.Comparator;");
    gold.append("\nimport java.util.Map;");
    gold.append("\nimport java.lang.Math;");
    gold.append("\npublic class ReactiveInvokePure_18 extends LivingDocument {");
    gold.append("\n  private final RxLazy<Integer> goo;");
    gold.append("\n  private final RxGuard ___you;");
    gold.append("\n  public int __COMPUTE_you(NtClient c) {");
    gold.append("\n    return __FUNC_0_foo();");
    gold.append("\n  }");
    gold.append("\n  public ReactiveInvokePure_18(DocumentMonitor __monitor) {");
    gold.append("\n    super(__monitor);");
    gold.append("\n    goo = new RxLazy<Integer>(this, () -> (__FUNC_0_foo()));");
    gold.append("\n    ___you =  new RxGuard();");
    gold.append("\n    __goodwillBudget = 100000;");
    gold.append("\n    __goodwillLimitOfBudget = 100000;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __insert(JsonStreamReader __reader) {");
    gold.append("\n    if (__reader.startObject()) {");
    gold.append("\n      while(__reader.notEndOfObject()) {");
    gold.append("\n        String __fieldName = __reader.fieldName();");
    gold.append("\n        switch (__fieldName) {");
    gold.append("\n          case \"__state\":");
    gold.append("\n            __state.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__constructed\":");
    gold.append("\n            __constructed.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__next_time\":");
    gold.append("\n            __next_time.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__blocked\":");
    gold.append("\n            __blocked.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__seq\":");
    gold.append("\n            __seq.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__entropy\":");
    gold.append("\n            __entropy.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__auto_future_id\":");
    gold.append("\n            __auto_future_id.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__connection_id\":");
    gold.append("\n            __connection_id.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__message_id\":");
    gold.append("\n            __message_id.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__time\":");
    gold.append("\n            __time.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__clients\":");
    gold.append("\n            __hydrateClients(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__messages\":");
    gold.append("\n            __hydrateMessages(__reader);");
    gold.append("\n            break;");
    gold.append("\n          default:");
    gold.append("\n            __reader.skipValue();");
    gold.append("\n        }");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __dump(JsonStreamWriter __writer) {");
    gold.append("\n    __writer.beginObject();");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__state\");");
    gold.append("\n    __state.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__constructed\");");
    gold.append("\n    __constructed.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__next_time\");");
    gold.append("\n    __next_time.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__blocked\");");
    gold.append("\n    __blocked.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__seq\");");
    gold.append("\n    __seq.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__entropy\");");
    gold.append("\n    __entropy.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__auto_future_id\");");
    gold.append("\n    __auto_future_id.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__connection_id\");");
    gold.append("\n    __connection_id.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__message_id\");");
    gold.append("\n    __message_id.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__time\");");
    gold.append("\n    __time.__dump(__writer);");
    gold.append("\n    __dumpClients(__writer);");
    gold.append("\n    __dumpMessages(__writer);");
    gold.append("\n    __writer.endObject();");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __commit(String __name, JsonStreamWriter __forward, JsonStreamWriter __reverse) {");
    gold.append("\n    __state.__commit(\"__state\", __forward, __reverse);");
    gold.append("\n    __constructed.__commit(\"__constructed\", __forward, __reverse);");
    gold.append("\n    __next_time.__commit(\"__next_time\", __forward, __reverse);");
    gold.append("\n    __blocked.__commit(\"__blocked\", __forward, __reverse);");
    gold.append("\n    __seq.__commit(\"__seq\", __forward, __reverse);");
    gold.append("\n    __entropy.__commit(\"__entropy\", __forward, __reverse);");
    gold.append("\n    __auto_future_id.__commit(\"__auto_future_id\", __forward, __reverse);");
    gold.append("\n    __connection_id.__commit(\"__connection_id\", __forward, __reverse);");
    gold.append("\n    __message_id.__commit(\"__message_id\", __forward, __reverse);");
    gold.append("\n    __time.__commit(\"__time\", __forward, __reverse);");
    gold.append("\n    /* root */");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __revert() {");
    gold.append("\n    __state.__revert();");
    gold.append("\n    __constructed.__revert();");
    gold.append("\n    __next_time.__revert();");
    gold.append("\n    __blocked.__revert();");
    gold.append("\n    __seq.__revert();");
    gold.append("\n    __entropy.__revert();");
    gold.append("\n    __auto_future_id.__revert();");
    gold.append("\n    __connection_id.__revert();");
    gold.append("\n    __message_id.__revert();");
    gold.append("\n    __time.__revert();");
    gold.append("\n    /* root */");
    gold.append("\n  }");
    gold.append("\n  private class DeltaReactiveInvokePure_18 {");
    gold.append("\n    private int __gyou;");
    gold.append("\n    private DInt32 __dyou;");
    gold.append("\n    private boolean __emitted;");
    gold.append("\n    private DeltaReactiveInvokePure_18() {");
    gold.append("\n      __gyou = -1;");
    gold.append("\n      __dyou = new DInt32();");
    gold.append("\n      __emitted = false;");
    gold.append("\n    }");
    gold.append("\n    public void show(ReactiveInvokePure_18 __item, PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      __code_cost += 1;");
    gold.append("\n      PrivateLazyDeltaWriter __obj = __writer.planObject();");
    gold.append("\n      __obj.manifest();");
    gold.append("\n      if (__gyou != __item.___you.getGeneration()) {");
    gold.append("\n        Integer __local_you = __item.__COMPUTE_you(__writer.who);");
    gold.append("\n        __dyou.show(__local_you, __obj.planField(\"you\"));");
    gold.append("\n        __gyou = __item.___you.getGeneration();");
    gold.append("\n      }");
    gold.append("\n      if (__obj.end()) {");
    gold.append("\n        __emitted = true;");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n    public void hide(PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      if (__emitted) {");
    gold.append("\n        __emitted = false;");
    gold.append("\n        __writer.writeNull();");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public PrivateView __createPrivateView(NtClient __who, Consumer<String> __updates) {");
    gold.append("\n    ReactiveInvokePure_18 __self = this;");
    gold.append("\n    DeltaReactiveInvokePure_18 __state = new DeltaReactiveInvokePure_18();");
    gold.append("\n    return new PrivateView(__who, __updates) {");
    gold.append("\n      @Override");
    gold.append("\n      public void update(JsonStreamWriter __writer) {");
    gold.append("\n        __state.show(__self, PrivateLazyDeltaWriter.bind(__who, __writer));");
    gold.append("\n      }");
    gold.append("\n    };");
    gold.append("\n  }");
    gold.append("\n  private int __FUNC_0_foo() {");
    gold.append("\n    __code_cost += 2;");
    gold.append("\n    __track(0);");
    gold.append("\n    return 4;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __route(AsyncTask task) {");
    gold.append("\n    return;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected Object __parse_message2(String channel, JsonStreamReader __reader) {");
    gold.append("\n    __reader.skipValue();");
    gold.append("\n    return NtMessageBase.NULL;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __reset_future_queues() {");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __invoke_label(String __new_state) {}");
    gold.append("\n  @Override");
    gold.append("\n  public boolean __onConnected(NtClient __cvalue) {");
    gold.append("\n    boolean __result = false;");
    gold.append("\n    return __result;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __onDisconnected(NtClient __cvalue) {}");
    gold.append("\n  @Override");
    gold.append("\n  public String[] __getTests() {");
    gold.append("\n    return new String[] {};");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __test(TestReportBuilder report, String testName) {}");
    gold.append("\n  @Override");
    gold.append("\n  protected void __construct_intern(NtClient who, NtMessageBase message) {}");
    gold.append("\n  @Override");
    gold.append("\n  protected NtMessageBase __parse_construct_arg(JsonStreamReader __reader) {");
    gold.append("\n    __reader.skipValue();");
    gold.append("\n    return NtMessageBase.NULL;");
    gold.append("\n  }");
    gold.append("\n  /* end of file */");
    gold.append("\n}");
    gold.append("\n");
    gold.append("\n--JAVA COMPILE RESULTS-----------------------------");
    gold.append("\n--JAVA RUNNING-------------------------------------");
    gold.append("\n{\"command\":\"construct\",\"timestamp\":\"0\",\"who\":{\"agent\":\"?\",\"authority\":\"?\"},\"arg\":{},\"entropy\":\"0\"}-->{\"__constructed\":true,\"__entropy\":\"0\"} need:true in:0");
    gold.append("\nNO_ONE was DENIED:5011");
    gold.append("\nRANDO was DENIED:5011");
    gold.append("\n+ NO_ONE DELTA:{\"data\":{\"you\":4},\"outstanding\":[],\"blockers\":[],\"seq\":1}");
    gold.append("\n+ RANDO DELTA:{\"data\":{\"you\":4},\"outstanding\":[],\"blockers\":[],\"seq\":1}");
    gold.append("\n{\"command\":\"invalidate\",\"timestamp\":\"25\"}-->{\"__messages\":null,\"__seq\":1,\"__entropy\":\"-4962768465676381896\",\"__time\":\"25\"} need:false in:-25");
    gold.append("\n{\"command\":\"bill\",\"timestamp\":\"50\"}-->{\"__goodwill_used\":0,\"__cost\":6,\"__billing_seq\":1} need:true in:0");
    gold.append("\n--JAVA RESULTS-------------------------------------");
    gold.append("\n{\"__constructed\":true,\"__entropy\":\"-4962768465676381896\",\"__seq\":1,\"__time\":\"25\",\"__goodwill_used\":0,\"__cost\":6,\"__billing_seq\":1}");
    gold.append("\n--DUMP RESULTS-------------------------------------");
    gold.append("\n{\"__state\":\"\",\"__constructed\":true,\"__next_time\":\"0\",\"__blocked\":false,\"__seq\":1,\"__entropy\":\"-4962768465676381896\",\"__auto_future_id\":0,\"__connection_id\":0,\"__message_id\":0,\"__time\":\"50\"}");
    gold.append("\n{\"__state\":\"\",\"__constructed\":true,\"__next_time\":\"0\",\"__blocked\":false,\"__seq\":1,\"__entropy\":\"-4962768465676381896\",\"__auto_future_id\":0,\"__connection_id\":0,\"__message_id\":0,\"__time\":\"50\"}");
    gold.append("\n--JAVA TEST RESULTS--------------------------------");
    gold.append("\n");
    gold.append("\nSuccess");
    assertStable(live, gold);
  }
  private String cached_ReadOnly_19 = null;
  private String get_ReadOnly_19() {
    if (cached_ReadOnly_19 != null) {
      return cached_ReadOnly_19;
    }
    cached_ReadOnly_19 = generateTestOutput(true, "ReadOnly_19", "./test_code/Functions_ReadOnly_success.a");
    return cached_ReadOnly_19;
  }

  @Test
  public void testReadOnlyEmission() {
    assertEmissionGood(get_ReadOnly_19());
  }

  @Test
  public void testReadOnlySuccess() {
    assertLivePass(get_ReadOnly_19());
  }

  @Test
  public void testReadOnlyGoodWillHappy() {
    assertGoodWillHappy(get_ReadOnly_19());
  }

  @Test
  public void testReadOnlyExceptionFree() {
    assertExceptionFree(get_ReadOnly_19());
  }

  @Test
  public void testReadOnlyTODOFree() {
    assertTODOFree(get_ReadOnly_19());
  }

  @Test
  public void stable_ReadOnly_19() {
    String live = get_ReadOnly_19();
    StringBuilder gold = new StringBuilder();
    gold.append("Path:Functions_ReadOnly_success.a");
    gold.append("\n--EMISSION-----------------------------------------");
    gold.append("\nEmission Success, Yay");
    gold.append("\n--ISSUES-------------------------------------------");
    gold.append("\n[ ]");
    gold.append("\n--JAVA---------------------------------------------");
    gold.append("\nimport com.fasterxml.jackson.databind.JsonNode;");
    gold.append("\nimport com.fasterxml.jackson.databind.node.ArrayNode;");
    gold.append("\nimport com.fasterxml.jackson.databind.node.ObjectNode;");
    gold.append("\nimport org.adamalang.runtime.*;");
    gold.append("\nimport org.adamalang.runtime.async.*;");
    gold.append("\nimport org.adamalang.runtime.contracts.*;");
    gold.append("\nimport org.adamalang.runtime.delta.*;");
    gold.append("\nimport org.adamalang.runtime.exceptions.*;");
    gold.append("\nimport org.adamalang.runtime.index.*;");
    gold.append("\nimport org.adamalang.runtime.json.*;");
    gold.append("\nimport org.adamalang.runtime.natives.*;");
    gold.append("\nimport org.adamalang.runtime.natives.lists.*;");
    gold.append("\nimport org.adamalang.runtime.ops.*;");
    gold.append("\nimport org.adamalang.runtime.reactives.*;");
    gold.append("\nimport org.adamalang.runtime.stdlib.*;");
    gold.append("\nimport java.util.function.Consumer;");
    gold.append("\nimport java.util.function.Function;");
    gold.append("\nimport java.util.ArrayList;");
    gold.append("\nimport java.util.Comparator;");
    gold.append("\nimport java.util.Map;");
    gold.append("\nimport java.lang.Math;");
    gold.append("\npublic class ReadOnly_19 extends LivingDocument {");
    gold.append("\n  private final RxInt32 z;");
    gold.append("\n  public ReadOnly_19(DocumentMonitor __monitor) {");
    gold.append("\n    super(__monitor);");
    gold.append("\n    z = new RxInt32(this, 0);");
    gold.append("\n    __goodwillBudget = 100000;");
    gold.append("\n    __goodwillLimitOfBudget = 100000;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __insert(JsonStreamReader __reader) {");
    gold.append("\n    if (__reader.startObject()) {");
    gold.append("\n      while(__reader.notEndOfObject()) {");
    gold.append("\n        String __fieldName = __reader.fieldName();");
    gold.append("\n        switch (__fieldName) {");
    gold.append("\n          case \"z\":");
    gold.append("\n            z.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__state\":");
    gold.append("\n            __state.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__constructed\":");
    gold.append("\n            __constructed.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__next_time\":");
    gold.append("\n            __next_time.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__blocked\":");
    gold.append("\n            __blocked.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__seq\":");
    gold.append("\n            __seq.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__entropy\":");
    gold.append("\n            __entropy.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__auto_future_id\":");
    gold.append("\n            __auto_future_id.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__connection_id\":");
    gold.append("\n            __connection_id.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__message_id\":");
    gold.append("\n            __message_id.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__time\":");
    gold.append("\n            __time.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__clients\":");
    gold.append("\n            __hydrateClients(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__messages\":");
    gold.append("\n            __hydrateMessages(__reader);");
    gold.append("\n            break;");
    gold.append("\n          default:");
    gold.append("\n            __reader.skipValue();");
    gold.append("\n        }");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __dump(JsonStreamWriter __writer) {");
    gold.append("\n    __writer.beginObject();");
    gold.append("\n    __writer.writeObjectFieldIntro(\"z\");");
    gold.append("\n    z.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__state\");");
    gold.append("\n    __state.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__constructed\");");
    gold.append("\n    __constructed.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__next_time\");");
    gold.append("\n    __next_time.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__blocked\");");
    gold.append("\n    __blocked.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__seq\");");
    gold.append("\n    __seq.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__entropy\");");
    gold.append("\n    __entropy.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__auto_future_id\");");
    gold.append("\n    __auto_future_id.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__connection_id\");");
    gold.append("\n    __connection_id.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__message_id\");");
    gold.append("\n    __message_id.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__time\");");
    gold.append("\n    __time.__dump(__writer);");
    gold.append("\n    __dumpClients(__writer);");
    gold.append("\n    __dumpMessages(__writer);");
    gold.append("\n    __writer.endObject();");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __commit(String __name, JsonStreamWriter __forward, JsonStreamWriter __reverse) {");
    gold.append("\n    __state.__commit(\"__state\", __forward, __reverse);");
    gold.append("\n    __constructed.__commit(\"__constructed\", __forward, __reverse);");
    gold.append("\n    __next_time.__commit(\"__next_time\", __forward, __reverse);");
    gold.append("\n    __blocked.__commit(\"__blocked\", __forward, __reverse);");
    gold.append("\n    __seq.__commit(\"__seq\", __forward, __reverse);");
    gold.append("\n    __entropy.__commit(\"__entropy\", __forward, __reverse);");
    gold.append("\n    __auto_future_id.__commit(\"__auto_future_id\", __forward, __reverse);");
    gold.append("\n    __connection_id.__commit(\"__connection_id\", __forward, __reverse);");
    gold.append("\n    __message_id.__commit(\"__message_id\", __forward, __reverse);");
    gold.append("\n    __time.__commit(\"__time\", __forward, __reverse);");
    gold.append("\n    z.__commit(\"z\", __forward, __reverse);");
    gold.append("\n    /* root */");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __revert() {");
    gold.append("\n    __state.__revert();");
    gold.append("\n    __constructed.__revert();");
    gold.append("\n    __next_time.__revert();");
    gold.append("\n    __blocked.__revert();");
    gold.append("\n    __seq.__revert();");
    gold.append("\n    __entropy.__revert();");
    gold.append("\n    __auto_future_id.__revert();");
    gold.append("\n    __connection_id.__revert();");
    gold.append("\n    __message_id.__revert();");
    gold.append("\n    __time.__revert();");
    gold.append("\n    z.__revert();");
    gold.append("\n    /* root */");
    gold.append("\n  }");
    gold.append("\n  private class DeltaReadOnly_19 {");
    gold.append("\n    private boolean __emitted;");
    gold.append("\n    private DeltaReadOnly_19() {");
    gold.append("\n      __emitted = false;");
    gold.append("\n    }");
    gold.append("\n    public void show(ReadOnly_19 __item, PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      PrivateLazyDeltaWriter __obj = __writer.planObject();");
    gold.append("\n      __obj.manifest();");
    gold.append("\n      if (__obj.end()) {");
    gold.append("\n        __emitted = true;");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n    public void hide(PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      if (__emitted) {");
    gold.append("\n        __emitted = false;");
    gold.append("\n        __writer.writeNull();");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public PrivateView __createPrivateView(NtClient __who, Consumer<String> __updates) {");
    gold.append("\n    ReadOnly_19 __self = this;");
    gold.append("\n    DeltaReadOnly_19 __state = new DeltaReadOnly_19();");
    gold.append("\n    return new PrivateView(__who, __updates) {");
    gold.append("\n      @Override");
    gold.append("\n      public void update(JsonStreamWriter __writer) {");
    gold.append("\n        __state.show(__self, PrivateLazyDeltaWriter.bind(__who, __writer));");
    gold.append("\n      }");
    gold.append("\n    };");
    gold.append("\n  }");
    gold.append("\n  private void __FUNC_0_foo1() {}");
    gold.append("\n  private void __FUNC_1_foo2(int x) {}");
    gold.append("\n  private void __FUNC_2_foo3(int x, int y) {}");
    gold.append("\n  private int __FUNC_3_foo4(int x, int y) {");
    gold.append("\n    __code_cost += 2;");
    gold.append("\n    __track(0);");
    gold.append("\n    return z.get();");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __route(AsyncTask task) {");
    gold.append("\n    return;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected Object __parse_message2(String channel, JsonStreamReader __reader) {");
    gold.append("\n    __reader.skipValue();");
    gold.append("\n    return NtMessageBase.NULL;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __reset_future_queues() {");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __invoke_label(String __new_state) {}");
    gold.append("\n  @Override");
    gold.append("\n  public boolean __onConnected(NtClient __cvalue) {");
    gold.append("\n    boolean __result = false;");
    gold.append("\n    return __result;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __onDisconnected(NtClient __cvalue) {}");
    gold.append("\n  @Override");
    gold.append("\n  public String[] __getTests() {");
    gold.append("\n    return new String[] {};");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __test(TestReportBuilder report, String testName) {}");
    gold.append("\n  @Override");
    gold.append("\n  protected void __construct_intern(NtClient who, NtMessageBase message) {}");
    gold.append("\n  @Override");
    gold.append("\n  protected NtMessageBase __parse_construct_arg(JsonStreamReader __reader) {");
    gold.append("\n    __reader.skipValue();");
    gold.append("\n    return NtMessageBase.NULL;");
    gold.append("\n  }");
    gold.append("\n  /* end of file */");
    gold.append("\n}");
    gold.append("\n");
    gold.append("\n--JAVA COMPILE RESULTS-----------------------------");
    gold.append("\n--JAVA RUNNING-------------------------------------");
    gold.append("\n{\"command\":\"construct\",\"timestamp\":\"0\",\"who\":{\"agent\":\"?\",\"authority\":\"?\"},\"arg\":{},\"entropy\":\"0\"}-->{\"__constructed\":true,\"__entropy\":\"0\"} need:true in:0");
    gold.append("\nNO_ONE was DENIED:5011");
    gold.append("\nRANDO was DENIED:5011");
    gold.append("\n+ NO_ONE DELTA:{\"data\":{},\"outstanding\":[],\"blockers\":[],\"seq\":1}");
    gold.append("\n+ RANDO DELTA:{\"data\":{},\"outstanding\":[],\"blockers\":[],\"seq\":1}");
    gold.append("\n{\"command\":\"invalidate\",\"timestamp\":\"25\"}-->{\"__messages\":null,\"__seq\":1,\"__entropy\":\"-4962768465676381896\",\"__time\":\"25\"} need:false in:-25");
    gold.append("\n{\"command\":\"bill\",\"timestamp\":\"50\"}-->{\"__goodwill_used\":0,\"__cost\":0,\"__billing_seq\":1} need:true in:0");
    gold.append("\n--JAVA RESULTS-------------------------------------");
    gold.append("\n{\"__constructed\":true,\"__entropy\":\"-4962768465676381896\",\"__seq\":1,\"__time\":\"25\",\"__goodwill_used\":0,\"__cost\":0,\"__billing_seq\":1}");
    gold.append("\n--DUMP RESULTS-------------------------------------");
    gold.append("\n{\"z\":0,\"__state\":\"\",\"__constructed\":true,\"__next_time\":\"0\",\"__blocked\":false,\"__seq\":1,\"__entropy\":\"-4962768465676381896\",\"__auto_future_id\":0,\"__connection_id\":0,\"__message_id\":0,\"__time\":\"50\"}");
    gold.append("\n{\"z\":0,\"__state\":\"\",\"__constructed\":true,\"__next_time\":\"0\",\"__blocked\":false,\"__seq\":1,\"__entropy\":\"-4962768465676381896\",\"__auto_future_id\":0,\"__connection_id\":0,\"__message_id\":0,\"__time\":\"50\"}");
    gold.append("\n--JAVA TEST RESULTS--------------------------------");
    gold.append("\n");
    gold.append("\nSuccess");
    assertStable(live, gold);
  }
  private String cached_TypeBuiltIn_20 = null;
  private String get_TypeBuiltIn_20() {
    if (cached_TypeBuiltIn_20 != null) {
      return cached_TypeBuiltIn_20;
    }
    cached_TypeBuiltIn_20 = generateTestOutput(true, "TypeBuiltIn_20", "./test_code/Functions_TypeBuiltIn_success.a");
    return cached_TypeBuiltIn_20;
  }

  @Test
  public void testTypeBuiltInEmission() {
    assertEmissionGood(get_TypeBuiltIn_20());
  }

  @Test
  public void testTypeBuiltInSuccess() {
    assertLivePass(get_TypeBuiltIn_20());
  }

  @Test
  public void testTypeBuiltInGoodWillHappy() {
    assertGoodWillHappy(get_TypeBuiltIn_20());
  }

  @Test
  public void testTypeBuiltInExceptionFree() {
    assertExceptionFree(get_TypeBuiltIn_20());
  }

  @Test
  public void testTypeBuiltInTODOFree() {
    assertTODOFree(get_TypeBuiltIn_20());
  }

  @Test
  public void stable_TypeBuiltIn_20() {
    String live = get_TypeBuiltIn_20();
    StringBuilder gold = new StringBuilder();
    gold.append("Path:Functions_TypeBuiltIn_success.a");
    gold.append("\n--EMISSION-----------------------------------------");
    gold.append("\nEmission Success, Yay");
    gold.append("\n--ISSUES-------------------------------------------");
    gold.append("\n[ ]");
    gold.append("\n--JAVA---------------------------------------------");
    gold.append("\nimport com.fasterxml.jackson.databind.JsonNode;");
    gold.append("\nimport com.fasterxml.jackson.databind.node.ArrayNode;");
    gold.append("\nimport com.fasterxml.jackson.databind.node.ObjectNode;");
    gold.append("\nimport org.adamalang.runtime.*;");
    gold.append("\nimport org.adamalang.runtime.async.*;");
    gold.append("\nimport org.adamalang.runtime.contracts.*;");
    gold.append("\nimport org.adamalang.runtime.delta.*;");
    gold.append("\nimport org.adamalang.runtime.exceptions.*;");
    gold.append("\nimport org.adamalang.runtime.index.*;");
    gold.append("\nimport org.adamalang.runtime.json.*;");
    gold.append("\nimport org.adamalang.runtime.natives.*;");
    gold.append("\nimport org.adamalang.runtime.natives.lists.*;");
    gold.append("\nimport org.adamalang.runtime.ops.*;");
    gold.append("\nimport org.adamalang.runtime.reactives.*;");
    gold.append("\nimport org.adamalang.runtime.stdlib.*;");
    gold.append("\nimport java.util.function.Consumer;");
    gold.append("\nimport java.util.function.Function;");
    gold.append("\nimport java.util.ArrayList;");
    gold.append("\nimport java.util.Comparator;");
    gold.append("\nimport java.util.Map;");
    gold.append("\nimport java.lang.Math;");
    gold.append("\npublic class TypeBuiltIn_20 extends LivingDocument {");
    gold.append("\n  private final RxString y;");
    gold.append("\n  private final RxMaybe<RxInt32> mi;");
    gold.append("\n  private final RxTable<RTxR> t;");
    gold.append("\n  public TypeBuiltIn_20(DocumentMonitor __monitor) {");
    gold.append("\n    super(__monitor);");
    gold.append("\n    y = new RxString(this, \"\");");
    gold.append("\n    mi = new RxMaybe<>(this, (RxParent __parent) -> new RxInt32(__parent, 0));");
    gold.append("\n    t = new RxTable<>(__self, this, \"t\", (RxParent __parent) -> new RTxR(__parent), 0);");
    gold.append("\n    __goodwillBudget = 100000;");
    gold.append("\n    __goodwillLimitOfBudget = 100000;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __insert(JsonStreamReader __reader) {");
    gold.append("\n    if (__reader.startObject()) {");
    gold.append("\n      while(__reader.notEndOfObject()) {");
    gold.append("\n        String __fieldName = __reader.fieldName();");
    gold.append("\n        switch (__fieldName) {");
    gold.append("\n          case \"y\":");
    gold.append("\n            y.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"mi\":");
    gold.append("\n            mi.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"t\":");
    gold.append("\n            t.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__state\":");
    gold.append("\n            __state.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__constructed\":");
    gold.append("\n            __constructed.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__next_time\":");
    gold.append("\n            __next_time.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__blocked\":");
    gold.append("\n            __blocked.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__seq\":");
    gold.append("\n            __seq.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__entropy\":");
    gold.append("\n            __entropy.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__auto_future_id\":");
    gold.append("\n            __auto_future_id.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__connection_id\":");
    gold.append("\n            __connection_id.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__message_id\":");
    gold.append("\n            __message_id.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__time\":");
    gold.append("\n            __time.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__clients\":");
    gold.append("\n            __hydrateClients(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__messages\":");
    gold.append("\n            __hydrateMessages(__reader);");
    gold.append("\n            break;");
    gold.append("\n          default:");
    gold.append("\n            __reader.skipValue();");
    gold.append("\n        }");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __dump(JsonStreamWriter __writer) {");
    gold.append("\n    __writer.beginObject();");
    gold.append("\n    __writer.writeObjectFieldIntro(\"y\");");
    gold.append("\n    y.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"mi\");");
    gold.append("\n    mi.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"t\");");
    gold.append("\n    t.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__state\");");
    gold.append("\n    __state.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__constructed\");");
    gold.append("\n    __constructed.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__next_time\");");
    gold.append("\n    __next_time.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__blocked\");");
    gold.append("\n    __blocked.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__seq\");");
    gold.append("\n    __seq.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__entropy\");");
    gold.append("\n    __entropy.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__auto_future_id\");");
    gold.append("\n    __auto_future_id.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__connection_id\");");
    gold.append("\n    __connection_id.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__message_id\");");
    gold.append("\n    __message_id.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__time\");");
    gold.append("\n    __time.__dump(__writer);");
    gold.append("\n    __dumpClients(__writer);");
    gold.append("\n    __dumpMessages(__writer);");
    gold.append("\n    __writer.endObject();");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __commit(String __name, JsonStreamWriter __forward, JsonStreamWriter __reverse) {");
    gold.append("\n    __state.__commit(\"__state\", __forward, __reverse);");
    gold.append("\n    __constructed.__commit(\"__constructed\", __forward, __reverse);");
    gold.append("\n    __next_time.__commit(\"__next_time\", __forward, __reverse);");
    gold.append("\n    __blocked.__commit(\"__blocked\", __forward, __reverse);");
    gold.append("\n    __seq.__commit(\"__seq\", __forward, __reverse);");
    gold.append("\n    __entropy.__commit(\"__entropy\", __forward, __reverse);");
    gold.append("\n    __auto_future_id.__commit(\"__auto_future_id\", __forward, __reverse);");
    gold.append("\n    __connection_id.__commit(\"__connection_id\", __forward, __reverse);");
    gold.append("\n    __message_id.__commit(\"__message_id\", __forward, __reverse);");
    gold.append("\n    __time.__commit(\"__time\", __forward, __reverse);");
    gold.append("\n    y.__commit(\"y\", __forward, __reverse);");
    gold.append("\n    mi.__commit(\"mi\", __forward, __reverse);");
    gold.append("\n    t.__commit(\"t\", __forward, __reverse);");
    gold.append("\n    /* root */");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __revert() {");
    gold.append("\n    __state.__revert();");
    gold.append("\n    __constructed.__revert();");
    gold.append("\n    __next_time.__revert();");
    gold.append("\n    __blocked.__revert();");
    gold.append("\n    __seq.__revert();");
    gold.append("\n    __entropy.__revert();");
    gold.append("\n    __auto_future_id.__revert();");
    gold.append("\n    __connection_id.__revert();");
    gold.append("\n    __message_id.__revert();");
    gold.append("\n    __time.__revert();");
    gold.append("\n    y.__revert();");
    gold.append("\n    mi.__revert();");
    gold.append("\n    t.__revert();");
    gold.append("\n    /* root */");
    gold.append("\n  }");
    gold.append("\n  private class DeltaTypeBuiltIn_20 {");
    gold.append("\n    private boolean __emitted;");
    gold.append("\n    private DeltaTypeBuiltIn_20() {");
    gold.append("\n      __emitted = false;");
    gold.append("\n    }");
    gold.append("\n    public void show(TypeBuiltIn_20 __item, PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      PrivateLazyDeltaWriter __obj = __writer.planObject();");
    gold.append("\n      __obj.manifest();");
    gold.append("\n      if (__obj.end()) {");
    gold.append("\n        __emitted = true;");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n    public void hide(PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      if (__emitted) {");
    gold.append("\n        __emitted = false;");
    gold.append("\n        __writer.writeNull();");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public PrivateView __createPrivateView(NtClient __who, Consumer<String> __updates) {");
    gold.append("\n    TypeBuiltIn_20 __self = this;");
    gold.append("\n    DeltaTypeBuiltIn_20 __state = new DeltaTypeBuiltIn_20();");
    gold.append("\n    return new PrivateView(__who, __updates) {");
    gold.append("\n      @Override");
    gold.append("\n      public void update(JsonStreamWriter __writer) {");
    gold.append("\n        __state.show(__self, PrivateLazyDeltaWriter.bind(__who, __writer));");
    gold.append("\n      }");
    gold.append("\n    };");
    gold.append("\n  }");
    gold.append("\n  private class RTxR extends RxRecordBase<RTxR> {");
    gold.append("\n    private final RxInt32 id;");
    gold.append("\n    private RTxR(RxParent __owner) {");
    gold.append("\n      super(__owner);");
    gold.append("\n      id = new RxInt32(this, 0);");
    gold.append("\n      if (__owner instanceof RxTable) {");
    gold.append("\n        /* ok */");
    gold.append("\n      } else {");
    gold.append("\n        /* ok */");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n    String[] __INDEX_COLUMNS = new String[] {};");
    gold.append("\n    @Override");
    gold.append("\n    public String[] __getIndexColumns() {");
    gold.append("\n      return __INDEX_COLUMNS;");
    gold.append("\n    }");
    gold.append("\n    @Override");
    gold.append("\n    public int[] __getIndexValues() {");
    gold.append("\n      return new int[] {};");
    gold.append("\n    }");
    gold.append("\n    @Override");
    gold.append("\n    public void __insert(JsonStreamReader __reader) {");
    gold.append("\n      if (__reader.startObject()) {");
    gold.append("\n        while(__reader.notEndOfObject()) {");
    gold.append("\n          String __fieldName = __reader.fieldName();");
    gold.append("\n          switch (__fieldName) {");
    gold.append("\n            case \"id\":");
    gold.append("\n              id.__insert(__reader);");
    gold.append("\n              break;");
    gold.append("\n            default:");
    gold.append("\n              __reader.skipValue();");
    gold.append("\n          }");
    gold.append("\n        }");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n    @Override");
    gold.append("\n    public void __dump(JsonStreamWriter __writer) {");
    gold.append("\n      __writer.beginObject();");
    gold.append("\n      __writer.writeObjectFieldIntro(\"id\");");
    gold.append("\n      id.__dump(__writer);");
    gold.append("\n      __writer.endObject();");
    gold.append("\n    }");
    gold.append("\n    @Override");
    gold.append("\n    public void __commit(String __name, JsonStreamWriter __forward, JsonStreamWriter __reverse) {");
    gold.append("\n      if (__isDirty()) {");
    gold.append("\n        __forward.writeObjectFieldIntro(__name);");
    gold.append("\n        __forward.beginObject();");
    gold.append("\n        __reverse.writeObjectFieldIntro(__name);");
    gold.append("\n        __reverse.beginObject();");
    gold.append("\n        id.__commit(\"id\", __forward, __reverse);");
    gold.append("\n        __forward.endObject();");
    gold.append("\n        __reverse.endObject();");
    gold.append("\n        __lowerDirtyCommit();");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n    @Override");
    gold.append("\n    public void __revert() {");
    gold.append("\n      if (__isDirty()) {");
    gold.append("\n        __isDying = false;");
    gold.append("\n        id.__revert();");
    gold.append("\n        __lowerDirtyRevert();");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n    @Override");
    gold.append("\n    public String __name() {");
    gold.append("\n      return \"R\";");
    gold.append("\n    }");
    gold.append("\n    @Override");
    gold.append("\n    public void __deindex() {");
    gold.append("\n      /* ok */");
    gold.append("\n    }");
    gold.append("\n    public void __reindex() {");
    gold.append("\n      /* ok */");
    gold.append("\n    }");
    gold.append("\n    @Override");
    gold.append("\n    public int __id() {");
    gold.append("\n      return id.get();");
    gold.append("\n    }");
    gold.append("\n    @Override");
    gold.append("\n    public void __setId(int __id, boolean __force) {");
    gold.append("\n      if (__force) {");
    gold.append("\n        id.forceSet(__id);");
    gold.append("\n      } else {");
    gold.append("\n        id.set(__id);");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  private class DeltaRTxR {");
    gold.append("\n    private boolean __emitted;");
    gold.append("\n    private DeltaRTxR() {");
    gold.append("\n      __emitted = false;");
    gold.append("\n    }");
    gold.append("\n    public void show(RTxR __item, PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      PrivateLazyDeltaWriter __obj = __writer.planObject();");
    gold.append("\n      if (__obj.end()) {");
    gold.append("\n        __emitted = true;");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n    public void hide(PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      if (__emitted) {");
    gold.append("\n        __emitted = false;");
    gold.append("\n        __writer.writeNull();");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __route(AsyncTask task) {");
    gold.append("\n    return;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected Object __parse_message2(String channel, JsonStreamReader __reader) {");
    gold.append("\n    __reader.skipValue();");
    gold.append("\n    return NtMessageBase.NULL;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __reset_future_queues() {");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __invoke_label(String __new_state) {}");
    gold.append("\n  @Override");
    gold.append("\n  public boolean __onConnected(NtClient __cvalue) {");
    gold.append("\n    boolean __result = false;");
    gold.append("\n    return __result;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __onDisconnected(NtClient __cvalue) {}");
    gold.append("\n  public void __test_PrimaryTest(TestReportBuilder report) {");
    gold.append("\n    report.begin(\"PrimaryTest\");");
    gold.append("\n    {");
    gold.append("\n      __code_cost += 4;");
    gold.append("\n      __track(0);");
    gold.append("\n      String x = \"xyz\";");
    gold.append("\n      __track(1);");
    gold.append("\n      final String y = LibString.reverse(x);");
    gold.append("\n      __track(2);");
    gold.append("\n      __assert_truth(x.length() == 3, 7, 2, 7, 25);");
    gold.append("\n    }");
    gold.append("\n    report.end(getAndResetAssertions());");
    gold.append("\n  }");
    gold.append("\n  public void __test_SecondTest(TestReportBuilder report) {");
    gold.append("\n    report.begin(\"SecondTest\");");
    gold.append("\n    {");
    gold.append("\n      __code_cost += 7;");
    gold.append("\n      __track(3);");
    gold.append("\n      y.set(\"xyz\");");
    gold.append("\n      __track(4);");
    gold.append("\n      final String z = LibString.reverse(y.get());");
    gold.append("\n      __track(5);");
    gold.append("\n      __assert_truth(y.get().length() == 3, 21, 2, 21, 25);");
    gold.append("\n      __track(6);");
    gold.append("\n      mi.make().set(123);");
    gold.append("\n      __track(7);");
    gold.append("\n      mi.get().delete();");
    gold.append("\n      __track(8);");
    gold.append("\n      __assert_truth(t.size() == 0, 24, 2, 24, 23);");
    gold.append("\n    }");
    gold.append("\n    report.end(getAndResetAssertions());");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public String[] __getTests() {");
    gold.append("\n    return new String[] {\"PrimaryTest\", \"SecondTest\"};");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __test(TestReportBuilder report, String testName) {");
    gold.append("\n    switch(testName) {");
    gold.append("\n      case \"PrimaryTest\":");
    gold.append("\n          __test_PrimaryTest(report);");
    gold.append("\n          return;");
    gold.append("\n      case \"SecondTest\":");
    gold.append("\n          __test_SecondTest(report);");
    gold.append("\n          return;");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  private void __construct_0(NtClient __who, NtMessageBase __object) {}");
    gold.append("\n  @Override");
    gold.append("\n  protected NtMessageBase __parse_construct_arg(JsonStreamReader __reader) {");
    gold.append("\n    __reader.skipValue();");
    gold.append("\n    return NtMessageBase.NULL;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __construct_intern(NtClient __who, NtMessageBase __object) {");
    gold.append("\n    __construct_0(__who, __object);");
    gold.append("\n  }");
    gold.append("\n  /* end of file */");
    gold.append("\n}");
    gold.append("\n");
    gold.append("\n--JAVA COMPILE RESULTS-----------------------------");
    gold.append("\n--JAVA RUNNING-------------------------------------");
    gold.append("\n{\"command\":\"construct\",\"timestamp\":\"0\",\"who\":{\"agent\":\"?\",\"authority\":\"?\"},\"arg\":{},\"entropy\":\"0\"}-->{\"__constructed\":true,\"__entropy\":\"0\"} need:true in:0");
    gold.append("\nNO_ONE was DENIED:5011");
    gold.append("\nRANDO was DENIED:5011");
    gold.append("\n+ NO_ONE DELTA:{\"data\":{},\"outstanding\":[],\"blockers\":[],\"seq\":1}");
    gold.append("\n+ RANDO DELTA:{\"data\":{},\"outstanding\":[],\"blockers\":[],\"seq\":1}");
    gold.append("\n{\"command\":\"invalidate\",\"timestamp\":\"25\"}-->{\"__messages\":null,\"__seq\":1,\"__entropy\":\"-4962768465676381896\",\"__time\":\"25\"} need:false in:-25");
    gold.append("\n{\"command\":\"bill\",\"timestamp\":\"50\"}-->{\"__goodwill_used\":0,\"__cost\":0,\"__billing_seq\":1} need:true in:0");
    gold.append("\n--JAVA RESULTS-------------------------------------");
    gold.append("\n{\"__constructed\":true,\"__entropy\":\"-4962768465676381896\",\"__seq\":1,\"__time\":\"25\",\"__goodwill_used\":0,\"__cost\":0,\"__billing_seq\":1}");
    gold.append("\n--DUMP RESULTS-------------------------------------");
    gold.append("\n{\"y\":\"\",\"mi\":null,\"t\":{\"auto_key\":0,\"rows\":{}},\"__state\":\"\",\"__constructed\":true,\"__next_time\":\"0\",\"__blocked\":false,\"__seq\":1,\"__entropy\":\"-4962768465676381896\",\"__auto_future_id\":0,\"__connection_id\":0,\"__message_id\":0,\"__time\":\"50\"}");
    gold.append("\n{\"y\":\"\",\"mi\":null,\"t\":{\"auto_key\":0,\"rows\":{}},\"__state\":\"\",\"__constructed\":true,\"__next_time\":\"0\",\"__blocked\":false,\"__seq\":1,\"__entropy\":\"-4962768465676381896\",\"__auto_future_id\":0,\"__connection_id\":0,\"__message_id\":0,\"__time\":\"50\"}");
    gold.append("\n--JAVA TEST RESULTS--------------------------------");
    gold.append("\nTEST[PrimaryTest] = 100.0%");
    gold.append("\nTEST[SecondTest] = 100.0%");
    gold.append("\n...DUMP:{\"y\":\"xyz\",\"mi\":null}");
    gold.append("\n");
    gold.append("\nSuccess");
    assertStable(live, gold);
  }
}
