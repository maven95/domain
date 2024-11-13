package com.onboarding.domain.controllers;

import com.onboarding.domain.models.Customer;
import com.onboarding.domain.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/customer")
public class CustomerController {

    @Autowired private CustomerService customerService;

    @GetMapping
    public ResponseEntity<Customer> getCustomer(Long customerId){
        return ResponseEntity.ok(customerService.retrieveCustomerAndSendMessage(customerId));
    }
}
