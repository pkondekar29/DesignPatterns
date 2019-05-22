package com.learnings.designPatterns.behavorial.chainofresponsibility;

public class DriverProgram {

	public static void main(String[] args) {
		Developer developer = new Developer();
		SeniorDeveloper snrDevelop = new SeniorDeveloper();
		Architect architect = new Architect();
		
		developer.setSuccessor(snrDevelop);
		snrDevelop.setSuccessor(architect);
		
		ProblemStatement mediumProblemStatement = new ProblemStatement("A medium problem", 150);
		ProblemStatement complexProblemStatement = new ProblemStatement("A complex problem", 1000);
		/** 
		 * 
		 * Here the developer is assigned a complex problem statement 
		 * Although the problem will be solved by the architect, the client is not aware of who solved the problem
		 * 
		 * */
		developer.develop(complexProblemStatement);	
			
		snrDevelop.develop(mediumProblemStatement);	
		
		architect.develop(complexProblemStatement);
	}

}
