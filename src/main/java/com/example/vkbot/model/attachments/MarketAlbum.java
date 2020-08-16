package com.example.vkbot.model.attachments;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MarketAlbum {
    private int id;
    private int ownerId;
    private String title;
    private Photo photo;
    private int count;
    private int updatedTime;
}
