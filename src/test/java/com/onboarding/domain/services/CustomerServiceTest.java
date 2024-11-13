package com.onboarding.domain.services;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class CustomerServiceTest {

    @Mock CustomerRestClient customerRestClient;
    @Mock SNSMessageSender snsMessageSender;
    @Mock SQSMessageSender sqsMessageSender;

    @InjectMocks CustomerService customerService;

    @Test
    void testRetrieveCustomerAndSendMessage(){
        customerService.retrieveCustomerAndSendMessage(1001L);
    }

    @Test
    void test(){
    }
    
}
