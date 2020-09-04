package com.learnings.designPatterns.structural.temp.composite;

import com.learnings.designPatterns.structural.temp.composite.FuelRequest.FuelRequestBuilder;

public class AIDXMappingExecutor implements AIDXOperationExecutor {

    FuelRequestBuilder builder;

	public AIDXMappingExecutor(FuelRequestBuilder builder) {
        this.builder = builder;
	}

	@Override
	public void performMiscOperation(MiscOperation miscOperation, AIDXDto aidxDto) {
        this.builder.flightNumber(aidxDto.flightNumber);
        this.builder.customerIata(aidxDto.customerIata);
		System.out.println("Performing Misc mapping");
	}

	@Override
	public void performPaymentOperation(PaymentOperation paymentOperation, AIDXDto aidxDto) {
        this.builder.paymentInfo(aidxDto.paymentInfo);
		System.out.println("Perform payemnt related mapping");
	}

	@Override
	public void performOperation(IataAIDXRootOperation rootOperation, AIDXDto aidxDto) {
		rootOperation.operations().stream()
            .forEach(o -> {
                o.perform(this);
			});
	}

}
