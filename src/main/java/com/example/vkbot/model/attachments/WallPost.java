package com.example.vkbot.model.attachments;

import com.example.vkbot.model.Attachment;

public class WallPost {
    private int id;
    private int ownerId;
    private int fromId;
    private int createdBy;
    private int date;
    private String text;
    private int replyOwnerId;
    private int replyPostId;
    private int friendsOnly;
    //private Comments comments;
    private String copyright;
    //private Likes likes;
    //private Reposts reposts;
    //private Views views;
    private String postType;
    private Attachment[] attachments;

}
