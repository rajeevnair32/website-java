package com.daylight.website.works;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.daylight.website.model.Request;
import com.daylight.website.model.Response;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy(value = false)
public class UserRequestHandler implements RequestHandler<Request, Response> {

    public Response handleRequest(Request input, Context context) {

        StringBuffer sb = new StringBuffer();
        sb.append(input.getPath());
        sb.append(input.getHttpMethod());
        sb.append(input.getQueryStringParameters());
        sb.append(input.getPathParameters());
        sb.append(input.getHeaders().get("test4"));

        return new Response("this is a test message: " + sb.toString());
    }
}
