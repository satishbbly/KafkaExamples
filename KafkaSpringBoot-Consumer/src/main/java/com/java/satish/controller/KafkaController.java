package com.java.satish.controller;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaController {

	@KafkaListener(topics="test",groupId="group_id")
	public String consume( String message) {
		System.out.println("in KafkaController consume" + message);
		

		return "consumes successfully";
	}

	/*
	 * @GetMapping("/publish/{name}") public String
	 * sendUsermessage(@PathVariable("name") String name) {
	 * System.out.println("in KafkaController sendmessage" + name);
	 * 
	 * kfobjecttemplate.send("test", new User(1,name,"Technology",1000));
	 * 
	 * return "published successfully"; }
	 */
}
