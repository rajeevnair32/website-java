package com.daylight.website.core;

import com.daylight.website.model.Request;
import com.daylight.website.model.Response;
import me.ccampo.spring.aws.lambda.SpringRequestHandler;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UserHandler extends SpringRequestHandler<Request, Response> {

    private static final ApplicationContext context =
            new AnnotationConfigApplicationContext(ApplicationConfiguration.class);

    public ApplicationContext getApplicationContext() {
        return context;
    }
}