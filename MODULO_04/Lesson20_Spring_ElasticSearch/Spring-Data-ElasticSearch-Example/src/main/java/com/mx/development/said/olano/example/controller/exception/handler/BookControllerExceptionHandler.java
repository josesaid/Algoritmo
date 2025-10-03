package com.mx.development.said.olano.example.controller.exception.handler;

import com.mx.development.said.olano.example.service.exception.BookNotFoundException;
import com.mx.development.said.olano.example.service.exception.DuplicateIsbnException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


/**
 * The BookControllerExceptionHandler class is responsible for handling exceptions
 * related to book operations within the application. This class provides a centralized
 * mechanism for handling specific exceptions thrown by the application and producing
 * meaningful error messages in the HTTP response.
 *
 * @author josesaidolanogarcia
 */
@RestControllerAdvice
public class BookControllerExceptionHandler {

    @ExceptionHandler(value = {BookNotFoundException.class, DuplicateIsbnException.class})
    public ResponseEntity<Body> doHandleBookExceptions(Exception ex) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new Body(ex.getMessage()));
    }

    public static class Body {

        private String message;

        public Body(String message) {
            this.message = message;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }
    }
}