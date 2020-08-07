package com.example.vkbot;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class MessageService {

    private final RestTemplate restTemplate;

    public MessageService(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }

    public String newAction(String request){

        String OK_REPLY = "ok";
        String CONFIRMATION_CODE = "0a4a3be3";
        String TOKEN = "51e3815121931aac6e60e575655aced1707d4d336fd166c71e5fe2c2018c47199a4d3933265af04ef22be";

        String returnString;

        Gson gson = new Gson();
        JsonObject jsonObject = gson.fromJson(request, JsonObject.class);

        switch (jsonObject.get("type").getAsString()) {
            case ("confirmation"):
                returnString = CONFIRMATION_CODE;
                break;
            case ("message_new"):
                JsonObject messageObject = jsonObject.get("object").getAsJsonObject().get("message").getAsJsonObject();
                String text = messageObject.get("text").getAsString();
                Long fromId = messageObject.get("from_id").getAsLong();

                String url = String.format("https://api.vk.com/method/messages.send?user_ids=%d&message=%s&access_token=%s&v=5.122&random_id=0", fromId, text, TOKEN);
                restTemplate.getForObject(url, String.class);

                returnString = OK_REPLY;
                break;
            default:
                returnString = null;
        }

        return returnString;
    }
}
