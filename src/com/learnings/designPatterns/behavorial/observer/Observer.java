package com.learnings.designPatterns.behavorial.observer;

public abstract class Observer {
	protected Subject subject;
	abstract void update();
}
