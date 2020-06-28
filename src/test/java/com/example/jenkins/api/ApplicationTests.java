package com.example.jenkins.api;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApplicationTests {
	public static org.slf4j.Logger logger=LoggerFactory.getLogger(ApplicationTests.class);

	@Test
	void contextLoads() {
		logger.info("test case executing changed for secoend commit");
		assertEquals("true", "true");
	}

}
