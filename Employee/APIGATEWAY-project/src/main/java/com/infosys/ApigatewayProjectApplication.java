package com.infosys;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ApigatewayProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApigatewayProjectApplication.class, args);
	}

}
