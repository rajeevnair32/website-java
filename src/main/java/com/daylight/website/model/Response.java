package com.daylight.website.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collections;
import java.util.Map;

@Data
@NoArgsConstructor
public class Response {
    private boolean isBase64Encoded = false;
    private int statusCode = 200;
    private Map<String, String> headers = Collections.emptyMap();
    private String body;

    public Response(final String response) {
        this.body = response;
    }
}
