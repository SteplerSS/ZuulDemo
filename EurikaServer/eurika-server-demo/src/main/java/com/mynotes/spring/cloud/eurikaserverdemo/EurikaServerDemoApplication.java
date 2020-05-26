package com.mynotes.spring.cloud.eurikaserverdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer

public class EurikaServerDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurikaServerDemoApplication.class, args);
	}

}
