package com.learnings.designPatterns.structural.decorator;

public class DriverProgram {

	public static void main(String[] args) {
		/** This looks like a builder pattern but its not since we are modifying the functionality by using the decorators */
		Sandwich sandwich = new ChickenDecorator(new CheeseDecorator(new SimpleSandwich()));
		System.out.println(sandwich.make());
	}

}
