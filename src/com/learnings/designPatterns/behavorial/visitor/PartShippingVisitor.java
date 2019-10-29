package com.learnings.designPatterns.behavorial.visitor;

import java.util.List;

public class PartShippingVisitor implements PartVisitor {

	double shippingAmt = 0;
	
	@Override
	public void visit(Oil oil) {
		shippingAmt += 100.0;
	}

	@Override
	public void visit(Wheel wheel) {
		shippingAmt += 1000.0;
	}

	@Override
	public void visit(PartsOrder partsOrder) {
		List<Part> parts = partsOrder.getParts();
		if(parts.size() >= 2) {
			shippingAmt -= 5;
		}
		System.out.println(shippingAmt);
	}

	public double getShippingAmt() {
		return shippingAmt;
	}

}
