package com.example.vkbot.model;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MessageObject {
    private Message message;
    @SerializedName("client_info")
    private ClientInfo clientInfo;
}
