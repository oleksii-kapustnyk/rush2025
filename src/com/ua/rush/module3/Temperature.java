package com.ua.rush.module3;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.stream.Stream;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Temperature {

    private double latitude;
    private double longitude;
    private String timezone;
    private Current current;


    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    private class Current {
        @JsonProperty("temperature_2m")
        private double temperature2m;
    }

}
