package com.example.vkbot;

import com.example.vkbot.model.MessageNewAction;
import com.example.vkbot.model.Message;
import com.example.vkbot.model.MessageReplyAction;
import com.google.gson.Gson;
import lombok.Getter;
import lombok.Setter;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
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

    private static Logger logger = LogManager.getLogger();

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
        MessageNewAction messageNewAction = gson.fromJson(request, MessageNewAction.class);

        switch (messageNewAction.getType()) {
            case ("confirmation"):
                returnString = confirmationCode;
                break;
            case ("message_new"):
                Message message = messageNewAction.getObject().getMessage();
                String text = message.getText();
                int fromId = message.getFromId();
                logger.info("Received message: {} ", text);

                String encodedText = URLEncoder.encode(text, StandardCharsets.UTF_8);
                logger.info("Message sent: {}", encodedText);

                String url = String.format("https://api.vk.com/method/messages.send?user_ids=%d&message=%s&access_token=%s&v=5.122&random_id=0", fromId, encodedText, token);

                try {
                    URI uri = new URI(url);
                    restTemplate.getForObject(uri, String.class);
                } catch (URISyntaxException e) {
                    logger.error("URI Syntax exception: ", e);
                    e.printStackTrace();
                }

                returnString = okReply;
                break;
            case ("message_reply"):
                MessageReplyAction messageReplyAction = gson.fromJson(request, MessageReplyAction.class);
                Message messageReply = messageReplyAction.getMessage();
                logger.info("Message received by user: {}", messageReply.getText());

                returnString = okReply;
                break;
            default:
                returnString = null;
        }

        return returnString;
    }
}
