package com.fairanb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class FairanbDiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(FairanbDiscoveryApplication.class, args);
	}
}
