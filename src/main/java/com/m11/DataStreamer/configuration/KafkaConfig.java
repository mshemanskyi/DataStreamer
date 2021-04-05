package com.m11.DataStreamer.configuration;

import lombok.Data;
import org.springframework.context.annotation.Configuration;

@Configuration
@Data
public class KafkaConfig {
    private String bootstrapServers;
    private String topic;
}
