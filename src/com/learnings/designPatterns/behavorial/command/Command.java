package com.learnings.designPatterns.behavorial.command;

/**
 * Command interface which will take care of invocation
 * 
 * The command actually contains the 'what' of the command. So, the command tells what needs to be done with the receiver.<br>
 * Encapsulates the entire action.
 * Used very often.
 * 
 * Used to decouple the sender with the processor.
 * Often used for undo functionality.
 */
public interface Command {

	public void execute();
	
}
