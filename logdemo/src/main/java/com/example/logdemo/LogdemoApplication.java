package com.example.logdemo;

import com.example.logdemo.config.LogConfig;
import com.example.logdemo.util.LogMessage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LogdemoApplication {

	@Autowired
	public LogConfig logConfig;

	private static final Logger log = LogManager.getLogger(LogdemoApplication.class);
	public static void main(String[] args) {

		SpringApplication.run(LogdemoApplication.class, args);
		log.log(LogMessage.VERBOSE, "verbose level test in main !!!");
		log.debug("Debug message logged !!!");
		log.info("Info message logged !!!");
		log.error("Error message logged !!!", new RuntimeException("unknwon error"));
		LogConfig.testCustomLog();

	}


}
