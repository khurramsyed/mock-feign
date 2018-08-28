package com.leanmentors.accountservice;

import com.leanmentors.accountservice.controller.GreetingController;
import com.leanmentors.accountservice.domain.Payment;
import com.leanmentors.accountservice.integration.PaymentsClient;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

@SpringBootTest
@RunWith(SpringRunner.class)
public class MockFeignTest {

    @MockBean
    PaymentsClient pyamentClient;
    @Autowired
    GreetingController controller;

    @Before
    public void setUp(){
        Payment payment =new Payment();
        payment.setId("Test Payment");
        when(pyamentClient.retrievePayment()).thenReturn(payment);

    }

    @Test
    public void testIt(){
        String resposne = controller.greet();
        verify(pyamentClient, times(1)).retrievePayment();
        assertEquals("Hello Test Payment",resposne);

    }
}

