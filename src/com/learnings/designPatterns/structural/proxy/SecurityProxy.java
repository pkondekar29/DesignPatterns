package com.learnings.designPatterns.structural.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class SecurityProxy implements InvocationHandler {
	
	private Object obj;
	
	private SecurityProxy(Object obj) {
		this.obj = obj;
	}

	/** This becomes like a new factory */
	public static Object newInstance(Object obj) {
		/** This builds new class and interfaces around the object and generates a proxy around it. */
		return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), new SecurityProxy(obj));
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Object result = null;
		try {
			result = method.invoke(obj, args);
		} catch(InvocationTargetException e) {
			throw e.getTargetException();
		} catch(Exception e) {
			System.out.println(e.getMessage());
			throw new RuntimeException(e.getMessage());
		}
		return result;
	}

}
