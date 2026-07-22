package org.unit.testing.junit.service;

import org.unit.testing.junit.dto.Payment;
import org.unit.testing.junit.repository.PaymentRepository;

public class PaymentService {

    private final PaymentRepository repository;

    public PaymentService(PaymentRepository repository) {
        this.repository = repository;
    }

    public Payment getPayment(Long id) {
        return repository.findById(id);
    }
}
