package com.learnings.designPatterns.behavorial.template;

/**
 *	The template design pattern is used to design to template an algo.
 *	And the children controls the actual algo execution
 *	So, the base call is responsible to call the children class
 *	This is always class based
 * 	Components - AbstractBaseClass, ConcreteClass
 * 
 */
public class Driver {

	public static void main(String[] args) {
		
		OrderTemplate webTemplate = new WebTemplate();
		
		webTemplate.processOrder();
		
		OrderTemplate offlineTemplate = new OfflineOrder();
		offlineTemplate.isGift = true;
		
		offlineTemplate.processOrder();
	}
	
}
