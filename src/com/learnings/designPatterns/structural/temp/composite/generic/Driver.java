package com.learnings.designPatterns.structural.temp.composite.generic;

import com.learnings.designPatterns.structural.temp.composite.AIDXDto;

public class Driver {
    
    public static void main(String[] args) {
        AIDXDto aidxDto = AIDXDto.builder()
            .customerIata("C!").paymentInfo("CO").flightNumber("F1").standId("S1").build();

        MiscOperation miscOperation = new MiscOperation(aidxDto);

        FuelingOperation fuelingOperation = new FuelingOperation(aidxDto);
        PaymentsOperation paymentOperation = new PaymentsOperation(aidxDto);

        miscOperation.register(fuelingOperation);
        miscOperation.register(paymentOperation);

        ValidationOperationExecutor validator = new ValidationOperationExecutor();
        Boolean isValid = miscOperation.perform(validator, aidxDto);

        System.out.println("Validation passed => " + isValid);
    }

}