package com.example.vkbot.model.attachments;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Doc {
    private int id;
    @SerializedName("owner_id")
    private int ownerId;
    private String title;
    private int size;
    private String ext;
    private String url;
    private int date;
    private int type;
    private DocPreview preview;
}
