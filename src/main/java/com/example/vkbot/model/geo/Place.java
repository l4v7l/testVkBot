package com.example.vkbot.model.geo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Place {
    private int id;
    private String title;
    private float latitude;
    private float longitude;
    private int created;
    private String icon;
    private String country;
    private String city;
}
