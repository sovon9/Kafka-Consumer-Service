package com.kafka.Kafka_Consumer.Service;

import org.apache.kafka.common.serialization.Deserializer;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.kafka.Kafka_Consumer.Service.service.dto.Room;

public class RoomDeserializer implements Deserializer<Room>
{
	
	private ObjectMapper objectMapper = new ObjectMapper();

	@Override
	public Room deserialize(String topic, byte[] data)
	{
		try
		{
			return objectMapper.readValue(data, Room.class);
		}
		catch (Exception e)
		{
			throw new RuntimeException("Failed to deserialize JSON", e);
		}
	}

}
