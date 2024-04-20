package com.booking.hbapp.exception;

public class InternalServerException extends RuntimeException {
    public InternalServerException(String mess) {
        super(mess);
    }
}
