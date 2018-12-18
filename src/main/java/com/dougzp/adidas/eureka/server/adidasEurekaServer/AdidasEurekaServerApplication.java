package com.dougzp.adidas.eureka.server.adidasEurekaServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class AdidasEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdidasEurekaServerApplication.class, args);
	}

}

