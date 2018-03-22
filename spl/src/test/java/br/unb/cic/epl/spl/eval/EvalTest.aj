package br.unb.cic.epl.spl.eval;

public aspect EvalTest {
	public void br.unb.cic.epl.spl.LiteralTest.testEval() {
		br.unb.cic.epl.spl.Literal lit = new br.unb.cic.epl.spl.Literal(1000);
		assertEquals(new Integer(1000), lit.eval());
	}
}
