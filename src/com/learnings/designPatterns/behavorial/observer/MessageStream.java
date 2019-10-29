package com.learnings.designPatterns.behavorial.observer;

import java.util.ArrayDeque;
import java.util.Deque;

public class MessageStream extends Subject {

	private Deque<String> messageHistory = new ArrayDeque<>();	// keeps the history of the messages received
	
	@Override
	void setState(String state) {
		messageHistory.add(state);		// when setting the state, we also notify all the observers via the Subject(sup class)
		this.notifyObservers();
	}

	@Override
	String getState() {
		return messageHistory.getLast();
	}

}
