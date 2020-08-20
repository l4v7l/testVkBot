package com.example.vkbot.model.attachments;

import com.example.vkbot.model.Attachment;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
public class WallReply {
    private int id;
    @SerializedName("from_id")
    private int fromId;
    private int date;
    private String text;
    @SerializedName("reply_to_user")
    private int replyToUser;
    @SerializedName("reply_to_comment")
    private int replyToComment;
    private ArrayList<Attachment> attachments;
    @SerializedName("parents_stack")
    private ArrayList<Integer> parentsStack;
    private Thread thread;
}
