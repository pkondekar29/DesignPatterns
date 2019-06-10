package com.learnings.designPatterns.behavorial.command;

import java.util.ArrayList;
import java.util.List;

/**
 *	Encapsulates request as an object -> So, the request is passed onto some other object which actually takes care of the request.
 *  Object-oriented callback
 *  Decouple sender from processor -> this is decoupled since the client knows which function to execute from the request.
 * 	Ex - Runnable
 *
 *	Design -> Object per command. So, there is an object per command
 *		-> Command interface. Everything is encapsulated in an interface
 *		-> execute method. -> which will take care of the entire execution.
 *		-> can use reflection to entirely decouple
 *
 *		-> Components of UML -> Command(Runnable), Invoker(Thread), ConcreteCommand(Our own implementation)
 */
// Client does not actually pass command but calls invoker to execute the command on the receiver. 
// If all this is done in the client itself instead of using an invoker/command, then its becomes cluttered in the client itself.
public class Driver {

	public static void main(String[] args) {
		/** JVM example */
		Task task1 = new Task(10, 12);	// encapsulates the request
		Thread thread = new Thread(task1);
		/** Here the task is totally decoupled from the thread. */
		thread.start();			// invoker
		System.out.println();
		
		/** Custom examples */
		Light bedroomLight = new Light();				// client
		Switch lightSwitch = new Switch();		// invoker
		Command onCommand = new OnCommand(bedroomLight);	// command
		/** Here the invoker is passed a command instead of the actual method. The invoker will just invoke the execute method */
		lightSwitch.storeAndExecute(onCommand);		// here the actual invocation takes place
		System.out.println();
		
		Command toggleCommand = new ToggleCommand(bedroomLight);	// toggle command
		lightSwitch.storeAndExecute(toggleCommand);	/** Here the state is stored in the light and same object can be used to toggle the state of object */	
		lightSwitch.storeAndExecute(toggleCommand);
		System.out.println();
		
		List<Light> lights = new ArrayList<>();	// receiver
		Light hallLight = new Light();
		lights.add(bedroomLight);
		lights.add(hallLight);
		Command allLightCommand = new AllLightsOnCommand(lights);	// command
		/**
		 * Here the command is used to switch on entire lights 
		 * But, the command needs to coordinate with the receiver to properly switch on all lights at once.
		 * So, the state of the receiver (should be stored/can be used) in order to manipulate the command on it.  
		 */
		lightSwitch.storeAndExecute(allLightCommand);		 // invoker
	}	
}
