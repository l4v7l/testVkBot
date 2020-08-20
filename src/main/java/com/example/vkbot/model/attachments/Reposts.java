package com.example.vkbot.model.attachments;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Reposts {
    private int count;
    @SerializedName("user_reposted")
    private int userReposted;
}

