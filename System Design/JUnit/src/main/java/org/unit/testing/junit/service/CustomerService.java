package org.unit.testing.junit.service;

import org.unit.testing.junit.dto.Customer;
import org.unit.testing.junit.repository.CustomerRepository;

public class CustomerService {

    private final CustomerRepository repository;

    public CustomerService(CustomerRepository repository) {
        this.repository = repository;
    }

    public Customer getCustomer(String mobile) {
        return repository.findByMobile(mobile);
    }
}
