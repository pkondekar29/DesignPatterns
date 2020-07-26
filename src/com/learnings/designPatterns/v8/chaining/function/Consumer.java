package com.learnings.designPatterns.v8.chaining.function;

import java.util.Objects;

@FunctionalInterface
public interface Consumer<T> {

    public void accept(T t);

    // Functional interfaces should be build in a way 
        // which doesn't allow things to fail when they are executed later on. So, we should have fail fast approach.
    default Consumer<T> andThen(Consumer<T> other) {
        // This line disallows creation of object if the other is null
        Objects.requireNonNull(other);
        // Way to write typed parameters in lambda
        return (T t) -> {
            this.accept(t);
            other.accept(t);
        };
    }

}