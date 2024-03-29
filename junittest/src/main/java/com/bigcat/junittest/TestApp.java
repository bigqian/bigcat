package com.bigcat.junittest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@EnableAutoConfiguration
public class TestApp {

	public static void main(String[] args) {
		SpringApplication.run(TestApp.class, args);
	}
}
