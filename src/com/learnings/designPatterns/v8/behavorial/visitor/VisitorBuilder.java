package com.learnings.designPatterns.v8.behavorial.visitor;

import java.util.function.Function;

/**
 *  This builder is used to build the visitor
 * 
 */
public interface VisitorBuilder<R> {
    
    // The type tp be visited and the function which would need to be applied on the visited class
    // The <T> is put on at the method level because then we can chanin different types of consumers
    <T> void register(Class<T> type, Function<T, R> function);

}