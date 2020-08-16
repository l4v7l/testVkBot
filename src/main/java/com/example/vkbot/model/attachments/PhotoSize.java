package com.example.vkbot.model.attachments;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PhotoSize {
    private String type;
    private String url;
    private int width;
    private int height;
}
