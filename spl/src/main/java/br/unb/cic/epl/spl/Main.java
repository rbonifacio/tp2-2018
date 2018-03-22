package br.unb.cic.epl.spl;

import java.util.ArrayList;
import java.util.List;

public class Main {
	private static Main instance; 
	
	private Main() {} 
	
	public static Main instance() {
		if(instance == null) {
			instance = new Main();
		}
		return instance; 
	}
	public List<Expression> expressions = new ArrayList<Expression>();; 
	
	public void createExpressions() {
		expressions.add(new Literal(100));
		expressions.add(new Literal(10)); 
	}
	
	public static void main(String args[]) {
		instance().createExpressions();
		
		for(Expression e: instance().expressions) {
			System.out.println(e.print());
		}
	}
}
