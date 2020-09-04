package com.learnings.designPatterns.structural.temp.composite;

import java.util.ArrayList;
import java.util.List;

public class IataAIDXRootOperation extends AIDXOperation {
    
    protected List<AIDXOperation> operations = new ArrayList<>();

    public IataAIDXRootOperation(AIDXDto aidxDto) {
        super(aidxDto);
    }

    public void register(AIDXOperation operation) {
        this.operations.add(operation);
    }

    public void deregister(AIDXOperation operation) {
        this.operations.remove(operation);
    }

    public List<AIDXOperation> operations() {
        return this.operations;
    }

    @Override
    public void perform(AIDXOperationExecutor executor) {
        executor.performOperation(this, aidxDto);
    }
}