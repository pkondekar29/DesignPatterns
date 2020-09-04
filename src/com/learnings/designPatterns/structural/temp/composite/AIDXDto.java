package com.learnings.designPatterns.structural.temp.composite;

import lombok.Builder;
import lombok.ToString;

@Builder
@ToString
public class AIDXDto {
    
    public String flightNumber;
    public String customerIata;
    public String standId;
	public String paymentInfo;

}