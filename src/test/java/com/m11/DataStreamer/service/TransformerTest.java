package com.m11.DataStreamer.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.times;
import static org.mockito.MockitoAnnotations.initMocks;

public class TransformerTest {

    @InjectMocks
    Transformer transformer;

    @Mock
    Producer producer;

    @BeforeEach
    void setUp() {
        initMocks(this);
    }

    @Test
    public void testTransform() {
        transformer.reverse("hello");

        verify(producer, times(1)).sendMessage("olleh");
    }
}