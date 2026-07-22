package org.unit.testing.junit.repository;

import org.springframework.stereotype.Repository;
import org.unit.testing.junit.dto.Product;

@Repository
public interface ProductRepository {

    Product findById(Long id);

}
