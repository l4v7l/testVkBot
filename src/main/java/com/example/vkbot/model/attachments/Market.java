package com.example.vkbot.model.attachments;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Market {
    private int id;
    @SerializedName("owner_id")
    private int ownerId;
    private String title;
    private String description;
    private Price price;
    private Dimensions dimensions;
    private int weight;
    private Category category;
    @SerializedName("thumb_photo")
    private String thumbPhoto;
    private int date;
    private int availability;
    @SerializedName("is_favorite")
    private boolean isFavorite;

}
