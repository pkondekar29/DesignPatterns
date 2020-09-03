package com.learnings.designPatterns.structural.temp.composite;

public interface AIDXOperationExecutor {

	public void performMiscOperation(AIDXDto aidxDto);

	public void performPaymentOperation(AIDXDto aidxDto);

    // public void performOperation(IataAIDXRootOperation rootOperation);
}