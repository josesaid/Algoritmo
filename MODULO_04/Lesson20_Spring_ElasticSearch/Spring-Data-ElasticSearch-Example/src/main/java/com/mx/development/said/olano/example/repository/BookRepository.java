package com.mx.development.said.olano.example.repository;

import com.mx.development.said.olano.example.model.Book;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * Provides a repository interface for managing and querying Book entities stored in Elasticsearch.
 * Extends the {@link ElasticsearchRepository} to support CRUD operations and custom finder methods.
 *
 * This repository enables searching for books by their author's name or ISBN and inherits
 * default methods for retrieving all books or managing individual book entities based on their ID.
 *
 * The repository interacts with Elasticsearch and maps Book entities to the underlying "books" index.
 *
 * Methods:
 * - findByAuthorName(String authorName): Retrieves a list of books authored by the given author name.
 * - findByIsbn(String isbn): Retrieves an Optional containing the book identified by the given ISBN.
 *
 * @author josesaidolanogarcia
 */
@Repository
public interface BookRepository extends ElasticsearchRepository<Book, String> {

    List<Book> findByAuthorName(String authorName);

    Optional<Book> findByIsbn(String isbn);
}