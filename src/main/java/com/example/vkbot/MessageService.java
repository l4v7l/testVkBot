package com.example.vkbot;

import com.example.vkbot.model.Action;
import com.example.vkbot.model.Message;
import com.google.gson.Gson;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.*;
import java.nio.charset.StandardCharsets;

@Service
@Getter
@Setter
@ConfigurationProperties(prefix = "message")
public class MessageService {

    private final RestTemplate restTemplate;

    String okReply;
    String confirmationCode;
    String token;

    public MessageService(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }

    public String newAction(String request){

        String returnString;

        Gson gson = new Gson();
        Action action = gson.fromJson(request, Action.class);

        switch (action.getType()) {
            case ("confirmation"):
                returnString = confirmationCode;
                break;
            case ("message_new"):
                Message message = action.getObject().getMessage();
                String text = message.getText();
                int fromId = message.getFromId();

                String encodedText = URLEncoder.encode(text, StandardCharsets.UTF_8);
                String url = String.format("https://api.vk.com/method/messages.send?user_ids=%d&message=%s&access_token=%s&v=5.122&random_id=0", fromId, encodedText, token);

                try {
                    URI uri = new URI(url);
                    restTemplate.getForObject(uri, String.class);
                } catch (URISyntaxException e) {
                    e.printStackTrace();
                }

                returnString = okReply;
                break;
            default:
                returnString = null;
        }

        return returnString;
    }
}
