package com.example.vkbot.model.attachments;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Photo {
    private int id;
    private int albumId;
    private int ownerId;
    private int userId;
    private String text;
    private int date;
    private PhotoSize[] sizes;
    private int width;
    private int height;
}
