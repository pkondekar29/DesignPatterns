package com.learnings.designPatterns.structural.proxy;

public class TwitterServiceImpl implements TwitterService{

	@Override
	public String getTimeline(String screenName) {
		return "Post of screen: " + screenName;
	}

	@Override
	public void postToTimeline(String screenName, String message) {
		
	}

	
	
}
