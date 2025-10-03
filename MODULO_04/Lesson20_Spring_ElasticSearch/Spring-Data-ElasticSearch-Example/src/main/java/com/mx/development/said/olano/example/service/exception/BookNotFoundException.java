package com.mx.development.said.olano.example.service.exception;

/**
 * Exception class to be used when a book is not found.
 *
 * This exception is typically thrown in cases where an operation
 * (such as retrieving, updating, or deleting a book) is attempted
 * and the specific book cannot be located in the system.
 *
 * @author josesaidolanogarcia
 */
public class BookNotFoundException extends Exception {

    public BookNotFoundException(String message) {
        super(message);
    }
}
