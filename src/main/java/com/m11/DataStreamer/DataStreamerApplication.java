package com.m11.DataStreamer;

import com.m11.DataStreamer.service.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.m11.DataStreamer")
public class DataStreamerApplication {

	@Autowired
	Producer producer;

	public static void main(String[] args) {
		SpringApplication.run(DataStreamerApplication.class, args);
	}

}
