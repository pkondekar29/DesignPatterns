package com.learnings.designPatterns.structural.decorator;

public class CheeseDecorator extends SandwichDecorator {

	private static final String CHEESE = " + cheese";

	public CheeseDecorator(Sandwich sandwich) {
		super(sandwich);
	}

	@Override
	public String make() {
		return customSandwich.make() + this.addCheese();	
	}

	/** 
	 * Here we are adding functionality to it. 
	 * So, as the hierarchy goes on increasing we can add multiple functionalities to it. 
	 * 
	 * */
	private String addCheese() {
		return CHEESE;
	}
	
}
