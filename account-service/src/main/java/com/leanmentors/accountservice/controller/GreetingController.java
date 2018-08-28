package com.leanmentors.accountservice.controller;

import com.leanmentors.accountservice.integration.PaymentsClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {


    @Autowired
    PaymentsClient client;


    @GetMapping("/greet")
    public String greet(){
        return "Hello "+client.retrievePayment().getId();
    }

}
