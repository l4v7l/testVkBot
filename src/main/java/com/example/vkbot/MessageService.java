package com.example.vkbot;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class MessageService {

    private final RestTemplate restTemplate;

    @Value("${message.ok_reply}")
    String okReply;

    @Value("${message.confirmation_code}")
    String confirmationCode;

    @Value("${message.token}")
    String token;

    public MessageService(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }

    public String newAction(String request){

        String returnString;

        Gson gson = new Gson();
        JsonObject jsonObject = gson.fromJson(request, JsonObject.class);

        switch (jsonObject.get("type").getAsString()) {
            case ("confirmation"):
                returnString = confirmationCode;
                break;
            case ("message_new"):
                JsonObject messageObject = jsonObject.get("object").getAsJsonObject().get("message").getAsJsonObject();
                String text = messageObject.get("text").getAsString();
                Long fromId = messageObject.get("from_id").getAsLong();

                String url = String.format("https://api.vk.com/method/messages.send?user_ids=%d&message=%s&access_token=%s&v=5.122&random_id=0", fromId, text, token);
                restTemplate.getForObject(url, String.class);

                returnString = okReply;
                break;
            default:
                returnString = null;
        }

        return returnString;
    }
}
