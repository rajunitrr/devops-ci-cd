package com.rajuit.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {

	@GetMapping("/greetings/{name}")
	public String greetings(@PathVariable String name) {

		name = name.split(" ")[0];
		return "Hello " + name + " Congratulations you have successfully completed Jenkins CI/CD demo !";
	}

}
