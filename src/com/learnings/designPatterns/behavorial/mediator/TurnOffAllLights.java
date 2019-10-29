package com.learnings.designPatterns.behavorial.mediator;

public class TurnOffAllLights implements Command {

	private Mediator mediator;
	
	public TurnOffAllLights(Mediator mediator) {
		this.mediator = mediator;
	}

	@Override
	public void execute() {
		mediator.turnOffAllLights();
	}

}
