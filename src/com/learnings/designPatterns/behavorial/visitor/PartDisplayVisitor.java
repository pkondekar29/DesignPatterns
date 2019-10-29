package com.learnings.designPatterns.behavorial.visitor;

public class PartDisplayVisitor implements PartVisitor {

	@Override
	public void visit(Oil oil) {
		System.out.println("We added oil");
	}

	@Override
	public void visit(Wheel wheel) {
		System.out.println("We added wheels");
	}

	@Override
	public void visit(PartsOrder partsOrder) {
		System.out.println("We have the order");
	}

}
