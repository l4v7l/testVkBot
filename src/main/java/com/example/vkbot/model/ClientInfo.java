package com.example.vkbot.model;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClientInfo {
    @SerializedName("button_actions")
    private String[] buttonActions;
    private boolean keyboard;
    @SerializedName("inline_keyboard")
    private boolean inlineKeyboard;
    private boolean carousel;
    @SerializedName("lang_id")
    private int langId;
}

