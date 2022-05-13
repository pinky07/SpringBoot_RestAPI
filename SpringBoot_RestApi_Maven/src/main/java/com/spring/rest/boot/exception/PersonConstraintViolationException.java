package com.spring.rest.boot.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@Slf4j
//@ResponseStatus(HttpStatus.BAD_REQUEST)
public class PersonConstraintViolationException extends RuntimeException {
    public PersonConstraintViolationException(String message) {
        super(message);
    }
}
