package com.mx.development.said.olano.example.service;

import com.mx.development.said.olano.example.model.Book;
import com.mx.development.said.olano.example.service.exception.BookNotFoundException;
import com.mx.development.said.olano.example.service.exception.DuplicateIsbnException;

import java.util.List;
import java.util.Optional;

/**
 * Service interface for managing Book entities.
 *
 * This interface provides methods to create, retrieve, update, and delete books,
 * as well as search for books by specific criteria, such as ISBN, author name,
 * or a combination of title and author. It abstracts the underlying implementation
 * for book management.
 *
 * @author josesaidolanogarcia
 */
public interface BookService {

    Optional<Book> getByIsbn(String isbn);

    List<Book> getAll();

    List<Book> findByAuthor(String authorName);

    List<Book> findByTitleAndAuthor(String title, String author);

    Book create(Book book) throws DuplicateIsbnException;

    void deleteById(String id);

    Book update(String id, Book book) throws BookNotFoundException;
}
