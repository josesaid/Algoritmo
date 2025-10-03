package com.mx.development.said.olano.example.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

/**
 * Represents a Book entity to be indexed and queried in an Elasticsearch index named "books".
 * This class holds metadata about a book including its identifier, title, publication year,
 * author name, and ISBN.
 *
 * The class is annotated to support Elasticsearch operations, and it includes
 * accessor and mutator methods for manipulating the book's attributes.
 *
 * @author josesaidolanogarcia
 */
@Document(indexName = "books")
@Data
public class Book {
    @Id
    private String id;
    private String title;
    private int publicationYear;
    private String authorName;
    private String isbn;
}
