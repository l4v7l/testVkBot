package com.example.vkbot.model.keyboard;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class KeyboardButton {
    private KeyboardButtonAction action;
    private String color;
}
