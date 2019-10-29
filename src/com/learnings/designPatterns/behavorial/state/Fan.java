package com.learnings.designPatterns.behavorial.state;

public class Fan {

	State fanLowState;
	State fanOffState;
	State fanMedState;
	
	State state;
	
	public Fan() {
		fanOffState = new FanOffState(this);
		fanLowState = new FanLowState(this);
		fanMedState = new FanMedState(this);
		
		state = fanOffState;
	}

	public void pullChain() {
		state.handleRequest();
	}
	
	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public State getFanOffState() {
		return fanOffState;
	}
	
	public State getFanLowState() {
		return fanLowState;
	}

	public State getFanMedState() {
		return fanMedState;
	}
	
	@Override
	public String toString() {
		return this.state.toString();
	}
}
