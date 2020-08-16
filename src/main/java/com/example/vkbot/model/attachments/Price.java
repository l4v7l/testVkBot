package com.example.vkbot.model.attachments;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Price {
    private String amount;
    private Currency currency;
    private String oldAmount;
    private String text;
}
