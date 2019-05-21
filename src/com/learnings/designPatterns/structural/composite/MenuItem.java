package com.learnings.designPatterns.structural.composite;

/**
 * 
 * This is the leaf of the composite and this has the same implementation as the composite. (toString method)
 * @author I353403
 *
 */
public class MenuItem extends MenuComponent {

	public MenuItem(String name, String url) {
		setName(name);
		setUrl(url);
	}
	
	@Override
	public String toString() {
		return print(this);
	}

}
