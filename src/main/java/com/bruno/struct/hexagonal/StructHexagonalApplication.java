package com.bruno.struct.hexagonal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class StructHexagonalApplication {

	public static void main(String[] args) {
		SpringApplication.run(StructHexagonalApplication.class, args);
	}

}
