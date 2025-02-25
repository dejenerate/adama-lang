/* The Adama Programming Language For Board Games!
 *    See http://www.adama-lang.org/ for more information.
 * (c) copyright 2020 Jeffrey M. Barber (http://jeffrey.io) */
package org.adamalang.translator.tree.types.checking;

import org.adamalang.translator.env.ComputeContext;
import org.adamalang.translator.env.Environment;
import org.adamalang.translator.tree.expressions.Expression;
import org.adamalang.translator.tree.types.TyType;
import org.adamalang.translator.tree.types.checking.properties.CanAssignResult;
import org.adamalang.translator.tree.types.checking.properties.CanMathResult;
import org.adamalang.translator.tree.types.checking.properties.StorageTweak;

public class LocalTypeAssignmentResult {
  public CanAssignResult assignResult = CanAssignResult.No;
  public CanMathResult canMathResult = CanMathResult.No;
  private final Environment environment;
  private final Expression expression;
  public TyType ltype = null;
  private final Expression ref;
  public TyType rtype = null;

  public LocalTypeAssignmentResult(final Environment environment, final Expression ref, final Expression expression) {
    this.environment = environment;
    this.ref = ref;
    this.expression = expression;
  }

  public void add() {
    ltype = ref.typing(environment.scopeWithComputeContext(ComputeContext.Assignment), null);
    rtype = expression.typing(environment.scopeWithComputeContext(ComputeContext.Computation), null);
    assignResult = environment.rules.CanAssignWithAdd(ltype, rtype, false);
    canMathResult = environment.rules.CanAdd(environment.rules.Resolve(ltype, true), rtype, false);
    environment.rules.CanTypeAStoreTypeB(ltype, rtype, StorageTweak.Add, false);
  }

  public boolean bad() {
    if (ltype == null || rtype == null) { return true; }
    return false;
  }

  public void divide() {
    // type the left side under assignment
    ltype = ref.typing(environment.scopeWithComputeContext(ComputeContext.Assignment), null);
    rtype = expression.typing(environment.scopeWithComputeContext(ComputeContext.Computation), null);
    assignResult = environment.rules.CanAssignWithDivide(ltype, rtype, false);
    canMathResult = environment.rules.CanDivide(environment.rules.Resolve(ltype, true), rtype, false);
    environment.rules.CanTypeAStoreTypeB(ltype, rtype, StorageTweak.Divide, false);
  }

  public void ingest() {
    ltype = ref.typing(environment.scopeWithComputeContext(ComputeContext.Assignment), null);
    rtype = expression.typing(environment.scopeWithComputeContext(ComputeContext.Computation), null);
    environment.rules.CanAIngestB(ltype, rtype, false);
    assignResult = CanAssignResult.YesWithIngestionCodeGen;
  }

  public void mod() {
    ltype = ref.typing(environment.scopeWithComputeContext(ComputeContext.Assignment), null);
    rtype = expression.typing(environment.scopeWithComputeContext(ComputeContext.Computation), null);
    assignResult = environment.rules.CanAssignWithMod(ltype, rtype, false);
    canMathResult = environment.rules.CanMod(environment.rules.Resolve(ltype, true), rtype, false);
    environment.rules.CanTypeAStoreTypeB(ltype, rtype, StorageTweak.Mod, false);
  }

  public void multiply() {
    ltype = ref.typing(environment.scopeWithComputeContext(ComputeContext.Assignment), null);
    rtype = expression.typing(environment.scopeWithComputeContext(ComputeContext.Computation), null);
    assignResult = environment.rules.CanAssignWithMult(ltype, rtype, false);
    canMathResult = environment.rules.CanMultiply(environment.rules.Resolve(ltype, true), rtype, false);
    environment.rules.CanTypeAStoreTypeB(ltype, rtype, StorageTweak.Multiply, false);
  }

  public void set() {
    ltype = ref.typing(environment.scopeWithComputeContext(ComputeContext.Assignment), null);
    rtype = expression.typing(environment.scopeWithComputeContext(ComputeContext.Computation), null);
    assignResult = environment.rules.CanAssignWithSet(ltype, rtype, false);
    environment.rules.CanTypeAStoreTypeB(ltype, rtype, StorageTweak.None, false);
  }

  public void subtract() {
    ltype = ref.typing(environment.scopeWithComputeContext(ComputeContext.Assignment), null);
    rtype = expression.typing(environment.scopeWithComputeContext(ComputeContext.Computation), null);
    assignResult = environment.rules.CanAssignWithSubtract(ltype, rtype, false);
    canMathResult = environment.rules.CanSubstract(environment.rules.Resolve(ltype, true), rtype, false);
    environment.rules.CanTypeAStoreTypeB(ltype, rtype, StorageTweak.Subtract, false);
  }
}
