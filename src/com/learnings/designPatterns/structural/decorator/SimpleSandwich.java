package com.learnings.designPatterns.structural.decorator;

public class SimpleSandwich implements Sandwich {

	@Override
	public String make() {
		return "Simple sandwich with bread";
	}

}
