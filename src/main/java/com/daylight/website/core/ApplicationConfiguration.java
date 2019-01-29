package com.daylight.website.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(lazyInit = true, basePackages = "com.daylight.website")
public class ApplicationConfiguration {
}
