package com.example.vkbot.model;

import com.example.vkbot.model.geo.Geo;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

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
    //TODO change type to Attachments. Create an interface Attachmnts and implements from it all of attachments types
    private String[] attachments;
    private boolean important;
    private Geo geo;
    private String payload;
    //TODO
    private String keyboard;
    @SerializedName("fwd_messages")
    private Message[] fwdMessages;
    @SerializedName("reply_message")
    private Message replyMessage;
    private MessageAction action;
}
