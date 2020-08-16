package com.example.vkbot.model.attachments.docPreview;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DocPreviewAudioMessage {
    private int duration;
    private int[] waveform;
    private String linkOgg;
    private String linkMp3;
}
