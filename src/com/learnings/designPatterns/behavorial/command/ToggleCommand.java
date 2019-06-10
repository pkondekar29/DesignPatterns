package com.learnings.designPatterns.behavorial.command;

public class ToggleCommand implements Command {

	private Light light;
	
	public ToggleCommand(Light light) {
		this.light = light;
	}
	
	@Override
	public void execute() {
		light.toogle();
	}

}
