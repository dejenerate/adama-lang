/* The Adama Programming Language For Board Games!
 *    See http://www.adama-lang.org/ for more information.
 * (c) copyright 2020 Jeffrey M. Barber (http://jeffrey.io) */
package org.adamalang.runtime.reactives;

import org.adamalang.runtime.contracts.CanGetAndSet;
import org.adamalang.runtime.contracts.Indexable;
import org.adamalang.runtime.contracts.RxParent;
import org.adamalang.runtime.json.JsonStreamReader;
import org.adamalang.runtime.json.JsonStreamWriter;

/** a reactive 32-bit integer (int) */
public class RxInt32 extends RxBase implements Comparable<RxInt32>, CanGetAndSet<Integer>, Indexable {
  private int backup;
  private int value;

  public RxInt32(final RxParent parent, final int value) {
    super(parent);
    backup = value;
    this.value = value;
  }

  @Override
  public void __commit(String name, JsonStreamWriter forwardDelta, JsonStreamWriter reverseDelta) {
    if (__isDirty()) {
      forwardDelta.writeObjectFieldIntro(name);
      forwardDelta.writeInteger(value);
      reverseDelta.writeObjectFieldIntro(name);
      reverseDelta.writeInteger(backup);
      backup = value;
      __lowerDirtyCommit();
    }
  }

  @Override
  public void __dump(final JsonStreamWriter writer) {
    writer.writeInteger(value);
  }

  @Override
  public void __insert(final JsonStreamReader reader) {
    backup = reader.readInteger();
    value = backup;
  }

  @Override
  public void __revert() {
    if (__isDirty()) {
      value = backup;
      __lowerDirtyRevert();
    }
  }

  public int bumpDownPost() {
    final var result = value--;
    __raiseDirty();
    return result;
  }

  public int bumpDownPre() {
    final var result = --value;
    __raiseDirty();
    return result;
  }

  public int bumpUpPost() {
    final var result = value++;
    __raiseDirty();
    return result;
  }

  // these make ZERO sense
  public int bumpUpPre() {
    final var result = ++value;
    __raiseDirty();
    return result;
  }

  @Override
  public int compareTo(final RxInt32 other) {
    return Integer.compare(value, other.value);
  }

  public void forceSet(final int id) {
    backup = id;
    value = id;
  }

  @Override
  public Integer get() {
    return value;
  }

  @Override
  public int getIndexValue() {
    return value;
  }

  public int opAddTo(final int incoming) {
    value += incoming;
    __raiseDirty();
    return value;
  }

  public int opModBy(final int x) {
    value %= x;
    __raiseDirty();
    return value;
  }

  public int opMultBy(final int x) {
    value *= x;
    __raiseDirty();
    return value;
  }

  public int opSubFrom(final int x) {
    value -= x;
    __raiseDirty();
    return value;
  }

  @Override
  public void set(final Integer value) {
    if (this.value != value) {
      this.value = value;
      __raiseDirty();
    }
  }
}
