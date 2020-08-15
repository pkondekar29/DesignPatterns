package com.learnings.designPatterns.v8.creational.factory;

import com.learnings.designPatterns.v8.model.Circle;
import com.learnings.designPatterns.v8.model.Color;

public class Driver {

    public static void main(String[] args) {
        // So, the supplier method can be used as a factory
        Factory<Circle> circleFactory = () -> new Circle();

        // So, we extended the supplier interface to build a factory out of it be having a new default method newInstance
        Circle circle = circleFactory.newInstance();

        System.out.println("Circle => " + circle);

        Factory<Circle> coloredCircleFactory = Factory.createFactory(c -> new Circle(c), Color.RED);

        System.out.println(coloredCircleFactory.create5());

        // Here we use method reference instead of lambda and it can be very clean to write
        Factory<Circle> factory1 = Factory.createFactory(Circle::new, Color.RED);
        Factory<Circle> factory2 = Factory.createFactory(Circle::new);
    }

}