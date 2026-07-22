package org.unit.testing.junit.repository;

import org.springframework.stereotype.Repository;
import org.unit.testing.junit.dto.Customer;

@Repository
public interface CustomerRepository {
    Customer findByMobile(String mobile);
}
