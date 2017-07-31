package com.TestMongo;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class TestMongoApplication {
	
	private static final Logger logger = LoggerFactory.getLogger(TestMongoApplication.class);

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(TestMongoApplication.class, args);
		
		 String beanNames[] = ctx.getBeanDefinitionNames();
	        Arrays.sort(beanNames);
	        
	        for (String beanName: beanNames)
	        	logger.info(beanName);
	    }

	
}
