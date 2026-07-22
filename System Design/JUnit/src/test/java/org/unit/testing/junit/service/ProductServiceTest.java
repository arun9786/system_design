package org.unit.testing.junit.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.unit.testing.junit.dto.Product;
import org.unit.testing.junit.repository.ProductRepository;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ProductServiceTest {

    @Mock
    private ProductRepository productRepository;

    @InjectMocks
    private ProductService productService;

    @Test
    public void testFindById() {
        Product product = new Product(1L, "Apple", "Nice Design");

        when(productRepository.findById(1L))
                .thenReturn(product);

        Product actual = productService.getProduct(1L);

        assertEquals(product.getName(), actual.getName());
    }

}
