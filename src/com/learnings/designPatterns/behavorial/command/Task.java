package com.learnings.designPatterns.behavorial.command;

public class Task implements Runnable {

	private int a;
	private int b;
	
	public Task(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	@Override
	public void run() {	// execeute method
		System.out.println(this.b * this.a);
	}
}