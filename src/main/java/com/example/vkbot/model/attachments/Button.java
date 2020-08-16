package com.example.vkbot.model.attachments;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Button {
    private String title;
    private ButtonAction action;
}
