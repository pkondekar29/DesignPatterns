package com.learnings.designPatterns.behavorial.state;

public class FanOffState extends State {

	Fan fan;
	
	public FanOffState(Fan fan) {
		this.fan = fan;
	}
	
	@Override
	public void handleRequest() {
		System.out.println("Turning fan to Low");
		fan.setState(fan.getFanLowState());
	}
	
	@Override
	public String toString() {
		return "Fan is off";
	}
}
