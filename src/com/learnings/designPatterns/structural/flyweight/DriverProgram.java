package com.learnings.designPatterns.structural.flyweight;

public class DriverProgram {

	/**
	 * 
	 * Pattern of pattern.
	 * 
	 * Utilizes a factory pattern once for creation.
	 * Encompases creation inside of structural pattern. It can manage the total lifecycle of the object.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
	
		
//		Integer firstInt = Integer.valueOf(7);		/* This will get an object with the value of 7. If the object doesn't exist then it will create the object and return it */
//		Integer second = Integer.valueOf(7);	/* Next time, the same object is returned since it is already present in its pool */
//		Integer third = Integer.valueOf(2);
//		System.out.println(System.identityHashCode(firstInt));
//		System.out.println(System.identityHashCode(second));
//		System.out.println(System.identityHashCode(third));
//		
		
		InventorySystem is = new InventorySystem();
		
		is.takeOrder("Pen", 1);
		is.takeOrder("Pencil", 10);
		is.takeOrder("Scale", 4);
		is.takeOrder("Pen", 4);
		is.takeOrder("Pencil", 34);
		is.takeOrder("Scale", 245);
		is.takeOrder("Pen", 3);
		is.takeOrder("Pencil", 46);
		
		is.process();
		System.out.println(is.report());
	}
	
}
