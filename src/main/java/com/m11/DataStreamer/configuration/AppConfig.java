package com.m11.DataStreamer.configuration;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("application")
@Data
public class AppConfig {
    private KafkaConfig kafka;
}
