package com.mx.development.said.olano.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * The Application class serves as the entry point for the Spring Boot application.
 * It is annotated with {@code @SpringBootApplication}, which marks it as a Spring Boot application,
 * enabling component scanning, autoconfiguration, and other features of the framework.
 *
 * The main method initializes the Spring application context, allowing the application to run.
 *
 * @author josesaidolanogarcia
 */
@SpringBootApplication
public class Application {

	public static void  main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
