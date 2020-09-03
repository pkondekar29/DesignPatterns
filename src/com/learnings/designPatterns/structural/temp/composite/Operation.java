package com.learnings.designPatterns.structural.temp.composite;

public interface Operation<T, R> {
    
    public R perform(AIDXOperationExecutor executor);

}