package com.leanmentors.paymentsservice.controller;

import domain.Payment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentsController {

    @GetMapping("/payment")
    public Payment retrievePayment(){

        return new Payment("Big Payment");
    }
}
