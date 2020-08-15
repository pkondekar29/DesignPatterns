package com.learnings.designPatterns.v8.creational.registry;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;

import com.learnings.designPatterns.v8.creational.factory.Factory;
import com.learnings.designPatterns.v8.model.Shape;

/**
 * 
 * 
 */
public interface Registry {
    
    // ?? How does this function work  ???? 
    public Factory<? extends Shape> buildShapeFactory(String shape);

    /**
     * So, here the create registry takes in a consumer 
     * which should be responsible for registering the different factory to our registry.(Chaining is used to attain this in only one single consumer)
     * 
     * ALso, once the map, aka Registry is built it cannot be modified.
     * 
     * @param consumer
     * @return
     */
    public static Registry createRegistry(Consumer<Builder<Shape>> consumer) {
        Map<String, Factory<Shape>> map = new HashMap<>();
        Builder<Shape> builder = (label, factory) -> map.put(label, factory);
        consumer.accept(builder);
        // ALso this can be exposed at the API level as well.
        Function<? super String, ? extends Factory<Shape>> function = s -> {
            throw new IllegalArgumentException("Unknown Shape: " + s);
        };
        // The compute if absent will call the function with the key which is absent.
        // This can even be done using getIfAbsent!
        return shape -> {
            return map.computeIfAbsent(shape, 
                // This get or default will throw an exception stating that it doesn;t know how to create the factory 
                // if the shape is not yet registered in the map.
                function);
        };
    }

    // Here the error handling is exposed to the API level, so, the function will be exposed in case it is not able to find the shape in the registry
    public static Registry createRegistry(Consumer<Builder<Shape>> consumer, Function<String, Factory<Shape>> errorHandler) {
        Map<String, Factory<Shape>> map = new HashMap<>();
        Builder<Shape> builder = (label, factory) -> map.put(label, factory);
        consumer.accept(builder);
        
        return shape -> map.computeIfAbsent(shape, errorHandler);
    }

}