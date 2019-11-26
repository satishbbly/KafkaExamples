package com.java.satish.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.java.satish.model.User;

@RestController
public class KafkaController {
	
	/*
	 * @Autowired KafkaTemplate<String, String> kftemplate;
	 */
	
	@Autowired
	KafkaTemplate<String, User> kfobjecttemplate;

	/*
	 * @GetMapping("/message/{message}") public String
	 * sendmessage(@PathVariable("message") String message) {
	 * System.out.println("in KafkaController sendmessage" + message);
	 * kftemplate.send("test", message);
	 * 
	 * return "published successfully"; }
	 */
	
	@GetMapping("/publish/{name}")
	public String sendUsermessage(@PathVariable("name") String name) {
		System.out.println("in KafkaController sendmessage" + name);
		
		kfobjecttemplate.send("test", new User(1,name,"Technology",1000));
		
		return "published successfully";
	}	
}
