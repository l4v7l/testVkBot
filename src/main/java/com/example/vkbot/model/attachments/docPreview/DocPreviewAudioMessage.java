package com.example.vkbot.model.attachments.docPreview;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DocPreviewAudioMessage {
    private int duration;
    private int[] waveform;
    @SerializedName("link_ogg")
    private String linkOgg;
    @SerializedName("link_mp3")
    private String linkMp3;
}
