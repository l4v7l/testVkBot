package com.example.vkbot.model.attachments;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
@Getter
@Setter
public class Sticker {
    @SerializedName("product_id")
    private int productId;
    @SerializedName("sticker_id")
    private int stickerId;
    private ArrayList<StickerSize> images;
    @SerializedName("images_with_background")
    private ArrayList<StickerSize> imagesWithBackground;
}
