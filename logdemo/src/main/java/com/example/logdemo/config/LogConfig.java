package com.example.logdemo.config;

import com.example.logdemo.util.LogMessage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LogConfig {

    private static final Logger logger = LogManager.getLogger(LogConfig.class);

    public void testCustomLog(){
        logger.info("info message from LogConfig !!!");
        logger.log(LogMessage.VERBOSE, "verbose level test !!!");
    }
}
