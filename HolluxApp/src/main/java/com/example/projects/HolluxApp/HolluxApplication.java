package com.example.projects.HolluxApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
//@EnableScheduling
public class HolluxApplication {

	public static void main(String[] args) {
		SpringApplication.run(HolluxApplication.class, args);
	}

}
