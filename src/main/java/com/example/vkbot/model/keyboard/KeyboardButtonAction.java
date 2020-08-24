package com.example.vkbot.model.keyboard;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class KeyboardButtonAction {
    private String type;
    private String label;
    private String payload;
    private String link;
    private String hash;
    @SerializedName("app_id")
    private int appId;
    @SerializedName("owner_id")
    private int ownerId;
}
