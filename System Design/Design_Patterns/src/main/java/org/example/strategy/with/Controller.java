package org.example.strategy.with;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment")
public class Controller {

    PaymentService paymentService;

    public Controller(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping("/payOrg")
    public ResponseEntity<String> pay(@RequestBody PaymentDTO paymentDTO) {
        paymentService.processPayment(paymentDTO.getPaymentType(),  paymentDTO.getAmount());

        return ResponseEntity.ok().body("payment successful");
    }
}
