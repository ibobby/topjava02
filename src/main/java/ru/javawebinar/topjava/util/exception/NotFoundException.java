package ru.javawebinar.topjava.util.exception;

/**
 * Created by bobby on 12.03.2015.
 */
public class NotFoundException extends RuntimeException {
    public NotFoundException(String message) {
        super(message);
    }
}
