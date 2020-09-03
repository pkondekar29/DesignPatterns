package com.learnings.designPatterns.structural.temp.composite;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Builder
@ToString
@Data
public class FuelRequest {
    
    public String flightNumber;
    public String standId;
    public String paymentInfo;
    public String customerIata;

}