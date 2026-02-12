package com.example.library.patterns.factory;

import com.example.library.model.*;

public class BookFactory {

    public static Book createBook(
            String type,
            String title,
            String author,
            int year,
            String format,
            Integer pages
    ) {
        if ("ebook".equalsIgnoreCase(type)) {
            return new EBook(title, author, year, format);
        }
        if ("printed".equalsIgnoreCase(type)) {
            return new PrintedBook(title, author, year, pages);
        }
        throw new IllegalArgumentException("Unknown book type");
    }
}
