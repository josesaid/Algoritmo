package com.mx.development.said.olano.example.service.exception;

/**
 * Exception class to be used when a duplicate ISBN is encountered.
 *
 * This exception is typically thrown in cases where an attempt to add
 * or register a book with an ISBN conflicts with an existing one in the system.
 *
 * @author josesaidolanogarcia
 */
public class DuplicateIsbnException extends Exception {

    public DuplicateIsbnException(String message) {
        super(message);
    }
}
