package com.learnings.designPatterns.behavorial.mediator;

public class Light {

	private boolean isOn = false;
	
	private String location;
	
	Light(String location){
		this.location = location;
	}
	
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
