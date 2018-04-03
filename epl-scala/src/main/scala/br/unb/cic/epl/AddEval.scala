package br.unb.cic.epl

package object AddEval {
  class Add(l: Eval.Expression, r: Eval.Expression) extends Add.GAdd with Eval.Expression {
    type T = Eval.Expression
    lhs = l
    rhs = r

    override def eval(): Int = lhs.eval() + rhs.eval()
  }
}
