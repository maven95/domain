package com.onboarding.domain.services;


import com.onboarding.domain.models.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CustomerService {

    @Autowired CustomerRestClient customerRestClient;
    @Autowired SNSMessageSender snsMessageSender;
    @Autowired SQSMessageSender sqsMessageSender;

    public Customer retrieveCustomerAndSendMessage(Long customerId){
        if(customerId < 0){
            throw new IllegalArgumentException("Invalid Customer Id");
        }
        Customer customer = customerRestClient.getCustomer(customerId);

        if(customer.isSnsUser()){
            snsMessageSender.sendMessageToSns("sns-topic-1", "Sending message to sns");
        }else{
            sqsMessageSender.sendMessageToSqs("sqs-topic-1", "Sending message to sqs");
        }

        return customer;
    }
}
