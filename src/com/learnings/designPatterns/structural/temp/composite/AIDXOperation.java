package com.learnings.designPatterns.structural.temp.composite;

public abstract class AIDXOperation {

    protected AIDXDto aidxDto;

    public AIDXOperation(AIDXDto aidxDto) {
        this.aidxDto = aidxDto;
    }

    public abstract void perform(AIDXOperationExecutor executor);
}