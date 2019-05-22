package com.learnings.designPatterns.behavorial.chainofresponsibility;

public class Architect extends Handler{

	@Override
	public void develop(ProblemStatement problemStatement) {
		System.out.println("Architect can develop anything!");
	}
	
}
