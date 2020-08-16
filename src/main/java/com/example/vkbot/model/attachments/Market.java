package com.example.vkbot.model.attachments;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Market {
    private int id;
    private int ownerId;
    private String title;
    private String description;
    private Price price;
    private Dimensions dimensions;
    private int weight;
    private Category category;
    private String thumbPhoto;
    private int date;
    private int availability;
    private boolean isFavorite;

}
