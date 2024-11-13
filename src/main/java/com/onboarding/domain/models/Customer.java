package com.onboarding.domain.models;

import lombok.Builder;
import lombok.Data;

@Data
@Builder(toBuilder = true)
public class Customer {
    private Long customerId;
    private String firstName;
    private String lastName;
    private boolean isSnsUser;
}
