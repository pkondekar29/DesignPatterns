package com.learnings.designPatterns.v8.creational.factory;

import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public interface Factory<T> extends Supplier<T> {

    default T newInstance() {
        return this.get();
    }

    default List<T> create5() {
        return IntStream.range(0, 5)
                .mapToObj(i -> this.get())
                .collect(Collectors.toList());
    }

	static <T> Factory<T> createFactory(Supplier<T> supplier) {
        // To convert this to a singleton we just have to do =>
        T singleton = supplier.get();
		return () -> singleton;
    }
    
    /**
     * Here we are using a function to generate a supplier. 
     * 
     * Since the Circle constructor with a dependency on Color object and the o/p is a new Circle
     * we use a factory to achieve this behaviour.
     * 
     * This is called partial implementation of a function since we are using a function to generate a supplier
     * 
     */
    static <P, T> Factory<T> createFactory(Function<P, T> constructor, P param)  {
        return () -> constructor.apply(param);
    }

}