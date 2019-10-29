package com.learnings.designPatterns.behavorial.command;

/**
 *	invoker of command
 * 
 */
public class Switch {

	// so pass the command and execute it
	public void storeAndExecute(Command command) {
		command.execute();
	}
	
}
