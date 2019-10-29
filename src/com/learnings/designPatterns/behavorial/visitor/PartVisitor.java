package com.learnings.designPatterns.behavorial.visitor;

public interface PartVisitor {

	void visit(Oil oil);

	void visit(Wheel wheel);

	void visit(PartsOrder partsOrder);

}
