package com.example.vkbot.model.attachments;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
public class Photo {
    private int id;
    @SerializedName("album_id")
    private int albumId;
    @SerializedName("owner_id")
    private int ownerId;
    @SerializedName("user_id")
    private int userId;
    private String text;
    private int date;
    private ArrayList<PhotoSize> sizes;
    private int width;
    private int height;
}
