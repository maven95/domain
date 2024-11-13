package com.onboarding.domain.services;

import org.springframework.stereotype.Component;

@Component
public class SNSMessageSender {
    public boolean sendMessageToSns(String topicName, String message){
        if(message == null || message.length()==0){
            return false;
        }
        if(topicName.length() < 5){
            return false;
        }
        return true;
    }
}
