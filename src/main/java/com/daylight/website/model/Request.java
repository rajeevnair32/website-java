package com.daylight.website.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Data
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Request {

    private String path;
    private String httpMethod;
    private Map<String, String> queryStringParameters;
    private Map<String, String> pathParameters;
    private Map<String, String> headers;
}
