package com.learnings.designPatterns.structural.temp.composite;

public class MiscOperation extends AIDXOperation {

    public MiscOperation(AIDXDto aidxDto) {
        super(aidxDto);
    }

    @Override
    public void perform(AIDXOperationExecutor executor) {
        executor.performMiscOperation(this, aidxDto);
    }
    
}