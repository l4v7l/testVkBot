package com.example.vkbot.model.attachments;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Thread {
    private int count;
    private WallReply items;
    @SerializedName("can_post")
    private boolean canPost;
    @SerializedName("show_reply_button")
    private boolean showReplyButton;
    @SerializedName("groups_can_post")
    private boolean groupsCanPost;
}
