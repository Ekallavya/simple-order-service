package com.mango.order;

import com.mango.order.config.HostProperties;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
public class HostPropertiesTest {
    @Autowired
    HostProperties hostProperties;

    @DisplayName("Test Spring @Autowired Integration")
    @Test
    void testHostProperties() {
        assertEquals("125.0.0.1", hostProperties.getCList().get(0).getIp());
        assertEquals("/dev1", hostProperties.getCList().get(0).getPath());
        assertEquals("125.0.0.2", hostProperties.getCList().get(1).getIp());
        assertEquals("/dev2", hostProperties.getCList().get(1).getPath());
        assertEquals("125.0.0.3", hostProperties.getCList().get(2).getIp());
        assertEquals("/dev3", hostProperties.getCList().get(2).getPath());
    }
}
