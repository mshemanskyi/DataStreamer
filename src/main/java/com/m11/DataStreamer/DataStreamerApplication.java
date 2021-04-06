package com.m11.DataStreamer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.m11.DataStreamer")
public class DataStreamerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DataStreamerApplication.class, args);
	}

}
