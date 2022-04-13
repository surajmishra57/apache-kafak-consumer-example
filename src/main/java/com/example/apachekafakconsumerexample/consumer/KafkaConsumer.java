package com.example.apachekafakconsumerexample.consumer;

import org.springframework.kafka.annotation.KafkaListener;

public class KafkaConsumer {
    @KafkaListener(topics = "NewTopic",groupId = "group_id")

    public void consume(String messages)
    {
        System.out.println("Woriking");
        System.out.println("messages : " + messages);
    }
}
