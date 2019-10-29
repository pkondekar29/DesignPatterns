package com.learnings.designPatterns.behavorial.command;

// concrete command - this is where the actual execution takes place
public class OnCommand implements Command {

	private Light light;
	
	public OnCommand(Light light) {
		this.light = light;
	}
	
	@Override
	public void execute() {
		this.light.on();
	}

}
