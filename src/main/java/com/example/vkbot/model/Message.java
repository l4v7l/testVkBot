package com.example.vkbot.model;

import com.example.vkbot.model.geo.Geo;
import com.example.vkbot.model.keyboard.Keyboard;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;

@Getter
@Setter
@ToString
public class Message {
    private int id;
    private int date;
    @SerializedName("peer_id")
    private int peerId;
    @SerializedName("from_id")
    private int fromId;
    private String text;
    @SerializedName("random_id")
    private int randomId;
    private String ref;
    @SerializedName("ref_source")
    private String refSource;
    private ArrayList<Attachment> attachments;
    private boolean important;
    private Geo geo;
    private String payload;
    private Keyboard keyboard;
    @SerializedName("fwd_messages")
    private ArrayList<Message> fwdMessages;
    @SerializedName("reply_message")
    private Message replyMessage;
    private MessageAction action;
}
