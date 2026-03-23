package com.example.assessment_execution_engine.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class kafkaConsumerService {
    
    @KafkaListener(topics = "submission-topic")
    public void consume(String message) {
        String result = service.execute(message);
        System.out.println(result);
    }
}
