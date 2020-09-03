package com.learnings.designPatterns.structural.temp.composite;

public class PaymentOperation extends AIDXOperation {

    public PaymentOperation(AIDXDto aidxDto) {
        super(aidxDto);
    }

    @Override
    public void perform(AIDXOperationExecutor executor) {
        executor.performPaymentOperation(aidxDto);
    }    
}