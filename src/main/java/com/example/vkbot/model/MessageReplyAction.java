package com.example.vkbot.model;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MessageReplyAction {
    private String type;
    @SerializedName("object")
    private Message message;
    @SerializedName("group_id")
    private int groupId;
    @SerializedName("event_id")
    private String eventId;
}
