package com.learnings.designPatterns.behavorial.mediator;

/**
 * We want to achieve Loose coupling. 
 * Well defined, but complex. Reusable components
 * 
 * This only acts like a hub or router in the application 
 * where the objects communicates with each other
 * 
 * The pieces which are present are - Mediator, Colleague
 */
public class Driver {

	public static void main(String[] args) {
		Mediator mediator = new Mediator();
		Light bedroomLight = new Light("bedroom");
		Light kitchenLight = new Light("kitchen");
		
		mediator.registerLight(kitchenLight);
		mediator.registerLight(bedroomLight);
		
		// Here the mediator is the input different from the Command interface
		Command turnOnAllLights = new TurnOnAllLights(mediator); 
		turnOnAllLights.execute();		
		
		Command turnOffAllLights = new TurnOffAllLights(mediator);
		turnOffAllLights.execute();
	}
	
}
