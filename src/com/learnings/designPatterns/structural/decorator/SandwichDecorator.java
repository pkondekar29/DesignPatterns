package com.learnings.designPatterns.structural.decorator;


/**
 * The base decorator which will be extended by each decorator and takes in the component in the constructor.
 * 
 */
public abstract class SandwichDecorator implements Sandwich {
	
	/** The sandwich which all the decorators will use to decorate upon */
	protected Sandwich customSandwich;	
	
	/** 
	 * This is the composition which is taken in which will be decorated.
	 * 
	 * 	<b>Now this instance can be a decorator or the concreate component itself</b>
	 *  
	 *  */
	public SandwichDecorator(Sandwich sandwich) {		
		this.customSandwich = sandwich;
	}
	
	public String make() {
		return customSandwich.make();
	}
	
}
