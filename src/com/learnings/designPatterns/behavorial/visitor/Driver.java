package com.learnings.designPatterns.behavorial.visitor;

/**
 *	Separate the algo from object structure. Used when we want to add new features 
 * 	Maintain Open/closed principle TODO -> check what is this
 *	Visitor class contains the changes and specializes instead of changing the actual object
 *
 *	This is interface based. We need to start using interface from the start. 
 *	The application has elements. Each element are pieces which would be changed. We add a visitor in each element. Each element has a visit method and each visitor knows all elements.
 *	 
 *	We add functionality by adding a visitor.
 *
 * 	Components - Visitor, ConcreteVisitor, Element, VisitorElement
 */
public class Driver {

	public static void main(String[] args) {
		PartsOrder order = new PartsOrder();
		order.addPart(new Wheel());
		order.addPart(new Oil());
		
		order.accept(new PartShippingVisitor());
		order.accept(new PartDisplayVisitor());
	}
	
}
