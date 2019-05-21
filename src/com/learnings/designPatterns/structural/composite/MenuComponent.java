package com.learnings.designPatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * This is the abstract functionality which will be implemented throughout the hierarchical tree. 
 * 
 * So, all the leafs and the composites can be treated similarly.
 * Pitfalls -
 * Over simplifies the solution
 * Hard to restrict something on the leaf nodes. 
 * But we can have the Unsupported Exception which can be throw for controlling the restriction.
 * Size can be grown fairly quickly.
 * 
 * @author I353403
 *
 */
public abstract class MenuComponent {

	private String name;
	private String url;
	List<MenuComponent> menuComponents = new ArrayList<>();
	
	public String print(MenuComponent menuComponent) {
		StringBuilder sb = new StringBuilder(name);
		sb.append(": ").append(url).append("\n");
		return sb.toString();
	}
	
	/**
	 * Assigns the given value to field <code>{@link #name}</code>.
	 *
	 * @param name the name to be set.
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * Assigns the given value to field <code>{@link #url}</code>.
	 *
	 * @param url the url to be set.
	 */
	public void setUrl(String url) {
		this.url = url;
	}
	/**
	 * Returns the value of field <code>{@link #name}</code>.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * Returns the value of field <code>{@link #url}</code>.
	 *
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}
	
	public abstract String toString();

	/** So, the menuItem and Menu have an ability to implement this functionality if needed, else it is not supported */
	public MenuComponent add(MenuComponent menuComponent) {		/* Here we are setting this as unsupported till the time it is not declared */
		throw new UnsupportedOperationException();
	}
	
	/** This can also be made final in the child componenets which will obstruct the user of the functionality */
	public MenuComponent remove(MenuComponent menuComponent) {
		throw new UnsupportedOperationException();
	}
	
}
