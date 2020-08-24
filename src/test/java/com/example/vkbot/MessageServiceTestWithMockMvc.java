package com.example.vkbot;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsString;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(Controller.class)
public class MessageServiceTestWithMockMvc {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private MessageService messageService;

    @Value("${message.ok_reply}")
    String okReply;

    @Value("${message.confirmation_code}")
    String confirmationCode;

    String confirmationJson = "{\"type\":\"confirmation\"}";
    String messageReplyJson = "{\"type\":\"message_reply\"}";
    String messageNewJson = "{\"type\":\"message_new\",\"object\":{\"message\":{\"from_id\":136878897,\"text\":\"Test Message\"}}}";
    String nullJson = "";

    @Test
    public void confirmationTest() throws Exception {

        when(messageService.newAction(confirmationJson)).thenReturn(confirmationCode);
        this.mockMvc.perform(post("/").content(confirmationJson))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string(containsString(confirmationCode)));

        verify(messageService).newAction(confirmationJson);

    }

    @Test
    public void messageNewTest() throws Exception {

        when(messageService.newAction(messageNewJson)).thenReturn(okReply);
        this.mockMvc.perform(post("/").content(messageNewJson))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string(containsString(okReply)));

        verify(messageService).newAction(messageNewJson);

    }

    @Test
    public void messageReplyTest() throws Exception {

        when(messageService.newAction(messageReplyJson)).thenReturn(okReply);
        this.mockMvc.perform(post("/").content(messageReplyJson))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string(containsString(okReply)));

        verify(messageService).newAction(messageReplyJson);

    }

    @Test
    public void nullTest() throws Exception {

        when(messageService.newAction(nullJson)).thenReturn(null);
        this.mockMvc.perform(post("/").content(nullJson))
                .andDo(print())
                .andExpect(status().is(400));

        verify(messageService, Mockito.never()).newAction(nullJson);

    }
}
