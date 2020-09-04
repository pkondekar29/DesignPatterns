package com.learnings.designPatterns.structural.temp.composite;

import java.util.ArrayList;
import java.util.List;

public abstract class AIDXExtensiveOperation extends AIDXOperation {

	protected List<AIDXOperation> aidxOperations = new ArrayList<>();
	
	public AIDXExtensiveOperation(AIDXDto aidxDto) {
		super(aidxDto);
	}
	
    public void register(AIDXOperation operation) {
        this.aidxOperations.add(operation);
    }

    public void deregister(AIDXOperation operation) {
        this.aidxOperations.remove(operation);
    }

    public void perform(AIDXOperationExecutor executor) {
        // executor.performOperation(this);
    }
    
}
