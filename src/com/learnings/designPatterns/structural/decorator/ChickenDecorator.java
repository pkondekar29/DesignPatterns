package com.learnings.designPatterns.structural.decorator;

public class ChickenDecorator extends SandwichDecorator {

	private static final String CHICKEN = " + chicken";

	public ChickenDecorator(Sandwich sandwich) {
		super(sandwich);
	}
	
	@Override
	public String make() {
		return customSandwich.make() + this.addChicken();
	}

	private String addChicken() {
		return CHICKEN;
	}

}
