package org.unit.testing.junit.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.unit.testing.junit.dto.Payment;
import org.unit.testing.junit.repository.PaymentRepository;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class PaymentServiceTest {

    @Mock
    private PaymentRepository paymentRepository;
    @InjectMocks
    private PaymentService paymentService;

    @Test
    void getPaymentById() {

        when(paymentRepository.findById(1L))
                .thenThrow(new RuntimeException("Database unavailable"));

        RuntimeException exception = assertThrows(RuntimeException.class, ()-> paymentService.getPayment(1L));

        assertEquals("Database unavailable", exception.getMessage());
    }
}
