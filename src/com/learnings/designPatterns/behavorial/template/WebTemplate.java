package com.learnings.designPatterns.behavorial.template;

public class WebTemplate extends OrderTemplate {

	@Override
	public void doCheckout() {
		System.out.println("Order checked out by web!");
	}

	@Override
	public void doPayment() {
		System.out.println("Order payment received via web!");
	}

	@Override
	public void doReceipt() {
		System.out.println("Order receipt generated and mailed to user!");
	}

}
