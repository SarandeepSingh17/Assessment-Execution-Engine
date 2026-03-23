package com.example.assessment_execution_engine.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class kafkaProducerService {
    
    @Autowired
    private KafkaTemplate<String,String> kafkaTemplate;

    public void send(String message){
        kafkaTemplate.send("submission-topic",message);
    }
}
