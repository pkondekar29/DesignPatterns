package com.learnings.designPatterns.structural.temp.composite.generic;

import java.util.Optional;

import com.learnings.designPatterns.structural.temp.composite.AIDXDto;

public abstract class AIDXOperationExecutor<R> implements OperationExecutor<AIDXDto, R> {
    
    public R performExtensiveOperation(ExtensiveOperation extensiveOperation, AIDXDto aidxDto) {
        Optional<R> result = 
            extensiveOperation.operations().stream()
                .map(operation -> operation.perform(this, aidxDto))
                .reduce(getAccumulator());

        //  TODO -> Think on this returning of null
        if(result.isPresent()) {
            return result.get();
        } else {
            return null;
        }
    }

}