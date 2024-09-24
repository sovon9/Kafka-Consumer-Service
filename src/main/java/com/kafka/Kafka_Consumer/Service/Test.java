package com.kafka.Kafka_Consumer.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.kafka.Kafka_Consumer.Service.service.dto.Room;

public class Test
{

	public static void main(String[] args) throws JsonMappingException, JsonProcessingException
	{
		ObjectMapper mapper = new ObjectMapper();
		String json = "{\"roomNum\":0,\"roomStatus\":null,\"guestID\":1234,\"ratePlan\":null,\"roomDesc\":null,\"floor\":0}";
		Room room = mapper.readValue(json, Room.class);
		System.out.println(room);

	}

}
