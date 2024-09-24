package com.kafka.Kafka_Consumer.Service.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.kafka.Kafka_Consumer.Service.service.dto.Room;

@Service
public class KafkaConsumerService
{
//	@KafkaListener(topics = "PMS", groupId = "room-update")
//	public void consume(String message)
//	{
//		System.out.println("Consuming message : "+message);
//	}
	
	@KafkaListener(topics = "PMS1", groupId = "room-update")
	public void consume(Room room)
	{
		System.out.println("Consuming message : "+room);
	}
}
