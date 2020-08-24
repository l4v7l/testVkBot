package com.example.vkbot.model.attachments;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Audio {
    private int id;
    @SerializedName("owner_id")
    private int ownerId;
    private String artist;
    private String title;
    private int duration;
    private String url;
    @SerializedName("lyrics_id")
    private int lyricsId;
    @SerializedName("album_id")
    private int albumId;
    @SerializedName("genre_id")
    private int genreId;
    private int date;
    @SerializedName("no_search")
    private int noSearch;
    @SerializedName("is_hq")
    private int isHq;
}
