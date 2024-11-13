package com.onboarding.domain.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SQSMessageSender {

    public boolean sendMessageToSqs(String queueName, String message){
        if(message == null || message.length()==0){
            return false;
        }
        if(queueName == null || message.length() < 4){
            return false;
        }
        return true;
    }

}
