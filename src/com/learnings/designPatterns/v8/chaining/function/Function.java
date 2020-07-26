package com.learnings.designPatterns.v8.chaining.function;

import java.util.Objects;

@FunctionalInterface
public interface Function<T, R> {

    R apply(T t);

    default <V> Function<T, V> andThen(Function<R, V> other) {
        Objects.requireNonNull(other);
        return (T t) -> {
            R r = this.apply(t);
            return other.apply(r);
        };
    }

    default <V> Function<V, R> compose(Function<V, T> other) {
        Objects.requireNonNull(other);
        return (V v) -> {
            // Here the apply is first called on the other
            T t = other.apply(v);
            return this.apply(t);
        };
    }

}