package org.unit.testing.junit.repository;

import org.unit.testing.junit.dto.Payment;

public interface PaymentRepository {
    Payment findById(Long id);
}
