package com.learnings.designPatterns.structural.temp.composite;

import java.util.ArrayList;
import java.util.List;

public abstract class AIDXComposite extends AIDXOperation {

	protected List<AIDXOperation> aidxOperations = new ArrayList<>();
	
	public AIDXComposite(AIDXDto aidxDto) {
		super(aidxDto);
	}
	
    public void add(AIDXOperation operation) {
        this.aidxOperations.add(operation);
    }

    public void remove(AIDXOperation operation) {
        this.aidxOperations.remove(operation);
    }
    
}
