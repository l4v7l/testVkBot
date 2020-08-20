package com.example.vkbot.model.attachments.docPreview;

import com.example.vkbot.model.attachments.PhotoSize;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
public class DocPreviewPhoto {
    private ArrayList<PhotoSize> sizes;
}

