package com.mx.josesaid.cassandra.java.client.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.UUID;

/**
 * @author josesaidolanogarcia
 */
@Data
@AllArgsConstructor
public class Book {
    private UUID id;
    private String title;
    private String author;
    private String subject;
    private String publisher;
}
