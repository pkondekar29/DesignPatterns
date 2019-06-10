package com.learnings.designPatterns.behavorial.command;

/**
 *	invoker  
 * 
 */
public class Switch {

	// so pass the command and execute it
	public void storeAndExecute(Command command) {
		command.execute();
	}
	
}
