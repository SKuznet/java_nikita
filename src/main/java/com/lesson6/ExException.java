package com.lesson6;

public class ExException extends RuntimeException {
    public ExException(String message) {
        super(message);
    }

    public ExException() {
    }

    @Override
    public String getMessage() {
        return "it's my own exception " + super.getMessage();
    }
}
