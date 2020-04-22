package com.joe.kafka.consumer.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.joe.kafka.consumer.entity.Address;

@Service
public class KafkaConsumer {

	/*
	 * @KafkaListener(topics = "User_Topic") public void consume(String message) {
	 * System.out.println("Consumed message: " + message); }
	 */


    @KafkaListener(topics = "Address_Topic",
            containerFactory = "addressKafkaListenerFactory")
    public void consumeJson(Address address) {
        System.out.println("Consumed JSON Message: " + address);
    }
}
