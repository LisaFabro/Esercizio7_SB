package com.example.demo6h2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Demo6H2Application {
	//http://localhost:8080/h2-console  ---> inserire nel browser senza URL dello yml

	public static void main(String[] args) {
		SpringApplication.run(Demo6H2Application.class, args);
	}

}
