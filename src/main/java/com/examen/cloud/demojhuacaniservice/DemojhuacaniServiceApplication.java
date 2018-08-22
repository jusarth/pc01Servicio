package com.examen.cloud.demojhuacaniservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class DemojhuacaniServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemojhuacaniServiceApplication.class, args);
	}
}
