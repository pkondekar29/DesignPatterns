package com.learnings.designPatterns.structural.temp.composite.generic;

public interface Operation<T> {
    
    public <R> R perform(OperationExecutor<T, R> executor, T object);

}