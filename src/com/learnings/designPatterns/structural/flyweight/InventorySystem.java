package com.learnings.designPatterns.structural.flyweight;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class InventorySystem {

	private Catalog catalog = new Catalog();
	private List<Order> orders = new CopyOnWriteArrayList<>();
	
	public void takeOrder(String name, int orderNumber){
		Item item = catalog.lookUp(name);
		Order order = new Order(orderNumber, item);
		orders.add(order);
	}
	
	public void process() {
		for (Order order : orders) {
			order.processOrder();
			orders.remove(order);
		}
	}
	
	String report() {
		return "Total: " + catalog.totalSize();
	}
}
