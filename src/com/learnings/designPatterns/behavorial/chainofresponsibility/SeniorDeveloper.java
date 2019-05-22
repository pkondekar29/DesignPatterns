package com.learnings.designPatterns.behavorial.chainofresponsibility;

public class SeniorDeveloper extends Handler {

	@Override
	public void develop(ProblemStatement problemStatement) {
		if(problemStatement.getComplexity() > 200) {
			successor.develop(problemStatement);
		} else {
			System.out.println("Snr developer developed!");
		}
	}

}
