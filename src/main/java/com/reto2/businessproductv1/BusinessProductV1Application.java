package com.reto2.businessproductv1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class BusinessProductV1Application {

	public static void main(String[] args) {
		SpringApplication.run(BusinessProductV1Application.class, args);
	}

}
