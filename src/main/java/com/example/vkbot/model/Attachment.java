package com.example.vkbot.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Attachment<T> {
    private String type;
    private T object;

    Attachment(String type, T object){
        this.type = type;
        this.object = object;
    }
}
