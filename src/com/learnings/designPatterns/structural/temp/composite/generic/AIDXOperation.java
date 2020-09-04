package com.learnings.designPatterns.structural.temp.composite.generic;

import com.learnings.designPatterns.structural.temp.composite.AIDXDto;

public abstract class AIDXOperation implements Operation<AIDXDto> {
    
    protected AIDXDto aidxDto;

    public AIDXOperation(AIDXDto aidxDto) {
        this.aidxDto = aidxDto;
    }

}