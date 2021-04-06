package com.m11.DataStreamer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Transformer {

    @Autowired
    Producer producer;

    public void reverse(String msg) {
        producer.sendMessage(new StringBuilder(msg).reverse().toString());
    }
}
