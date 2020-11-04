package com.thoughtworks.capacity.gtb.mvc.controller.exception;

public class UserDoesNotFoundException extends RuntimeException {

    public UserDoesNotFoundException(String message) {
        super(message);
    }
}
