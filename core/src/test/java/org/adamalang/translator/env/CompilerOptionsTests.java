/* The Adama Programming Language For Board Games!
 *    See http://www.adama-lang.org/ for more information.
 * (c) copyright 2020 Jeffrey M. Barber (http://jeffrey.io) */
package org.adamalang.translator.env;

import org.junit.Assert;
import org.junit.Test;

public class CompilerOptionsTests {
  @Test
  public void args1() {
    final var options = CompilerOptions.start().args(0, "--billing", "no", "--code-coverage", "no", "--remove-tests", "no", "--silent", "no", "--goodwill-budget", "0", "--package", "org.foo", "--class", "ClassName").make();
    Assert.assertTrue(options.disableBillingCost);
    Assert.assertFalse(options.produceCodeCoverage);
    Assert.assertFalse(options.removeTests);
    Assert.assertTrue(options.stderrLoggingCompiler);
    Assert.assertEquals(0, options.goodwillBudget);
    Assert.assertEquals("org.foo", options.packageName);
    Assert.assertEquals("ClassName", options.className);
  }

  @Test
  public void args2() {
    final var options = CompilerOptions.start().args(0, "--billing", "yes", "--code-coverage", "yes", "--remove-tests", "yes", "--silent", "yes", "--goodwill-budget", "5000", "--package", "org.foo2", "--class", "ClassName2").make();
    Assert.assertFalse(options.disableBillingCost);
    Assert.assertTrue(options.produceCodeCoverage);
    Assert.assertTrue(options.removeTests);
    Assert.assertFalse(options.stderrLoggingCompiler);
    Assert.assertEquals(5000, options.goodwillBudget);
    Assert.assertEquals("org.foo2", options.packageName);
    Assert.assertEquals("ClassName2", options.className);
  }

  @Test
  public void builder() {
    final var options = CompilerOptions.start().enableCodeCoverage().noCost().make();
    Assert.assertTrue(options.disableBillingCost);
    Assert.assertTrue(options.produceCodeCoverage);
  }

  @Test
  public void core() {
    final var options = CompilerOptions.start().args(0, "--input", "a.a", "--input", "b.a", "--add-search-path", "foo", "--add-search-path", "goo", "--output", "oout").make();
    Assert.assertEquals("a.a", options.inputFiles[0]);
    Assert.assertEquals("b.a", options.inputFiles[1]);
    Assert.assertEquals("foo", options.searchPaths[0]);
    Assert.assertEquals("goo", options.searchPaths[1]);
    Assert.assertEquals("oout", options.outputFile);
  }

  @Test
  public void offset() {
    final var options = CompilerOptions.start().args(1, "compile", "--billing", "yes", "--code-coverage", "yes", "--remove-tests", "yes", "--silent", "yes", "--goodwill-budget", "5000", "--package", "org.foo2", "--class", "ClassName2")
        .make();
    Assert.assertFalse(options.disableBillingCost);
    Assert.assertTrue(options.produceCodeCoverage);
    Assert.assertTrue(options.removeTests);
    Assert.assertFalse(options.stderrLoggingCompiler);
    Assert.assertEquals(5000, options.goodwillBudget);
    Assert.assertEquals("org.foo2", options.packageName);
    Assert.assertEquals("ClassName2", options.className);
  }
}
