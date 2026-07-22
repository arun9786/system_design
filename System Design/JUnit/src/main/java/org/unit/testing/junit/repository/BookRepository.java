package org.unit.testing.junit.repository;

import org.unit.testing.junit.dto.Book;

public interface BookRepository {

    Book findById(Long id);

}
