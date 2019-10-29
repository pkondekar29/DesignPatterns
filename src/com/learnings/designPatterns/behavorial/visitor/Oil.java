package com.learnings.designPatterns.behavorial.visitor;

public class Oil implements Part {

	@Override
	public void accept(PartVisitor visitor) {
		visitor.visit(this);
	}

}
