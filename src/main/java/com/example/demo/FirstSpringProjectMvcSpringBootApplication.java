package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@Configuration
@EnableAutoConfiguration
@ComponentScan({"com.example.demo","Controller"})
@SpringBootApplication
public class FirstSpringProjectMvcSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstSpringProjectMvcSpringBootApplication.class, args);
	}

}
