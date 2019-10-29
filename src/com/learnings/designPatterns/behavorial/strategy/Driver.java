package com.learnings.designPatterns.behavorial.strategy;


/**
 *	Used when we want to eliminate conditional statements in application/
 *	Also when its difficult to add strategies in our application
 * 	Also, the client knows about the strategy but just dont know how the strategy would be implemented
 *	Has One Concrete class per strategy.
 *
 *	Eg - Comparator in sort
 *
 *	Copmonents - Context, Strategy, ConcreteStrategy
 */
public class Driver {

	public static void main(String[] args) {
		ValidationStrategy amexStrategy = new AmexValidationStrategy();
		
		CreditCard card = new CreditCard(amexStrategy);		// For a new strategy, we just require a new impl and it will work with that strategy
		card.setNumber("2358975049714");
		card.setCvv("781");
		card.setDate("2022-10-22");
		
		System.out.println("Amx card is: " + card.isValid());
	}

}
