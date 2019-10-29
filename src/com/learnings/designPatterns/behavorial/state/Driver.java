package com.learnings.designPatterns.behavorial.state;

/**
 *	Abstract class/ interface based
 *
 * 	Each state is class based and a concrete class
 * 	Context unaware
 * 	UML components - Context, State, ConcreteState
 * 
 * 	Can be used to 
 * 	remove the if/else statements in our code and remove the cyclomatic complexity
 *
 */
public class Driver {

	public static void main(String[] args) {
		
		Fan fan = new Fan();
		
		System.out.println(fan.toString());
		
		fan.pullChain();
		
		System.out.println(fan.toString());
		
		fan.pullChain();
		
		System.out.println(fan.toString());
		
		fan.pullChain();
		
		System.out.println(fan.toString());
		
		fan.pullChain();
		
		System.out.println(fan.toString());
	}
	
}
