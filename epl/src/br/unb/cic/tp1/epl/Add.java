package br.unb.cic.tp1.epl;

/**
 * An expression for representing additions
 * @author rbonifacio
 */
public class Add implements Exp {

	private Exp lhs; 
	private Exp rhs; 
	
	public Add(Exp lhs, Exp rhs) {
		this.lhs = lhs;
		this.rhs = rhs;
	}
	
	public int eval() {
		return lhs.eval() + rhs.eval();
	}
	public String print() {
		StringBuilder sb = new StringBuilder();
		sb.append("(");
		sb.append(lhs.print());
		sb.append(" + ");
		sb.append(rhs.print());
		sb.append(")");
		return sb.toString();
	}
}
