package com.learnings.designPatterns.behavorial.observer;

public class TabletClient extends Observer {

	public TabletClient(Subject subject) {
		this.subject = subject;
		this.subject.attach(this);
	}

	@Override
	void update() {
		System.out.println("Tablet stream update received: " + this.subject.getState());
	}

	public void addMessage(String msg) {
		this.subject.setState(msg + ": sent from tablet");
	}
	
}
