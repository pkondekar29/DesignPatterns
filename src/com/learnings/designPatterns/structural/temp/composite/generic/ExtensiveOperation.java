package com.learnings.designPatterns.structural.temp.composite.generic;

import java.util.ArrayList;
import java.util.List;

import com.learnings.designPatterns.structural.temp.composite.AIDXDto;

public abstract class ExtensiveOperation extends AIDXOperation {

    private List<AIDXOperation> operations = new ArrayList<>();

    public ExtensiveOperation(AIDXDto aidxDto) {
        super(aidxDto);
    }

    public void register(AIDXOperation operation) {
        this.operations.add(operation);
    }

    public List<AIDXOperation> operations() {
        return this.operations;
    }

    @Override
    public <R> R perform(OperationExecutor<AIDXDto, R> executor, AIDXDto aidxDto) {
        return executor.performExtensiveOperation(this, aidxDto);
    }
}