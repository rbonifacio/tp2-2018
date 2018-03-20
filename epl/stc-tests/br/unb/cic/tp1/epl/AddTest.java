package br.unb.cic.tp1.epl;

import org.junit.Test;
import static org.junit.Assert.*; 

public class AddTest {
	@Test
	public void testPrint() {
		Add s1 = new Add(new Lit(3), new Lit(4));
		Add s2 = new Add(s1, new Lit(3)); 
		
		assertEquals("(3 + 4)", s1.print());
		assertEquals("((3 + 4) + 3)", s2.print());
	}

}
