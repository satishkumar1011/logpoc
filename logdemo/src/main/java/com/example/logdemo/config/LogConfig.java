package com.example.logdemo.config;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LogConfig {

    private static final Logger log = LogManager.getLogger(LogConfig.class);
}
