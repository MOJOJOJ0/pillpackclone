package com.pillpackclone.familymanager.exception;

public class UserNotFoundException extends RuntimeException{ // !
    public UserNotFoundException(String message) {
        super(message);
    }
}
