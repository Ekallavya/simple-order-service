package com.mango.order;

import com.mango.order.config.AppConfig;
import com.mango.order.config.HostProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OrderApplication implements CommandLineRunner {
	@Autowired
	private HostProperties hostProperties;

	@Value("${app.username}")
	private String appUser;

	@Autowired
	private AppConfig appConfig;

	public static void main(String[] args) {

		SpringApplication.run(OrderApplication.class, args);

		System.out.println("Order application has been started...");
	}

	@Override
	public void run(String... args) {
		System.out.println("Active Profile :" + appConfig.getConfigValue("spring.profiles.active"));
		System.out.println("appUser :"+appUser);
		System.out.println("APP Password :" + appConfig.getConfigValue("app.password"));
		System.out.println(hostProperties);
	}

}
