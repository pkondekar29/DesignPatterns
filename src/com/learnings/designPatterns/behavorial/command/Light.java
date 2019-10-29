package com.learnings.designPatterns.behavorial.command;

/**
 * Receiver of command
 * 
 */
public class Light {

	private boolean isOn = false;		// state of the command is encapsulated in the receiver
	
	public void toogle() {
		if(isOn) {
			off();
			isOn = false;
		} else {
			on();
			isOn = true;
		}
	}
	
	public void on() {
		System.out.println("Light switched on");
		isOn = true;
	}
	
	public void off() {
		System.out.println("Light switch off");
		isOn = false;
	}

	/**
	 * Returns the value of field <code>{@link #isOn}</code>.
	 *
	 * @return the isOn
	 */
	public boolean isOn() {
		return isOn;
	}
}
