package br.unb.cic.tp1.epl;

import static org.junit.Assert.*;
import org.junit.Test;
public class LiteralTest {

	@Test
	public void testPrint() {
		Lit lit100 = new Lit(100);	
		assertEquals("100", lit100.print());
	}
}
