package com.example.vkbot.model.attachments;

import com.example.vkbot.model.attachments.docPreview.DocPreviewAudioMessage;
import com.example.vkbot.model.attachments.docPreview.DocPreviewGraffiti;
import com.example.vkbot.model.attachments.docPreview.DocPreviewPhoto;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DocPreview {
    DocPreviewPhoto photo;
    DocPreviewGraffiti graffiti;
    @SerializedName("audio_message")
    DocPreviewAudioMessage audioMessage;
}
