package com.example.vkbot.model.attachments;

import com.example.vkbot.model.Attachment;
import com.example.vkbot.model.geo.Geo;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
public class WallPost {
    private int id;
    @SerializedName("owner_id")
    private int ownerId;
    @SerializedName("from_id")
    private int fromId;
    @SerializedName("created_by")
    private int createdBy;
    private int date;
    private String text;
    @SerializedName("reply_owner_id")
    private int replyOwnerId;
    @SerializedName("reply_post_id")
    private int replyPostId;
    @SerializedName("friends_only")
    private int friendsOnly;
    private Comments comments;
    private String copyright;
    private Likes likes;
    private Reposts reposts;
    private Views views;
    @SerializedName("post_type")
    private String postType;
    private ArrayList<Attachment> attachments;
    private Geo geo;
    @SerializedName("signer_id")
    private int signerId;
    @SerializedName("copy_history")
    private ArrayList<Reposts> copyHistory;
    @SerializedName("can_pin")
    private int canPin;
    @SerializedName("can_delete")
    private int canDelete;
    @SerializedName("can_edit")
    private int canEdit;
    @SerializedName("is_pinned")
    private int isPinned;
    @SerializedName("marked_as_ads")
    private int markedAsAds;
    @SerializedName("is_favorite")
    private boolean isFavorite;
    @SerializedName("postponed_id")
    private int postponedId;

}
