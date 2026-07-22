package org.unit.testing.junit.service;

import org.unit.testing.junit.dto.Book;
import org.unit.testing.junit.repository.BookRepository;

public class BookService {

    private final BookRepository repository;

    public BookService(BookRepository repository) {
        this.repository = repository;
    }

    public Book getBook(Long id) {
        return repository.findById(id);
    }
}