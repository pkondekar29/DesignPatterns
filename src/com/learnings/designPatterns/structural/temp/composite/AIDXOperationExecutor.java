package com.learnings.designPatterns.structural.temp.composite;

public interface AIDXOperationExecutor {

	public void performMiscOperation(MiscOperation miscOperation, AIDXDto aidxDto);

    public void performOperation(IataAIDXRootOperation rootOperation, AIDXDto aidxDto);

	public void performPaymentOperation(PaymentOperation paymentOperation, AIDXDto aidxDto);
}