package com.example.vkbot.model.attachments;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MarketAlbum {
    private int id;
    @SerializedName("owner_id")
    private int ownerId;
    private String title;
    private Photo photo;
    private int count;
    @SerializedName("updated_time")
    private int updatedTime;
}
