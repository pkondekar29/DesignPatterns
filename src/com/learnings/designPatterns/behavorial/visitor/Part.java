package com.learnings.designPatterns.behavorial.visitor;


public interface Part {

	public void accept(PartVisitor visitor);

}
