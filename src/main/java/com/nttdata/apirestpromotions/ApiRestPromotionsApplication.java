package com.nttdata.apirestpromotions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ApiRestPromotionsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiRestPromotionsApplication.class, args);
	}

}
