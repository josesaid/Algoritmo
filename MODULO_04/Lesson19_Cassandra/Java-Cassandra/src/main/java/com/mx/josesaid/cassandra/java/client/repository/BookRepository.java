package com.mx.josesaid.cassandra.java.client.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.mx.josesaid.cassandra.java.client.domain.Book;
import com.datastax.driver.core.ResultSet;
import com.datastax.driver.core.Row;
import com.datastax.driver.core.Session;

/**
 * @author josesaidolanogarcia
 */
public class BookRepository {

    private static final String TABLE_NAME = "books";
    private static final String TABLE_NAME_BY_TITLE = TABLE_NAME + "ByTitle";

    private final Session session;

    public BookRepository(Session session) {
        this.session = session;
    }

    /**
     * Creates the books table.
     */
    public void createTable() {

        final String query = "CREATE TABLE IF NOT EXISTS " + TABLE_NAME + "(" + "id uuid PRIMARY KEY, " + "title text," + "author text," + "subject text);";
        session.execute(query);
    }

    /**
     * Creates the books table.
     */
    public void createTableBooksByTitle() {
        StringBuilder sb = new StringBuilder("CREATE TABLE IF NOT EXISTS ").append(TABLE_NAME_BY_TITLE).append("(").append("id uuid, ").append("title text,").append("PRIMARY KEY (title, id));");

        final String query = sb.toString();
        session.execute(query);
    }

    /**
     * Alters the table books and adds an extra column.
     */
    public void alterTablebooks(String columnName, String columnType) {
        StringBuilder sb = new StringBuilder("ALTER TABLE ").append(TABLE_NAME).append(" ADD ").append(columnName).append(" ").append(columnType).append(";");

        final String query = sb.toString();
        session.execute(query);
    }

    /**
     * Insert a row in the table books. 
     * 
     * @param book
     */
    public void insertbook(Book book) {
        StringBuilder sb = new StringBuilder("INSERT INTO ")
                .append(TABLE_NAME)
                .append("(id, title, author, subject) ")
                .append("VALUES (")
                .append(book.getId() )
                .append(", '")
                .append(book.getTitle())
                .append("', '")
                .append(book.getAuthor())
                .append("', '")
                .append(book.getSubject())
                .append("');");

        final String query = sb.toString();
        session.execute(query);
    }

    /**
     * Insert a row in the table booksByTitle.
     * @param book
     */
    public void insertbookByTitle(Book book) {
        StringBuilder sb = new StringBuilder("INSERT INTO ").append(TABLE_NAME_BY_TITLE).append("(id, title) ").append("VALUES (").append(book.getId()).append(", '").append(book.getTitle()).append("');");

        final String query = sb.toString();
        session.execute(query);
    }

    /**
     * Insert a book into two identical tables using a batch query.
     * 
     * @param book
     */
    public void insertBookBatch(Book book) {
        StringBuilder sb = new StringBuilder("BEGIN BATCH ").append("INSERT INTO ").append(TABLE_NAME).append("(id, title, author, subject) ").append("VALUES (").append(book.getId()).append(", '").append(book.getTitle()).append("', '").append(book.getAuthor())
                .append("', '").append(book.getSubject()).append("');").append("INSERT INTO ").append(TABLE_NAME_BY_TITLE).append("(id, title) ").append("VALUES (").append(book.getId()).append(", '").append(book.getTitle()).append("');")
                .append("APPLY BATCH;");

        final String query = sb.toString();
        session.execute(query);
    }

    /**
     * Select book by id.
     * 
     * @return
     */
    public Book selectByTitle(String title) {
        StringBuilder sb = new StringBuilder("SELECT * FROM ").append(TABLE_NAME_BY_TITLE).append(" WHERE title = '").append(title).append("';");

        String query = sb.toString();

        ResultSet rs = session.execute(query);

        List<Book> books = new ArrayList<Book>();

        for (Row r : rs) {
            UUID id = r.getUUID("id");
            //String title = r.getString("title");
            String author = r.getString("author");
            String subject = r.getString("subject");
            String publisher = r.getString("publisher");
            Book book = new Book(id, title, author, subject, publisher);
            books.add(book);
        }

        return books.get(0);
    }

    /**
     * Select all books from books
     * 
     * @return
     */
    public List<Book> selectAll() {
        StringBuilder sb = new StringBuilder("SELECT * FROM ").append(TABLE_NAME);

        final String query = sb.toString();
        ResultSet rs = session.execute(query);

        List<Book> books = new ArrayList<Book>();

        for (Row r : rs) {
            UUID id = r.getUUID("id");
            String title = r.getString("title");
            String author = r.getString("author");
            String subject = r.getString("subject");
            String publisher = r.getString("publisher");
            Book book = new Book(id, title, author, subject, publisher);
            books.add(book);
        }
        return books;
    }

    /**
     * Select all books from booksByTitle
     * @return
     */
    public List<Book> selectAllBookByTitle() {
        StringBuilder sb = new StringBuilder("SELECT * FROM ").append(TABLE_NAME_BY_TITLE);

        final String query = sb.toString();
        ResultSet rs = session.execute(query);

        List<Book> books = new ArrayList<Book>();

        for (Row r : rs) {
            UUID id = r.getUUID("id");
            String title = r.getString("title");
            String author = r.getString("author");
            String subject = r.getString("subject");
            String publisher = r.getString("publisher");
            Book book = new Book(id, title, author, subject, publisher);
            books.add(book);
        }
        return books;
    }

    /**
     * Delete a book by title.
     */
    public void deletebookByTitle(String title) {
        StringBuilder sb = new StringBuilder("DELETE FROM ").append(TABLE_NAME_BY_TITLE).append(" WHERE title = '").append(title).append("';");

        final String query = sb.toString();
        session.execute(query);
    }

    /**
     * Delete table.
     * 
     * @param tableName the name of the table to delete.
     */
    public void deleteTable(String tableName) {
        StringBuilder sb = new StringBuilder("DROP TABLE IF EXISTS ").append(tableName);

        final String query = sb.toString();
        session.execute(query);
    }
}
