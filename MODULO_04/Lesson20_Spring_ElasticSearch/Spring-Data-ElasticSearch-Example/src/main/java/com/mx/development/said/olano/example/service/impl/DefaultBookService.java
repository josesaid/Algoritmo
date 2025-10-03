package com.mx.development.said.olano.example.service.impl;

import static co.elastic.clients.elasticsearch._types.query_dsl.QueryBuilders.match;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.data.elasticsearch.client.elc.ElasticsearchTemplate;
import org.springframework.data.elasticsearch.client.elc.NativeQuery;
import org.springframework.data.elasticsearch.core.SearchHit;
import org.springframework.stereotype.Service;

import com.mx.development.said.olano.example.model.Book;
import com.mx.development.said.olano.example.repository.BookRepository;
import com.mx.development.said.olano.example.service.BookService;
import com.mx.development.said.olano.example.service.exception.BookNotFoundException;
import com.mx.development.said.olano.example.service.exception.DuplicateIsbnException;

import co.elastic.clients.elasticsearch._types.query_dsl.QueryBuilders;

/**
 * A service implementation for managing Book entities. This service provides methods
 * to perform CRUD operations on Book objects, as well as specialized operations
 * for searching by ISBN, author name, and a combination of title and author.
 *
 * This service interacts with two main components:
 * - {@link BookRepository}: Provides data access and persistence operations for Book entities.
 * - {@link ElasticsearchTemplate}: Assists in executing Elasticsearch-specific queries.
 *
 * Methods:
 * - Retrieve a book by its ISBN.
 * - Retrieve all books.
 * - Find books by the author's name.
 * - Find books by a combination of title and author.
 * - Create a new book, ensuring no duplicate ISBNs exist.
 * - Update an existing book by its unique identifier.
 * - Delete a book by its unique identifier.
 *
 * Exceptions:
 * - Throws {@link DuplicateIsbnException} when attempting to create
 *   a book with an already existing ISBN.
 * - Throws {@link BookNotFoundException} when an update or delete operation
 *   references a non-existent book.
 *
 * @author josesaidolanogarcia
 */
@Service
public class DefaultBookService implements BookService {

    private final BookRepository bookRepository;

    private final ElasticsearchTemplate elasticsearchTemplate;

    public DefaultBookService(BookRepository bookRepository, ElasticsearchTemplate elasticsearchTemplate) {
        this.bookRepository = bookRepository;
        this.elasticsearchTemplate = elasticsearchTemplate;
    }

    @Override
    public Optional<Book> getByIsbn(String isbn) {
        return bookRepository.findByIsbn(isbn);
    }

    @Override
    public List<Book> getAll() {
        List<Book> books = new ArrayList<>();
        bookRepository.findAll()
            .forEach(books::add);
        return books;
    }

    @Override
    public List<Book> findByAuthor(String authorName) {
        return bookRepository.findByAuthorName(authorName);
    }

    @Override
    public List<Book> findByTitleAndAuthor(String title, String author) {
        var criteria = QueryBuilders.bool(builder -> builder.must(
            match(queryAuthor -> queryAuthor.field("authorName").query(author)),
            match(queryTitle -> queryTitle.field("title").query(title))
        ));

        return elasticsearchTemplate.search(NativeQuery.builder().withQuery(criteria).build(), Book.class)
            .stream().map(SearchHit::getContent).toList();
    }

    @Override
    public Book create(Book book) throws DuplicateIsbnException {
        if (getByIsbn(book.getIsbn()).isEmpty()) {
            return bookRepository.save(book);
        }
        throw new DuplicateIsbnException(String.format("The provided ISBN: %s already exists. Use update instead!", book.getIsbn()));
    }

    @Override
    public void deleteById(String id) {
        bookRepository.deleteById(id);
    }

    @Override
    public Book update(String id, Book book) throws BookNotFoundException {
        Book oldBook = bookRepository.findById(id)
            .orElseThrow(() -> new BookNotFoundException("There is not book associated with the given id"));
        oldBook.setIsbn(book.getIsbn());
        oldBook.setAuthorName(book.getAuthorName());
        oldBook.setPublicationYear(book.getPublicationYear());
        oldBook.setTitle(book.getTitle());
        return bookRepository.save(oldBook);
    }
}
