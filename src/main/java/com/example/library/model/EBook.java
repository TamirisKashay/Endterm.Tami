package com.example.library.model;

import jakarta.persistence.Entity;

@Entity
public class EBook extends Book {

    private String format;

    public EBook() {}

    public EBook(String title, String author, int year, String format) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.format = format;
    }

    public String getFormat() {
        return format;
    }
}
