package com.learnings.designPatterns.v8.creational.registry;

import java.util.function.Consumer;

import com.learnings.designPatterns.v8.creational.factory.Factory;
import com.learnings.designPatterns.v8.model.Rectangle;
import com.learnings.designPatterns.v8.model.Shape;
import com.learnings.designPatterns.v8.model.Triangle;

public class Driver {
    
    public static void main(String[] args) {
        
        Consumer<Builder<Shape>> consumer1 = builder -> builder.register("rectangle", Rectangle::new);
        Consumer<Builder<Shape>> consumer2 = builder -> builder.register("triangle", Triangle::new);

        /**
         * Remember this trick to chain consumers as this is really helpful.
         *
         * So, this consumer is first going to register rectangle and then a triangle in the the registry
         */
        Consumer<Builder<Shape>> consumer = consumer1.andThen(consumer2);
        Registry registry = Registry.createRegistry(consumer);

        Factory<Rectangle> factory = (Factory<Rectangle>) registry.buildShapeFactory("rectangle");
        Rectangle rectangle = factory.newInstance();
        System.out.println("Rectangle: " + rectangle);

        Factory<Triangle> factory2 = (Factory<Triangle>) registry.buildShapeFactory("triangle");
        Triangle triangle = factory2.newInstance();
        System.out.println("Triangle: " + triangle);

        // This registry will even have the error handling given to the client of the API
        Consumer<Builder<Shape>> initialisingConsumer = consumer1.andThen(consumer2);
        Registry registry2 = Registry.createRegistry(initialisingConsumer, s -> {throw new IllegalArgumentException("Unknown Shape: " + s);});


        /**
         * One more thing is that all the method references, maps, 
         * registry will not be able to exposed even using reflection since the registry is a local variable
         * and it is built when the registry is created and cannot be modified afterwards.
         * 
         * Also, the code is quite performant and all the details of the implementation 
         * is quite hidden inside the implementation
         * 
         * This makes the patterns quite robust and secure.
         */

    }

}