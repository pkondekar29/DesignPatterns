package com.learnings.designPatterns.structural.temp.composite.generic;

import java.util.function.BinaryOperator;

public interface OperationExecutor<T, R> {
    
    public R performPaymentOperation(PaymentsOperation paymentsOperation, T object);

    public R performFuelingOperation(FuelingOperation fuelingOperation, T object);

    public R performExtensiveOperation(ExtensiveOperation extensiveOperation, T object);
    
    public BinaryOperator<R> getAccumulator();

}