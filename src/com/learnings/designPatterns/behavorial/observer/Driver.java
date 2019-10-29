package com.learnings.designPatterns.behavorial.observer;

/**
 * Used when we want to decouple object from the objects that want to watch it. And their many viewers to the the subject  
 * 
 *	One to many. Event Handling.
 *	Sometimes referred to as Pub/Sub model but not exactly it.
 *
 *	Example - 
 *		Observer, EventListner in jVM
 */
public class Driver {

	public static void main(String[] args) {
		
		Subject subject = new MessageStream();
		// A subject is passed on which is observed by the Observers
		PhoneClient phoneClient = new PhoneClient(subject);
		TabletClient tabletClient = new TabletClient(subject);
		/**
		 * All the messages are passed on through the subject from the client. 
		 * Then the subject notifies all the Observers and then calls the update method
		 * 
		 * The entire communication takes place from the subject
		 * 
		 */
		phoneClient.addMessage("Hello");
		tabletClient.addMessage("Another message");
	}
	
}
