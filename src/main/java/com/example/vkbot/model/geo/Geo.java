package com.example.vkbot.model.geo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Geo {
    private String type;
    private Coordinates coordinates;
    private Place place;
}
