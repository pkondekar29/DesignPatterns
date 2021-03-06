package com.learnings.designPatterns.behavorial.visitor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PartsOrder implements Part{
	
	private List<Part> parts = new ArrayList<>();
	
	public PartsOrder() {
	
	}
	
	public void addPart(Part part) {
		parts.add(part);
	}

	public List<Part> getParts() {
		return Collections.unmodifiableList(parts);
	}

	@Override
	public void accept(PartVisitor visitor) {
		for (Part part : parts) {
			part.accept(visitor);
		}
		visitor.visit(this);
	}
	
	
}
