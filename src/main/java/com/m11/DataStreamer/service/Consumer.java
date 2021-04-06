package com.m11.DataStreamer.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class Consumer {
    @KafkaListener(topics ="data.events.v1", groupId = "data.streamer-1")
    public void listener(String message) {
        log.info("Transformed Message: " + message);
    }
}
