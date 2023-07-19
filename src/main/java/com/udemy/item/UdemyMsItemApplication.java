package com.udemy.item;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


@EnableFeignClients
@SpringBootApplication
public class UdemyMsItemApplication {

	public static void main(String[] args) {
		SpringApplication.run(UdemyMsItemApplication.class, args);
	}

}
