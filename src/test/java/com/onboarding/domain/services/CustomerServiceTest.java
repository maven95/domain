package com.onboarding.domain.services;

import com.onboarding.domain.models.Customer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class CustomerServiceTest {

    @Mock CustomerRestClient customerRestClient;
    @Mock SNSMessageSender snsMessageSender;
    @Mock SQSMessageSender sqsMessageSender;

    @InjectMocks CustomerService customerService;

    @Test
    void test(){
    }
    @Test
    void testRetrieveCustomerAndSendMessage(){
        // Arrange Data
        Long customerId = 10001L;
        Customer customer = Customer.builder().customerId(customerId).isSnsUser(true).build();
        // when I call customerRestClient.getCustomer(), then provide me one customer.
        Mockito.when(customerRestClient.getCustomer(ArgumentMatchers.anyLong())).thenReturn(customer);

        // Act
        Customer actual =  customerService.retrieveCustomerAndSendMessage(customerId);

        //assert or verify...
        Mockito.verify(snsMessageSender).sendMessageToSns(ArgumentMatchers.any(), ArgumentMatchers.any());
        Mockito.verifyNoInteractions(sqsMessageSender);
    }
}
