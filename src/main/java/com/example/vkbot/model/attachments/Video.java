package com.example.vkbot.model.attachments;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Video {
    private int id;
    @SerializedName("owner_id")
    private int ownerId;
    private String title;
    private String description;
    private int duration;
    @SerializedName("photo_130")
    private String photo130;
    @SerializedName("photo_320")
    private String photo320;
    @SerializedName("photo_640")
    private String photo640;
    @SerializedName("photo_800")
    private String photo800;
    @SerializedName("photo_1280")
    private String photo1280;
    @SerializedName("first_frame_130")
    private String firstFrame130;
    @SerializedName("first_frame_320")
    private String firstFrame320;
    @SerializedName("first_frame_640")
    private String firstFrame640;
    @SerializedName("first_frame_800")
    private String firstFrame800;
    @SerializedName("first_frame_1280")
    private String firstFrame1280;
    private int date;
    @SerializedName("adding_date")
    private int addingDate;
    private int views;
    private int comments;
    private String player;
    private String platform;
    @SerializedName("can_edit")
    private int canEdit;
    @SerializedName("can_add")
    private int canAdd;
    @SerializedName("isPrivate")
    private int isPrivate;
    @SerializedName("access_key")
    private String accessKey;
    private int processing;
    private int live;
    private int upcoming;
    @SerializedName("is_favorite")
    private boolean isFavorite;
}
