package com.example.vkbot.model.attachments;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Likes {
    private int count;
    @SerializedName("user_likes")
    private int userLikes;
    @SerializedName("can_like")
    private int canLike;
    @SerializedName("can_publish")
    private int canPublish;
}
