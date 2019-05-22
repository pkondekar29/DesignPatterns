package com.learnings.designPatterns.behavorial.chainofresponsibility;

public class Developer extends Handler {

	@Override
	public void develop(ProblemStatement problemStatement) {
		if(problemStatement.getComplexity() > 100) {
			successor.develop(problemStatement);
		} else {
			System.out.println("Devloer developed");
		}
	}

}
