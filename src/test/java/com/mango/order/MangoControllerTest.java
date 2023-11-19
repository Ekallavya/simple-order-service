package com.mango.order;

import com.mango.order.domain.Mango;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;

import java.net.URL;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class MangoControllerTest {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void testMangoController() throws Exception{
        ResponseEntity<Mango> response = restTemplate.getForEntity(new URL("http://localhost:" + port + "/order/mango/10").toString(), Mango.class);
        assertNotNull(response.getBody());
        System.out.println(response.getBody());
        Mango mango = response.getBody();

        assertEquals("Kobban", mango.getName());
        assertEquals(10, mango.getId());

        response = restTemplate.getForEntity(new URL("http://localhost:" + port + "/order/mango/100").toString(), Mango.class);
        assertNotNull(response.getBody());
        System.out.println(response.getBody());
        Mango mango1 = response.getBody();

        assertEquals("N/A", mango1.getName());
        assertEquals(0, mango1.getId());
    }
}
