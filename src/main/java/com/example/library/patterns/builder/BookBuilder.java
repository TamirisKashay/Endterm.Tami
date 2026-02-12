package com.example.library.patterns.builder;

import com.example.library.model.PrintedBook;

public class BookBuilder {

    private String title;
    private String author;
    private int year;
    private int pages;

    public BookBuilder title(String title) {
        this.title = title;
        return this;
    }

    public BookBuilder author(String author) {
        this.author = author;
        return this;
    }

    public BookBuilder year(int year) {
        this.year = year;
        return this;
    }

    public BookBuilder pages(int pages) {
        this.pages = pages;
        return this;
    }

    public PrintedBook build() {
        return new PrintedBook(title, author, year, pages);
    }
}
