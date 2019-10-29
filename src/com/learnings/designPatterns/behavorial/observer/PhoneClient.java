package com.learnings.designPatterns.behavorial.observer;

public class PhoneClient extends Observer {

	public PhoneClient(Subject subject) {
		this.subject = subject;
		subject.attach(this);
	}
	
	@Override
	void update() {
		System.out.println("Phone stream update received: " + subject.getState());
	}

	public void addMessage(String string) {
		subject.setState(string + ": sent from phone");	// Here when adding a message, we add the message via the Subject so that it noifies all the observers as well
	}

}
