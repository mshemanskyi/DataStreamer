package com.m11.DataStreamer.controller;

import com.m11.DataStreamer.service.Transformer;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class BaseController {

    @Autowired
    Transformer transformer;

    @PostMapping("/transform")
    @ResponseStatus(HttpStatus.OK)
    @Operation(summary = "Reverse message and send to kafka")
    public void transformation(@RequestBody String msg) {
        transformer.reverse(msg);
    }
}
