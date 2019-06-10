package com.learnings.designPatterns.behavorial.command;

import java.util.List;

/**
 *	This command is responsible for switching all the lights on (or) off. 
 * 
 */
public class AllLightsOnCommand implements Command {

	private List<Light> lights;
	
	public AllLightsOnCommand(List<Light> lights) {
		this.lights = lights;
	}

	@Override
	public void execute() {
		for (Light light : lights) {
			if(!light.isOn()) {		/* Here we can access the state of the receiver and then appropriately call the command on the receiver  */
				light.toogle();
			} else {
				System.out.println("Lights already on");
			}
		}
	}
}
