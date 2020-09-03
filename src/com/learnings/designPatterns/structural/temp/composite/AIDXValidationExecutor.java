package com.learnings.designPatterns.structural.temp.composite;

public class AIDXValidationExecutor implements AIDXOperationExecutor {

    protected String producer;

    AIDXValidationExecutor(String producer) {
        this.producer = producer;
    }

    @Override
    public void performMiscOperation(AIDXDto aidxDto) {
        System.out.println("Performing misc validations");
    }

    @Override
    public void performPaymentOperation(AIDXDto aidxDto) {
        System.out.println("Performing payment validations");
    }

    // @Override
    // public void performOperation(IataAIDXRootOperation rootOperation) {
    //     rootOperation.operations().stream()
    //         .forEach(o -> {
    //             o.perform(this);
    //         });
    // }

}