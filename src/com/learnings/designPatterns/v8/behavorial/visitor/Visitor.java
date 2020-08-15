package com.learnings.designPatterns.v8.behavorial.visitor;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;

public interface Visitor<R> {
    
    R visit(Object o);

	static <R> Visitor<R> of(Consumer<VisitorBuilder<R>> consumer) {
        // This is the registry of different visitors which needs to be visited.
        Map<Class<?>, Function<Object, R>> registry = new HashMap<>();
        // We need to implement this in the old fashion since the method regsiter is a generic one.... with the type T at the method level.
        // And lambda doesn't provide a way to implement such methods even if it is functional interface
        VisitorBuilder<R> visitorBuilder = new VisitorBuilder<R>() {

            @Override
            public <T> void register(Class<T> type, Function<T, R> function) {
                // We need to compose the function over here since we take in Object and we want R type
                registry.put(type, function.compose(type::cast));
            }
        };
        // Here the visitor builder is going to build the registry based on the consumer which was passed
        consumer.accept(visitorBuilder);

        // Finally we return a Visitor back from our registry
        // Also what should be the implementation of that method is given by the Function which is passed on t visitor builder
        return o -> registry.get(o.getClass()).apply(o);
	}

    // We need a new interface since to visit the method.. we need to define an execute method method on 
    // some object which would be called
	static <T, R> X<T, R> forType(Class<T> clazz) {
		return () -> clazz;
	}

    interface X<T, R> {

        // The input is the actual function which would be applied on the visited object
        // The Y interface is needed since we want to chain the functions ot make it dynamic in nature
        //  by having a andThen method on that object
        default Y<R> execute(Function<T, R> function) {
            return visitorBuilder -> visitorBuilder.register(type(), function);
        }

        // This is the lambda of this interface
        Class<T> type();

    }

    interface Y<R> extends Consumer<VisitorBuilder<R>> {

        // The T type is at the method level because then we would not be able to chain the consumer, i.e, VisitorBuilder
        default <T> Z<T, R> forType(Class<T> type) {
            // This is a workaround to keep the Z interface a functional interface and 
            // this interface should only be used when we only have 2 types of objects
            return index -> index == 0 ? this : type;
        }

        // Chaining of consumers
        default Y<R> andThen(Y<R> after) {
            return t -> {
                this.accept(t);
                after.accept(t);;
            };
        }
    }

    interface Z<T, R> {

        Object get(int index);

        default Class<T> type() {
            return (Class<T>) get(1);
        }

        default Y<R> previousConsumer() {
            return (Y<R>) get(0);
        }

        // This execute would be called on the chained vistor
        default Y<R> execute(Function<T, R> function) {
            return previousConsumer().andThen(
                    visitorBuilder -> visitorBuilder.register(type(), function));
        }
    }
}