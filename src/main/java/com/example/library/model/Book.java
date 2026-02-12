package com.example.library.model;

import jakarta.persistence.*;

@MappedSuperclass
public abstract class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;

    public String title;
    public String author;
    public int year;

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }
}
