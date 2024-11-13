package com.onboarding.domain.services;

import com.onboarding.domain.models.Customer;
import org.springframework.stereotype.Component;

@Component
public class CustomerRestClient {
    public Customer getCustomer(Long customerId){
        return Customer.builder().customerId(customerId)
                .firstName("Peter")
                .lastName("Parker")
                .isSnsUser(true)
                .build();
    }
}
