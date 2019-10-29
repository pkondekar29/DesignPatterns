package com.learnings.designPatterns.behavorial.interpreter;

public class Driver {

	public static void main(String[] args) {
		// context
		//String context = "Tigers";
		String context = "Peacock Tigers";
		//String context = "Bears";
		/**
		 * Interpreter is usually used where 
		 * there is a grammar present and we want to apply that grammar 
		 * on some context.
		 * 
		 */
		Expression define = buildIntepreterTree();		// we build an interpreter tree on which the interpreter works
		System.out.println(context + " is " + define.interpret(context) + " in our interpreter tree"); 
	}

	private static Expression buildIntepreterTree() {
		Expression terminal1 = new TerminalExpression("Lions");
		Expression terminal2 = new TerminalExpression("Tigers");
		
		Expression terminal3 = new TerminalExpression("Peacock");
		
		Expression andExpression = new AndExpression(terminal2, terminal3);
		return new OrExpression(andExpression, terminal1);
	}

}
