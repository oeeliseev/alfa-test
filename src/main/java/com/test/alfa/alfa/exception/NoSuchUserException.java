package com.test.alfa.alfa.exception;

public class NoSuchUserException extends RuntimeException {
    public NoSuchUserException(Integer id) {
        super(String.format("no user with id '%d'", id));
    }
}
