package com.learnings.designPatterns.behavorial.chainofresponsibility;

/**
 * 
 * An abstract api which tells what needs to be done by the handler. 
 * THe handler is only aware of its successor and doesn't care 
 * from where the problem comes to him or how the successor is going to handle the problem 
 *
 */
public abstract class Handler {

	public abstract void develop(ProblemStatement problemStatement);
	
	/** The successor is protected and can be accessed by implementors */
	protected Handler successor;

	/**
	 * Assigns the given value to field <code>{@link #successor}</code>.
	 *
	 * @param successor the successor to be set.
	 */
	public void setSuccessor(Handler successor) {
		this.successor = successor;
	}
	
}
