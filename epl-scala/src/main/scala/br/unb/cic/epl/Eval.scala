package br.unb.cic.epl

package object Eval { 
  trait Expression extends Core.Expression {
    def eval(): Int
  }

  trait Literal extends Core.Literal with Expression {
    override
    def eval() = value
  }
}
