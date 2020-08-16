package com.example.vkbot.model;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Action {
    private String type;
    private MessageObject object;
    @SerializedName("group_id")
    private int groupId;
    @SerializedName("event_id")
    private String eventId;
}
