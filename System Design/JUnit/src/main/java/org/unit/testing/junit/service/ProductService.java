package org.unit.testing.junit.service;

import org.springframework.stereotype.Service;
import org.unit.testing.junit.dto.Product;
import org.unit.testing.junit.repository.ProductRepository;

@Service
public class ProductService {

    private ProductRepository repository;

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    public Product getProduct(Long id) {
        return repository.findById(id);
    }

}
