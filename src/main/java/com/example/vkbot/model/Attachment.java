package com.example.vkbot.model;

import com.example.vkbot.model.attachments.*;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Attachment {

    private String type;
    private Photo photo;
    private Video video;
    private Audio audio;
    private Doc doc;
    private Link link;
    private Market market;
    @SerializedName("market_album")
    private MarketAlbum marketAlbum;
    private WallPost wall;
    @SerializedName("wall_reply")
    private WallReply wallReply;
    private Sticker sticker;
    private Gift gift;

}
