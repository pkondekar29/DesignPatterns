package com.learnings.designPatterns.structural.decorator;

/**
 * main component of the decorator pattern.
 * 
 * The concrete component and the decorator both implement this functionality. 
 * So this allows in using the decorator to decorate(modify) the concreate component.
 * 
 * <b>
 * Each decorator takes a component(can be concrete component or another decorator) 
 * which allows to extend the component functionality as we go on implementing new decorators.
 * </b>
 *
 * Its a great pattern if we dont want to modify the bas object and we can use decorators for modifying the object. 
 *
 */	
public interface Sandwich {
	
	public String make();
	
}
