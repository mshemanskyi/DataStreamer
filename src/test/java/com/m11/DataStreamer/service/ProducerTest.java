package com.m11.DataStreamer.service;

import com.m11.DataStreamer.configuration.AppConfig;
import com.m11.DataStreamer.configuration.KafkaConfig;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.kafka.core.KafkaTemplate;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;


public class ProducerTest {

    @Mock
    KafkaTemplate<String, String> kafkaTemplate;

    @Mock
    AppConfig appConfig;

    @InjectMocks
    Producer producer;

    @BeforeEach
    void setUp() {
        initMocks(this);
    }

    @Test
    public void testSendMessage() {
        KafkaConfig kafkaConfig = new KafkaConfig();
        kafkaConfig.setTopic("topic1");
        appConfig.setKafka(kafkaConfig);
        when(appConfig.getKafka()).thenReturn(kafkaConfig);

        producer.sendMessage("hello");


        verify(kafkaTemplate, times(1)).send("topic1", "hello");
    }
}