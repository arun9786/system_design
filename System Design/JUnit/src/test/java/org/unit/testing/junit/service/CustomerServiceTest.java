package org.unit.testing.junit.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.unit.testing.junit.dto.Customer;
import org.unit.testing.junit.repository.CustomerRepository;

import java.util.Optional;

import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class CustomerServiceTest {

    @Mock
    private CustomerRepository customerRepository;

    @InjectMocks
    private CustomerService customerService;

    @Test
    void validateFindByMobile() {

        Customer customer = new Customer(1L, "Arun", "Apple");

        when(customerRepository.findByMobile("Apple"))
                .thenReturn(customer);

        Customer actual = customerService.getCustomer("Apple");

        assertEquals(customer, actual);

    }
}
