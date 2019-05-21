package com.learnings.designPatterns.structural.composite;

/**
 * This is the composite who is aware of all its children
 * 
 * @author I353403
 *
 */
public class Menu extends MenuComponent {

	public Menu(String name, String url) {
		setName(name);
		setUrl(url);
	}
	
	@Override
	public MenuComponent add(MenuComponent menuComponent) {
		menuComponents.add(menuComponent);
		return menuComponent;
	}
	
	@Override
	public MenuComponent remove(MenuComponent menuComponent) {
		menuComponents.remove(menuComponent);
		return menuComponent;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append(print(this));
		for (final MenuComponent menuComponent : menuComponents) {
			sb.append(menuComponent.toString());
		}
		
		return sb.toString();
	}

}
