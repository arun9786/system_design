package org.example.proxy.with;

import org.example.proxy.without.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {

    @Autowired
    PaymentServiceProxy serviceProxy;

    @PostMapping("/transfer")
    public void transfer(@RequestParam("amount") double amount) {

        serviceProxy.transfer(amount);
    }
}
