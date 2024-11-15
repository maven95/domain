package com.onboarding.domain.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

//SNSMessageSender -> class under test
class SNSMessageSenderTest {

    private SNSMessageSender snsMessageSender = new SNSMessageSender();

    @Test
    void testSendMessageToSns_NullMessage(){
        /// AAA
        // Arrange -> arrange data to call the "method under test".
        String topicName = "topic-1";
        String message = null;
        boolean expected = false;

        // Act -> invoking the method under test.
        boolean actual = snsMessageSender.sendMessageToSns(topicName, message);

        // Assert -> the information returned by the method is equal to what we have expected.
        // checking wheter the data we are "expecting" is equal to the data is "actually" returned by the method under test.
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testSendMessageToSns_EmptyMessage(){
        /// AAA
        // Arrange -> arrange data to call the "method under test".
        String topicName = "topic-1";
        String message = "";
        boolean expected = false;

        // Act -> invoking the method under test.
        boolean actual = snsMessageSender.sendMessageToSns(topicName, message);

        // Assert -> the information returned by the method is equal to what we have expected.
        // checking wheter the data we are "expecting" is equal to the data is "actually" returned by the method under test.
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testSendMessageToSns_InvalidTopicName(){
        /// AAA
        // Arrange -> arrange data to call the "method under test".
        String topicName = "sns";
        String message = "this is a sns message";
        boolean expected = false;

        // Act -> invoking the method under test.
        boolean actual = snsMessageSender.sendMessageToSns(topicName, message);

        // Assert -> the information returned by the method is equal to what we have expected.
        // checking wheter the data we are "expecting" is equal to the data is "actually" returned by the method under test.
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testSendMessageToSns_HappyPath(){
        /// AAA
        // Arrange -> arrange data to call the "method under test".
        String topicName = "valid-topic-name";
        String message = "this is a sns message";
        boolean expected = true;

        // Act -> invoking the method under test.
        boolean actual = snsMessageSender.sendMessageToSns(topicName, message);

        // Assert -> the information returned by the method is equal to what we have expected.
        // checking wheter the data we are "expecting" is equal to the data is "actually" returned by the method under test.
        Assertions.assertEquals(expected, actual);
    }
}
