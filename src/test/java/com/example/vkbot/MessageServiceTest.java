package com.example.vkbot;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.springframework.test.util.AssertionErrors.assertEquals;

@SpringBootTest
public class MessageServiceTest {

    @Autowired
    MessageService messageService;

    String confirmationJson = "{\"type\":\"confirmation\"}";
    String nullJson = "{\"type\":\"message_reply\"}";
    String okJson = "{\"type\":\"message_new\",\"object\":{\"message\":{\"from_id\":136878897,\"text\":\"Test Message\"}}}";

    @Test
    public void newActionTest(){
        assertEquals("", "0a4a3be3", messageService.newAction(confirmationJson));
        assertEquals("", null, messageService.newAction(nullJson));
        assertEquals("", "ok", messageService.newAction(okJson));
    }
}
