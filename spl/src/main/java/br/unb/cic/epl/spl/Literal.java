package br.unb.cic.epl.spl;

public class Literal implements Expression {

	private Integer value; 
	
	public Literal(Integer value) {
		this.value = value; 
	}
	
	public String print() {
		return value.toString();
	}
}
