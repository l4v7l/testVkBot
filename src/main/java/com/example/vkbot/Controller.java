package com.example.vkbot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    private MessageService messageService;

    @PostMapping
    public String getMessage(@RequestBody String request) {
        return messageService.newAction(request);
    }
}
