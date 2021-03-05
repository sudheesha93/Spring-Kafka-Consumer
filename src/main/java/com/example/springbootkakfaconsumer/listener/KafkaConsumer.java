package com.example.springbootkakfaconsumer.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    // when there is some data on the topic this particular kafta listener is triggered
    @KafkaListener(topics ="KAFKA_CONSUMER_TOPIC", groupId ="group_id")
    public void consume(String message){
        System.out.println(message);
    }
}
