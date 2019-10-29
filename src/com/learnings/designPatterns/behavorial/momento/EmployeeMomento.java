package com.learnings.designPatterns.behavorial.momento;

public class EmployeeMomento {

	private String name;
	
	public EmployeeMomento(String name) {
		this.name = name;
	}
	
	public String getName(){		// getter to get the state of the momento
		return this.name;
	}
}
