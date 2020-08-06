package com.example.vkbot;


import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class MessageService {

    private final String OK_REPLY = "ok";
    private final String CONFIRMATION_CODE = "ca961e89";
    private final String TOKEN = "51e3815121931aac6e60e575655aced1707d4d336fd166c71e5fe2c2018c47199a4d3933265af04ef22be";

    RestTemplateBuilder restTemplateBuilder;
    private final RestTemplate restTemplate = restTemplateBuilder.build();

    public String newAction(String request){

        String returnString = "";

        try {
            JSONObject jsonObject = (JSONObject) new JSONParser().parse(request);

            switch ((String) jsonObject.get("type")) {
                case ("confirmation"):
                    returnString = CONFIRMATION_CODE;
                    break;
                case ("message_new"):
                    JSONObject messageObject = (JSONObject) new JSONParser().parse((String) jsonObject.get("object"));
                    String text = (String) messageObject.get("text");
                    int fromId = (int) messageObject.get("from_id");

                    String url = String.format("https://api.vk.com/method/messages.send?user_ids=%d&message=%s&access_token=%s", fromId, text, TOKEN);
                    restTemplate.getForObject(url, String.class);

                    returnString = OK_REPLY;
            }

        } catch (ParseException e) {
            e.printStackTrace();
        }

        return returnString;
    }
}
