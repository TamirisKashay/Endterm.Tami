package controller;

import model.Author;
import model.BookBase;
import model.PrintedBook;
import model.EBook;
import repository.AuthorRepository;
import service.LibraryService;

public class Main {
    public static void main(String[] args) {
        LibraryService libraryService = new LibraryService();
        AuthorRepository authorRepo = new AuthorRepository();

        System.out.println("=== Library Management System Initializing ===");

        try {
            Author author1 = new Author("George Orwell", "British");
            Author author2 = new Author("Dan Brown", "American");

            System.out.println("\n[Step 1] Saving Authors...");
            authorRepo.create(author1);
            authorRepo.create(author2);

            BookBase book1 = new PrintedBook(0, "1984", 0.85); // Печатная книга
            BookBase book2 = new EBook(0, "Digital Fortress", "EPUB"); // Электронная книга

            System.out.println("\n[Step 2] Adding Books via Service Layer...");
            libraryService.addBook(book1);
            libraryService.addBook(book2);

            System.out.println("\n[Step 3] Processing Books Polymorphically:");
            processBookDetails(book1);
            processBookDetails(book2);

            System.out.println("\n=== All operations completed successfully! ===");

        } catch (Exception e) {
            System.err.println("\nCritical Error: " + e.getMessage());
        }
    }

    public static void processBookDetails(BookBase book) {
        System.out.println("------------------------------------");
        book.printBaseStatus();
        book.displayInfo();
        System.out.println("Type: " + book.getBookType());
        System.out.println("Calculated Late Fee (7 days): $" + book.calculateLateFee(7));
    }
}