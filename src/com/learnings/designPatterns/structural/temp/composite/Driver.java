package com.learnings.designPatterns.structural.temp.composite;

import com.learnings.designPatterns.structural.temp.composite.FuelRequest.FuelRequestBuilder;

public class Driver {

    public static void main(String[] args) {
        AIDXDto aidxDto = AIDXDto.builder().flightNumber("FL123").customerIata("cs12").paymentInfo("CO").standId("S1").build();
        
        // 1. Build operation which we want to perform based configuration of producer
        // 1.1 The root operation which we want to perform
        IataAIDXRootOperation rootOperation = new IataAIDXRootOperation(aidxDto);

        // 1.2 Find out smaller operations which we want to perform 
        MiscOperation miscOperation = new MiscOperation(aidxDto);
        PaymentOperation paymentOperation = new PaymentOperation(aidxDto);

        // 1.3 Register the operations to our root operation
        rootOperation.register(miscOperation);
        rootOperation.register(paymentOperation);

        // 2. Determine the operation executors and then perform the operation
        
        // How to determine?? Think on this

        // 2.1 Create mapping operation executor
        FuelRequestBuilder builder = new FuelRequestBuilder();
        AIDXOperationExecutor mappingExecutor = new AIDXMappingExecutor(builder);
        rootOperation.perform(mappingExecutor);

        System.out.println("Mapped aidx dto to FR => " + builder.build());

        // 2.2 Create validation operation executor
        AIDXOperationExecutor validationExecutor = new AIDXValidationExecutor("SMH");
        rootOperation.perform(validationExecutor);

        System.out.println("Validated the entire aidx dto");
    }

}