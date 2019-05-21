package com.learnings.designPatterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class Catalog {

	private Map<String, Item> items = new HashMap<>();
	
	public Catalog() {
		// TODO Auto-generated constructor stub
	}
	
	/** This is a factory method */
	public Item lookUp(String name) {
		if(!items.containsKey(name)) {
			items.put(name, new Item(name));
		}
		return items.get(name);
	}
	
	public int totalSize() {
		return items.size();
	}
	
}
