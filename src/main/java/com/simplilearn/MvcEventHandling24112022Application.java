package com.simplilearn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MvcEventHandling24112022Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext appContext = SpringApplication.run(MvcEventHandling24112022Application.class,
				args);
		appContext.start();
		
		//appContext.stop();
	}

}
