package com.learnings.designPatterns.behavorial.visitor;

public class Wheel implements Part {

	@Override
	public void accept(PartVisitor visitor) {
		visitor.visit(this);
	}



}
