package com.example.vkbot.model.attachments;

import com.example.vkbot.model.attachments.docPreview.DocPreviewAudioMessage;
import com.example.vkbot.model.attachments.docPreview.DocPreviewGraffiti;
import com.example.vkbot.model.attachments.docPreview.DocPreviewPhoto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DocPreview {
    DocPreviewPhoto photo;
    DocPreviewGraffiti graffiti;
    DocPreviewAudioMessage audioMessage;
}
