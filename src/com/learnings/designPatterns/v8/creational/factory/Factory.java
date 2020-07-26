package com.learnings.designPatterns.v8.creational.factory;

import java.util.function.Supplier;

public interface Factory<T> extends Supplier<T> {

    default T newInstance() {
        return this.get();
    }

}