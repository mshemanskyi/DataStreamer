package com.m11.DataStreamer.service;

import com.m11.DataStreamer.configuration.AppConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class Producer {
    @Autowired
    AppConfig appConfig;

    @Autowired
    KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessage(String msg) {
        kafkaTemplate.send(appConfig.getKafka().getTopic(), msg);
    }
}
