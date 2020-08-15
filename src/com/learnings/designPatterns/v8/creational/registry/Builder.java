package com.learnings.designPatterns.v8.creational.registry;

import com.learnings.designPatterns.v8.creational.factory.Factory;

// The job of this builder is to record the factory in some kind of map using the register method
public interface Builder<T> {
    
    // This method will all the factory(supplier) to some registry 
    // so that the factory can be used later to instantiate objects
    void register(String label, Factory<T> factory);

}