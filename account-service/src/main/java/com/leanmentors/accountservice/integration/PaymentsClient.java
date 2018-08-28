package com.leanmentors.accountservice.integration;

import com.leanmentors.accountservice.domain.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("payments")
@Profile("prod")
public interface PaymentsClient {
    @GetMapping("/payment")
    Payment retrievePayment();
}
