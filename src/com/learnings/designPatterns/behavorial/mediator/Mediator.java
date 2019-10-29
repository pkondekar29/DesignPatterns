package com.learnings.designPatterns.behavorial.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * Helps in loose coupling.
 * Simplified communication. 
 * Beware with the complexity of the mediator
 *
 */
public class Mediator {

	List<Light> lights = new ArrayList<>();
	
	public void registerLight(Light light) {
		this.lights.add(light);
	}
	
	public void turnOnAllLights() {
		for (Light light : lights) {
			if(!light.isOn()) {
				light.toogle();		// communicating with the colleagues 
			}
		}
	}

	// Hence, the mediator is the one who communicates the colleagues. Here we are switching off the lights
	// So, the mediator needs to be changed to include more functionalities
	// The mediator knows all the colleagues instead of passing around all the collegues to the commands. Hence, the mediator acts like a Hub 
	// We can also abstract the mediator and control complex commands
	public void turnOffAllLights() {
		for (Light light : lights) {
			if(light.isOn()) {
				light.toogle();
			}
		}
	}
}
