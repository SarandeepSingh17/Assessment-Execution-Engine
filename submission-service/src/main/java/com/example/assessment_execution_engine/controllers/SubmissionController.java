package com.example.assessment_execution_engine.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.assessment_execution_engine.kafka.kafkaProducerService;


@RestController
@RequestMapping("/submit")
public class SubmissionController {


    @Autowired
    private kafkaProducerService producer;

    @PostMapping
    public String submit(@RequestBody String code) {
        producer.send(code);
        return "Submitted to Kafka";
    }
}