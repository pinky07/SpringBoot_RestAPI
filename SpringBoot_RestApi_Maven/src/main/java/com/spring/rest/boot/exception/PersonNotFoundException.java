package com.spring.rest.boot.exception;

public class PersonNotFoundException extends RuntimeException{

    public PersonNotFoundException(String personId) {
        super(personId);
    }
}
