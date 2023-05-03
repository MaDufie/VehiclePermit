package io.turntabl.exceptions;

public class UserNotPermittedException extends Exception {
    public UserNotPermittedException(String message) {
        super(message);
    }
}
