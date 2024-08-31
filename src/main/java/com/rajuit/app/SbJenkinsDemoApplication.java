package com.rajuit.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication

public class SbJenkinsDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbJenkinsDemoApplication.class, args);
	}

}
