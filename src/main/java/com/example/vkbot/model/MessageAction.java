package com.example.vkbot.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MessageAction {
    private String type;
    private int memberId;
    private String text;
    private String email;
    private MessageActionPhoto photo;
}
