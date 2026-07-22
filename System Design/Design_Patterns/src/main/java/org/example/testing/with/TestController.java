package org.example.testing.with;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
public class TestController {

    PaymentServiceTesting paymentServiceTesting;
    @Autowired
    public TestController(PaymentServiceTesting paymentServiceTesting) {
        this.paymentServiceTesting = paymentServiceTesting;
    }

    @PostMapping("/pay")
    public ResponseEntity<String> pay(@RequestBody PaymentDTOTesting paymentDTOTesting) {
        return ResponseEntity.ok().body(paymentServiceTesting.processPayment(paymentDTOTesting));
    }

}
