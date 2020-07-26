package com.learnings.designPatterns.v8.creational.factory;

import com.learnings.designPatterns.v8.model.Circle;

public class Driver {

    public static void main(String[] args) {
        // So, the supplier method can be used as a factory
        Factory<Circle> circleFactory = () -> new Circle();

        // So, we extended the supplier interface to build a factory out of it be having a new default method newInstance
        Circle circle = circleFactory.newInstance();

        System.out.println("Circle => " + circle);
    }

}