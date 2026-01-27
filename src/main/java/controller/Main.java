package controller;

import model.BookBase;
import model.PrintedBook;
import model.EBook;
import service.LibraryService;

public class Main {
    public static void main(String[] args) {
        LibraryService service = new LibraryService();

        System.out.println("--- Library System Starting ---");

        try {

            BookBase book1 = new PrintedBook(0, "1984", 0.5);
            BookBase book2 = new EBook(0, "Digital Fortress", "PDF");

            System.out.println("\nAdding books...");
            service.addBook(book1);
            service.addBook(book2);

            processBook(book1);
            processBook(book2);

            System.out.println("\n--- Operation Successful ---");

        } catch (Exception e) {
            System.err.println("Error occurred: " + e.getMessage());
        }
    }

    public static void processBook(BookBase book) {
        book.printBaseStatus();
        book.displayInfo();
        System.out.println("Late fee for 5 days: $" + book.calculateLateFee(5));
    }
}