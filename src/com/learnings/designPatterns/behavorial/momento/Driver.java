package com.learnings.designPatterns.behavorial.momento;

public class Driver {

	// Momento is used to rollback/undo
	// Example - Date, Serializable
	public static void main(String[] args) {
		// design is class based
		// Components - Originator, CareTaker, Momento, MagicCookie
		/**
		 * Used to capture the state and revert the state
		 * 
		 */
		/**
		 * The originator is the true copy of the momento. It has a state associated with it and the ability to create a new momento.
		 * The caretaker keeps the copy of momentos
		 */
		CareTaker careTaker = new CareTaker();
		
		Employee emp = new Employee();
		emp.setName("palash");
		emp.setAddress("Blr");
		
		careTaker.save(emp);
		
		System.out.println("Emp at start: " + emp.toString());
		
		emp.setName("Pal");
		
		System.out.println("Current state: " + emp.toString());
		
		careTaker.revert(emp);
		
		System.out.println("Emp after revert: " + emp.toString());
	}
	
}
