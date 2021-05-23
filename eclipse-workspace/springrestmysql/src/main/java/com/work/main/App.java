package com.work.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * 
 * @author Anju Prasannan
 *
 */
@SpringBootApplication
@ComponentScan("com.work")
@EntityScan("com.work.entity")
@EnableJpaRepositories("com.work.dao")
public class App {

	/**
	 * Main Method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

}
