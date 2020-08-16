package com.example.vkbot.model.attachments;

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
    private String previewPage;
    private String previewUrl;
}
