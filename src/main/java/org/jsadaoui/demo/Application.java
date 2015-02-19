package org.jsadaoui.demo;

import java.io.IOException;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.Environment;

@EnableAutoConfiguration
@ComponentScan
public class Application {
	
	private final Logger log = LoggerFactory.getLogger(Application.class);

    @Autowired
    private Environment env;

    @PostConstruct
    public void initApplication() throws IOException {
        if (env.getActiveProfiles().length == 0) {
            log.warn("No Spring profile configured, running with default configuration");
        } 
    }
    
    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }
}


