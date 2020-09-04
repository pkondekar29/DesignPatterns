package com.learnings.designPatterns.structural.temp.composite.generic;

import com.learnings.designPatterns.structural.temp.composite.AIDXDto;

public class PaymentsOperation extends SimpleOperation {

    public PaymentsOperation(AIDXDto aidxDto) {
        super(aidxDto);
    }

    @Override
    public <R> R perform(OperationExecutor<AIDXDto, R> executor, AIDXDto aidxDto) {
        return executor.performPaymentOperation(this, aidxDto);
    }
    
}