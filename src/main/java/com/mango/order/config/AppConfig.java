package com.mango.order.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

@Configuration
public class AppConfig {
    @Autowired
    Environment environment;

    public String  getConfigValue(String property){
       return environment.getProperty(property);
    }
}
