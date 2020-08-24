package com.example.vkbot.model.attachments;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Price {
    private String amount;
    private Currency currency;
    @SerializedName("old_amount")
    private String oldAmount;
    private String text;
}
