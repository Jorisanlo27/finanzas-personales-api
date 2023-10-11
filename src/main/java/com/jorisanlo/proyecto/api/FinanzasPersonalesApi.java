package com.jorisanlo.proyecto.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class FinanzasPersonalesApi {

	public static void main(String[] args) {
		SpringApplication.run(FinanzasPersonalesApi.class, args);
	}

}
