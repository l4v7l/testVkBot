package com.example.vkbot.model.keyboard;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
public class Keyboard {
    @SerializedName("one_time")
    private boolean oneTime;
    private ArrayList<ArrayList<KeyboardButton>> buttons;
    private boolean inline;
}
