package com.example.logdemo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LogdemoApplication {

	private static final Logger log = LogManager.getLogger(LogdemoApplication.class);
	public static void main(String[] args) {

		SpringApplication.run(LogdemoApplication.class, args);
		log.debug("Debug message logged !!!");
		log.info("Info message logged !!!");
		log.error("Error message logged !!!", new RuntimeException("unknwon error"));
	}

}
