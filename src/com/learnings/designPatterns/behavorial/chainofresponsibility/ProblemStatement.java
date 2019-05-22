package com.learnings.designPatterns.behavorial.chainofresponsibility;

public class ProblemStatement {

	private String problemStatement;
	private int complexity;
	
	ProblemStatement(String problemStatement, int complexity){
		this.complexity = complexity;
		this.problemStatement = problemStatement;
	}
	
	/**
	 * Returns the value of field <code>{@link #problemStatement}</code>.
	 *
	 * @return the problemStatement
	 */
	public String getProblemStatement() {
		return problemStatement;
	}

	/**
	 * Returns the value of field <code>{@link #complexity}</code>.
	 *
	 * @return the complexity
	 */
	public int getComplexity() {
		return complexity;
	}

}
