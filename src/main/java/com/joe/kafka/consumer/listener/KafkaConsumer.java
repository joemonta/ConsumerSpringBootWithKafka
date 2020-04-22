package com.joe.kafka.consumer.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.joe.kafka.consumer.model.User;

@Service
public class KafkaConsumer {

	/*
	 * @KafkaListener(topics = "User_Topic") public void consume(String message) {
	 * System.out.println("Consumed message: " + message); }
	 */


    @KafkaListener(topics = "User_Topic",
            containerFactory = "userKafkaListenerFactory")
    public void consumeJson(User user) {
        System.out.println("Consumed JSON Message: " + user);
    }
}
