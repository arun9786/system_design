package org.example.proxy.without;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {

    @Autowired
    PaymentService service;

    @PostMapping("/transfer")
    public void transfer(@RequestParam("amount") double amount) {

        service.transfer(amount);
    }
}
