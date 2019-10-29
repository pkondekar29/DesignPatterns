package com.learnings.designPatterns.behavorial.template;

public abstract class OrderTemplate {

	public boolean isGift;		// Example of hook
	public abstract void doCheckout();
	public abstract void doPayment();
	public abstract void doReceipt();
	
	public void wrapGift() {
		System.out.println("Gift is wraped");
	}
	
	public final void processOrder() {		// This method is final as this cannot be overridden by children and is the template for processing Order
		doCheckout();
		doPayment();
		if(isGift) {
			wrapGift();
		} else {
			doReceipt();
		}
	}
}
