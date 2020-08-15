package com.learnings.designPatterns.v8.behavorial.visitor;

import java.util.function.Consumer;

import com.learnings.designPatterns.v8.model.Rectangle;
import com.learnings.designPatterns.v8.model.Shape;
import com.learnings.designPatterns.v8.model.visitor.Body;
import com.learnings.designPatterns.v8.model.visitor.Car;
import com.learnings.designPatterns.v8.model.visitor.Engine;

public class Driver {
    
    public static void main(String[] args) {
        
        Engine engine = new Engine();
        Car car = new Car();
        Body body = new Body();
        
        // This consumer will consume the Visitor Builder object
        Consumer<VisitorBuilder<String>> consumer =
            Visitor.<Engine, String>forType(Engine.class).execute(e -> "Visited engine: " + e)
                .forType(Car.class).execute(c -> "Visited car: " + c)
                .forType(Body.class).execute(b -> "Visited Body: " + b)
                .forType(Shape.class).execute(r -> "Visited rectangle: " + r);

        // Here we pass the consumer of visitor builder to our visitor. 
        // This will allow the visitor to understnad what should be visited using the VisitorBuilder
        Visitor<String> visitor = Visitor.of(consumer);

        String str = visitor.visit(engine);
        System.out.println(str);
        str = visitor.visit(car);
        System.out.println(str);
        str = visitor.visit(body);
        System.out.println(str);
    }

}