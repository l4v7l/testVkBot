package com.example.vkbot.model.attachments;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Video {
    private int id;
    private int ownerId;
    private String title;
    private String description;
    private int duration;
    private String photo130;
    private String photo320;
    private String photo640;
    private String photo800;
    private String photo1280;
    private String firstFrame130;
    private String firstFrame320;
    private String firstFrame640;
    private String firstFrame800;
    private String firstFrame1280;
    private int date;
    private int addingDate;
    private int views;
    private int comments;
    private String player;
    private String platform;
    private int canEdit;
    private int canAdd;
    private int isPrivate;
    private String accessKey;
    private int processing;
    private int live;
    private int upcoming;
    private boolean isFavorite;
}
