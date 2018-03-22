package br.unb.cic.epl.spl.eval;

public privileged aspect Eval {
	public abstract Integer br.unb.cic.epl.spl.Expression.eval();
	
	public Integer br.unb.cic.epl.spl.Literal.eval() {
		return value;
	}
	
	pointcut allMainMethods(): execution(* br.unb.cic.epl.spl.Main.*(**));
	
	pointcut createExp(br.unb.cic.epl.spl.Main m) : execution(void br.unb.cic.epl.spl.Main.createExpressions()) && target(m); 
	
	void around() : allMainMethods() {
		System.out.println("execucao do metodo: " + thisJoinPoint.getSignature().toLongString());
		proceed();
	}
	
	void around(br.unb.cic.epl.spl.Main m): createExp(m) {
		proceed(m);
		m.expressions.add(new br.unb.cic.epl.spl.Literal(10));	
	}
	
}
