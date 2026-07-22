package org.unit.testing.junit.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.unit.testing.junit.dto.Book;
import org.unit.testing.junit.repository.BookRepository;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class BookServiceTest {

    @Mock
    private BookRepository bookRepository;

    @InjectMocks
    private BookService bookService;

    @Test
    public void testFindById() {
        Book expected = new Book(1L, "Clean Code");

        when(bookRepository.findById(1L)).thenReturn(expected);

        Book actual = bookService.getBook(1L);

        verify(bookRepository).findById(1L);

        assertEquals("Clean Code", actual.getTitle());
    }
}
