package com.learnings.designPatterns.behavorial.template;

public class OfflineOrder extends OrderTemplate {

	@Override
	public void doCheckout() {
		System.out.println("Took order from store!");
	}

	@Override
	public void doPayment() {
		System.out.println("Cash payed!");
	}

	@Override
	public void doReceipt() {
		System.out.println("Receipt printed!");
	}

}
