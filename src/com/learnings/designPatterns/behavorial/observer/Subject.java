package com.learnings.designPatterns.behavorial.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {

	private List<Observer> observers = new ArrayList<>();	// Stores the list of observers
	
	abstract void setState(String state);
	abstract String getState();
	
	public void attach(Observer observer) {		// register an observer
		observers.add(observer);
	}
	
	public void remove(Observer observer) {
		observers.remove(observer);
	}
	
	public void notifyObservers() {		// notify the observers, i.e we call the update method which can be used as a handler for the update
		for (Observer observer : observers) {
			observer.update();
		}
	}
}

