package com.learnings.designPatterns.structural.composite;

public class DriverProgram {

	public static void main(String[] args) {
		
		Menu menu = new Menu("Main", "/main");
		
		MenuItem safetySubMenu = new MenuItem("Safety", "/safety");
		
		menu.add(safetySubMenu);
		
		Menu claimSubMenu = new Menu("Claims", "/claims");
		
		menu.add(claimSubMenu);
		
		MenuItem importantMenuItem = new MenuItem("Important Claims", "/imp");
		
		claimSubMenu.add(importantMenuItem);
		
		System.out.println(menu.toString());
	}

}
