package br.unb.cic.epl.spl;

import junit.framework.TestCase;

public class LiteralTest extends TestCase {
	public void testPrint() {
		Literal literal1000 = new Literal(1000);		
		assertEquals("1000", literal1000.print());
	}
}
