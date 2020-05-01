package com.embedded.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class ApplicationInitializer {

	public static void main(String[] args) {
		SpringApplication.run(ApplicationInitializer.class, args);
		System.out.println("Demo of changing the default embedded server.....");
	}

	
	@RequestMapping("/app")
	public String demoApp() {
		return "Demo of changing the default embedded server.....";
	}
}
