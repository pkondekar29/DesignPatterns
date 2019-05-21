package com.learnings.designPatterns.structural.flyweight;

/**
 * Dummy oobject just for processing the items
 * 
 */
public class Order {

	private final int orderNumber;
	private final Item item;
	
	public Order(int o, Item i) {
		this.orderNumber = o;
		this.item = i;
	}
	
	public String processOrder(){
		return "Order no: " + orderNumber + ", item: " + item.toString();
	}
	
}
