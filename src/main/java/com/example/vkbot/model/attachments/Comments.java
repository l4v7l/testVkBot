package com.example.vkbot.model.attachments;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Comments {
    private int count;
    @SerializedName("can_post")
    private int canPost;
    @SerializedName("groups_can_post")
    private int groupsCanPost;
    @SerializedName("can_close")
    private boolean canClose;
    @SerializedName("can_open")
    private boolean canOpen;
}
