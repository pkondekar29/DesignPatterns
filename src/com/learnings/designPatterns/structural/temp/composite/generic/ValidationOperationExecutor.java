package com.learnings.designPatterns.structural.temp.composite.generic;

import java.util.function.BinaryOperator;

import com.learnings.designPatterns.structural.temp.composite.AIDXDto;

public class ValidationOperationExecutor extends AIDXOperationExecutor<Boolean> {

    @Override
    public Boolean performPaymentOperation(PaymentsOperation operation, AIDXDto aidxDto) {
        System.out.println(" Validating Payment details on AIDX Dto => " + aidxDto);
        return Boolean.TRUE;
    }

    @Override
    public Boolean performFuelingOperation(FuelingOperation fuelingOperation, AIDXDto aidxDto) {
        System.out.println(" Validating fueling fields on AIDX Dto" + aidxDto);
        return Boolean.TRUE;
    }

    @Override
    public BinaryOperator<Boolean> getAccumulator() {
        return (b1, b2) -> Boolean.logicalAnd(b1, b2);
    }
}