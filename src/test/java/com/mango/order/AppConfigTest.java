package com.mango.order;

import com.mango.order.config.AppConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
@SpringBootTest
public class AppConfigTest {

    @Autowired
    AppConfig appConfig;

    @Test
    public void testAppConfig(){
        assertEquals("madhureddie@gmail.com", appConfig.getConfigValue("host.email"));
    }
}
