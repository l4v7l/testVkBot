package com.example.vkbot.model.attachments;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Link {
    private String url;
    private String title;
    private String caption;
    private String description;
    private Photo photo;
    private Product product;
    private Button button;
    @SerializedName("preview_page")
    private String previewPage;
    @SerializedName("preview_url")
    private String previewUrl;
}
