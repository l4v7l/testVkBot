package com.example.vkbot.model.attachments;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Gift {
    private int id;
    @SerializedName("thumb_256")
    private String thumb256;
    @SerializedName("thumb_96")
    private String thumb96;
    @SerializedName("thumb_48")
    private String thumb48;
}
