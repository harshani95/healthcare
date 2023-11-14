package com.devstack.healthcare.exceptions;

public class EntryNotFoundException  extends RuntimeException {
    public EntryNotFoundException(String message) {
        super(message);
    }
}
