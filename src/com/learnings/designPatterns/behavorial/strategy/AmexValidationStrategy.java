package com.learnings.designPatterns.behavorial.strategy;

public class AmexValidationStrategy extends ValidationStrategy {

	@Override
	public boolean isValid(CreditCard creditCard) {
		return super.passesLuhnAlgo(creditCard.getNumber());
	}

}
