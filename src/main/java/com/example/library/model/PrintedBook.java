package com.example.library.model;

import jakarta.persistence.Entity;

@Entity
public class PrintedBook extends Book {

    private int pages;

    public PrintedBook() {}

    public PrintedBook(String title, String author, int year, int pages) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.pages = pages;
    }

    public int getPages() {
        return pages;
    }
}
