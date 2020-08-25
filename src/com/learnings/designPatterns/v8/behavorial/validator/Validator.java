package com.learnings.designPatterns.v8.behavorial.validator;

import java.util.function.Predicate;
import java.util.function.Supplier;

import com.learnings.designPatterns.v8.model.Person;

public interface Validator {

    default Validator thenValidate(Predicate<Person> predicate, String errorMessage) {
        return p -> {
            try {
                // This is done to chain the validation exceptions
				on(p).validate();
                if(predicate.test(p)) {
                    return () -> p;
                } else {
                    return () -> {
                        ValidationException exception = new ValidationException("The object is not valid");
                        exception.addSuppressed(new IllegalAccessException(errorMessage));
                        throw exception;
                    }; 
                }
            } catch(ValidationException e) {
                if(predicate.test(p)) {
                    return () -> {throw e;};
                } else {
                    e.addSuppressed(new IllegalAccessException(errorMessage));
                    return () -> {throw e;};
                }
            }
        };
    }

    static Validator validate(Predicate<Person> predicate, String errorMessage) {
        return p -> {
            if(predicate.test(p))
                return () -> p;
            else    
                return () -> {
                    throw new ValidationException(errorMessage);
                };
        };
    }

    ValidatorSupplier on(Person p);

    interface ValidatorSupplier extends Supplier<Person> {
        default Person validate() {
            return get();
        }
    }

    static class ValidationException extends RuntimeException {
        ValidationException(String errorMessage) {
            super(errorMessage);
        }
    }
    
}