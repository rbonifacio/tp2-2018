package br.unb.cic.tp1.epl;

/**
 * The most simple type of expression... just an 
 * int literal! 
 * 
 * @author rbonifacio
 */
public class Lit implements Exp {
	private Integer value;
	
	public Lit(Integer value) {
		this.value = value; 
	}
	
	public String print() {
		return value.toString();
	}
}
