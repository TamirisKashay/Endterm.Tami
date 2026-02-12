package com.example.library.service;

import com.example.library.dto.BookRequestDTO;
import com.example.library.exception.BookNotFoundException;
import com.example.library.model.Book;
import com.example.library.patterns.factory.BookFactory;
import com.example.library.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    private final BookRepository repository;

    public BookService(BookRepository repository) {
        this.repository = repository;
    }

    public List<Book> findAll() {
        return repository.findAll();
    }

    public Book findById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new BookNotFoundException(id));
    }

    public Book create(BookRequestDTO dto) {
        Book book = BookFactory.createBook(
                dto.type,
                dto.title,
                dto.author,
                dto.year,
                dto.format,
                dto.pages
        );
        return repository.save(book);
    }

    public Book update(Long id, BookRequestDTO dto) {
        Book existing = findById(id);
        existing.title = dto.title;
        existing.author = dto.author;
        existing.year = dto.year;
        return repository.save(existing);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
