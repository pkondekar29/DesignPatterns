package com.learnings.designPatterns.structural.flyweight;

/**
 * The item which we will be creating a lot of. SO, we create flyweight of all the instances. 
 * 
 * <b>Immutable object</b>
 * 
 * This object is used a lot so we create this only few times and it is passed around for use.
 * 
 */
public class Item {
	
	/** There are no getter, setters present. It only consists of final instances. */
	/** Hence it is very memory intensive. */
	private final String name;	
	
	public Item(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return this.name;
	}
	
}
