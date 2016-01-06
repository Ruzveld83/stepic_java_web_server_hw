package org.stepic.exception;

public class NoSuchLoginException extends Exception {

    public NoSuchLoginException() {
    }

    public NoSuchLoginException(String message) {
        super(message);
    }

    public NoSuchLoginException(String message, Throwable cause) {
        super(message, cause);
    }

    public NoSuchLoginException(Throwable cause) {
        super(cause);
    }
}
