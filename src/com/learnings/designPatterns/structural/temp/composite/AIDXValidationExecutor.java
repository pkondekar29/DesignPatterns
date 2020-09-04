package com.learnings.designPatterns.structural.temp.composite;

public class AIDXValidationExecutor implements AIDXOperationExecutor {

    protected String producer;

    AIDXValidationExecutor(String producer) {
        this.producer = producer;
    }

    @Override
    public void performMiscOperation(MiscOperation miscOperation, AIDXDto aidxDto) {
        System.out.println("Performing misc validations");
    }

    @Override
    public void performPaymentOperation(PaymentOperation paymentOperation, AIDXDto aidxDto) {
        System.out.println("Performing payment validations");
    }

    @Override
    public void performOperation(IataAIDXRootOperation rootOperation, AIDXDto aidxDto) {
        rootOperation.operations().stream()
            .forEach(o -> {
                o.perform(this);
            });
    }

}