package service;

import model.BookBase;
import repository.BookRepository;
import exception.DatabaseOperationException;

public class LibraryService {
    private final BookRepository bookRepository = new BookRepository();

    public void addBook(BookBase book) {

        if (book.getTitle() == null || book.getTitle().trim().isEmpty()) {
            throw new IllegalArgumentException("Book title cannot be empty!");
        }

        if (!book.validate()) {
            throw new IllegalArgumentException("Invalid book data!");
        }

        System.out.println("Service: Validating and adding book...");
        bookRepository.create(book);
    }

    public void removeBook(int id) {
        if (id <= 0) {
            throw new IllegalArgumentException("ID must be positive!");
        }
        bookRepository.delete(id);
    }
}