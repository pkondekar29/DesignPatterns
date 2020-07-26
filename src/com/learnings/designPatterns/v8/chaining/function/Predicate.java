package com.learnings.designPatterns.v8.chaining.function;

import java.util.Objects;


/**
 * So, we can use default methods 
 * can be used to chain or modify the behaviour of lambda epressions
 * 
 * @param <T>
 */
@FunctionalInterface
public interface Predicate<T> {

    boolean test(T t);

    default Predicate<T> and(Predicate<T> other) {
        Objects.requireNonNull(other);
        return (T t) -> this.test(t) && other.test(t);
    }

    default Predicate<T> negate() {
        return (T t) -> !this.test(t);
    }

}