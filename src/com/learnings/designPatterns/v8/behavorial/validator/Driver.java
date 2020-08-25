package com.learnings.designPatterns.v8.behavorial.validator;

import com.learnings.designPatterns.v8.model.Person;

public class Driver {
    
    public static void main(String[] args) {
        
        Person p1 = new Person("p1", 1000);
        Person p2 = new Person("null", 100);
        Person p3 = new Person(null, -10);

        p1 = Validator.validate(p -> p.getName() != null, "The name should not be null")
            .on(p1)
            .validate();

        p2 = Validator.validate(p -> p.getName() != null, "The name should not be null")
                .thenValidate(p -> p.getAge() > 0, "The age should be greater than 0")
                .thenValidate(p -> p.getAge() < 150, "The age should be less than 150")
                .on(p2)
                .validate();

        p3 = Validator.validate(p -> p.getName() != null, "The name should not be null")
                .thenValidate(p -> p.getAge() > 0, "The age should be greater than 0")
                .thenValidate(p -> p.getAge() < 150, "The age should be less than 150")
                .on(p3)
                .validate();
    }

}