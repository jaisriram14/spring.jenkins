package com.example.jenkins.api;

import javax.annotation.PostConstruct;

import org.apache.logging.log4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Application {
	public static org.slf4j.Logger logger=LoggerFactory.getLogger(Application.class);
	@PostConstruct
	public void intt() {
		logger.info("application execution started just changed logger message");
	}
	@GetMapping("/getmessage")
	public String getMessage() {
		return "jai sriram";
	}

	public static void main(String[] args) {
		logger.info("application executed");
		logger.info("application executed changed for secoend commit");
		
		
		SpringApplication.run(Application.class, args);
	}

}
