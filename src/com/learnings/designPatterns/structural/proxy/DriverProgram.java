package com.learnings.designPatterns.structural.proxy;

public class DriverProgram {

	/**
	 * Proxy pattern acts as an interface to something else
	 * 
	 * Concepts -
	 * When we want to wrap the object for various reasons-
	 * 	1. can also add mre functionality
	 *  2. can be used to add security, simplicity, reduced cost.
	 *  3. So , the proxy is an interface which is used to access the real object.
	 *  4. Eg. - java.lang.reflect.Proxy -> used for facilating new proxies and creating new proxies.
	 * 
	 * Design - 
	 * This can be used for various problems and can solve various problems. -> This makes it interface based.
	 * So, the proxy resides in b/w to call the patterns.
	 * Main components are - Client, Interface, Proxy, InvocationHandler, Implementation
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		TwitterService service = (TwitterService) SecurityProxy.newInstance(new TwitterServiceImpl());
		System.out.println(service.getTimeline("err"));
	}

}
