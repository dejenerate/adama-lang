/* The Adama Programming Language For Board Games!
 *    See http://www.adama-lang.org/ for more information.
 * (c) copyright 2020 Jeffrey M. Barber (http://jeffrey.io) */
package org.adamalang.runtime.reactives;

import org.adamalang.runtime.json.JsonStreamWriter;
import org.adamalang.runtime.mocks.MockRxChild;
import org.junit.Assert;
import org.junit.Test;

public class RxGuardTests {
  @Test
  public void dump() {
    final var d = new RxGuard();
    final var writer = new JsonStreamWriter();
    d.__dump(writer);
    Assert.assertEquals("", writer.toString());
  }

  @Test
  public void flow() {
    final var guard = new RxGuard();
    Assert.assertEquals(1, guard.getGeneration());
    Assert.assertEquals(true, guard.invalid);
    guard.__commit(null, null, null);
    Assert.assertEquals(2, guard.getGeneration());
    Assert.assertEquals(false, guard.invalid);
    final var child = new MockRxChild();
    guard.__subscribe(child);
    guard.__raiseInvalid();
    child.assertInvalidateCount(0);
    Assert.assertEquals(3, guard.getGeneration());
    Assert.assertEquals(true, guard.invalid);
    guard.__revert();
    Assert.assertEquals(false, guard.invalid);
    Assert.assertEquals(4, guard.getGeneration());
    guard.__insert(null);
  }
}
