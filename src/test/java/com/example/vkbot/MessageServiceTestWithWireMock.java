package com.example.vkbot;

import com.github.tomakehurst.wiremock.junit.WireMockRule;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.junit.Rule;
import org.junit.Test;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MessageServiceTestWithWireMock {

    @Rule
    public WireMockRule wireMockRule = new WireMockRule(8080);

    String okReply = "ok";
    String confirmationCode = "0e12d1d3";

    String confirmationJson = "{\"type\":\"confirmation\"}";
    String messageReplyJson = "{\"type\":\"message_reply\"}";
    String messageNewJson = "{\"type\":\"message_new\",\"object\":{\"message\":{\"from_id\":136878897,\"text\":\"Test Message\"}}}";
    String nullJson = "";

    @Test
    public void messageNewTest() throws Exception {

        stubFor(post(urlPathMatching("/"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "text/plain")
                        .withBody(okReply)));

        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpPost request = new HttpPost("http://localhost:8080/");
        StringEntity stringEntity = new StringEntity(messageNewJson);
        request.setEntity(stringEntity);
        HttpResponse httpResponse = httpClient.execute(request);

        StringBuilder stringBuilder = new StringBuilder();
        try {
            BufferedReader reader =
                    new BufferedReader(new InputStreamReader(httpResponse.getEntity().getContent()), 65728);
            String line = null;

            while ((line = reader.readLine()) != null) {
                stringBuilder.append(line);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        String stringResponse = stringBuilder.toString();

        verify(postRequestedFor(urlEqualTo("/")));
        assertEquals(200, httpResponse.getStatusLine().getStatusCode());
        assertEquals("text/plain", httpResponse.getFirstHeader("Content-Type").getValue());
        assertEquals(okReply, stringResponse);

    }

    @Test
    public void confirmationTest() throws Exception {

        stubFor(post(urlPathMatching("/"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "text/plain")
                        .withBody(confirmationCode)));

        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpPost request = new HttpPost("http://localhost:8080/");
        StringEntity stringEntity = new StringEntity(confirmationJson);
        request.setEntity(stringEntity);
        HttpResponse httpResponse = httpClient.execute(request);

        StringBuilder stringBuilder = new StringBuilder();
        try {
            BufferedReader reader =
                    new BufferedReader(new InputStreamReader(httpResponse.getEntity().getContent()), 65728);
            String line = null;

            while ((line = reader.readLine()) != null) {
                stringBuilder.append(line);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        String stringResponse = stringBuilder.toString();

        verify(postRequestedFor(urlEqualTo("/")));
        assertEquals(200, httpResponse.getStatusLine().getStatusCode());
        assertEquals("text/plain", httpResponse.getFirstHeader("Content-Type").getValue());
        assertEquals(confirmationCode, stringResponse);

    }

    @Test
    public void messageReplyTest() throws Exception {

        stubFor(post(urlPathMatching("/"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "text/plain")
                        .withBody(okReply)));

        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpPost request = new HttpPost("http://localhost:8080/");
        StringEntity stringEntity = new StringEntity(messageReplyJson);
        request.setEntity(stringEntity);
        HttpResponse httpResponse = httpClient.execute(request);

        StringBuilder stringBuilder = new StringBuilder();
        try {
            BufferedReader reader =
                    new BufferedReader(new InputStreamReader(httpResponse.getEntity().getContent()), 65728);
            String line = null;

            while ((line = reader.readLine()) != null) {
                stringBuilder.append(line);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        String stringResponse = stringBuilder.toString();

        verify(postRequestedFor(urlEqualTo("/")));
        assertEquals(200, httpResponse.getStatusLine().getStatusCode());
        assertEquals("text/plain", httpResponse.getFirstHeader("Content-Type").getValue());
        assertEquals(okReply, stringResponse);

    }

    @Test
    public void nullTest() throws Exception {

        stubFor(post(urlPathMatching("/"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "text/plain")
                        .withBody((String) null)));

        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpPost request = new HttpPost("http://localhost:8080/");
        StringEntity stringEntity = new StringEntity(nullJson);
        request.setEntity(stringEntity);
        HttpResponse httpResponse = httpClient.execute(request);

        StringBuilder stringBuilder = new StringBuilder();
        try {
            BufferedReader reader =
                    new BufferedReader(new InputStreamReader(httpResponse.getEntity().getContent()), 65728);
            String line = null;

            while ((line = reader.readLine()) != null) {
                stringBuilder.append(line);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        String stringResponse = stringBuilder.toString();

        verify(postRequestedFor(urlEqualTo("/")));
        assertEquals(200, httpResponse.getStatusLine().getStatusCode());
        assertEquals("text/plain", httpResponse.getFirstHeader("Content-Type").getValue());
        assertEquals("", stringResponse);

    }


}
