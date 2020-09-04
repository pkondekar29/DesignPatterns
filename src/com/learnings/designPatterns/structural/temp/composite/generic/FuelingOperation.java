package com.learnings.designPatterns.structural.temp.composite.generic;

import com.learnings.designPatterns.structural.temp.composite.AIDXDto;

public class FuelingOperation extends SimpleOperation {

    public FuelingOperation(AIDXDto aidxDto) {
        super(aidxDto);
    }

    @Override
    public <R> R perform(OperationExecutor<AIDXDto, R> executor, AIDXDto aidxDto) {
        return executor.performFuelingOperation(this, aidxDto);
    }
    
}