package com.study.kafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.study.kafka.model.Order;
import com.study.kafka.service.CustomStream;

@RestController
public class PublishController {
	
	@Autowired
	CustomStream stream;
	
	@RequestMapping(value="/getOrder", method=RequestMethod.POST)
	public @ResponseBody String sendRequest(@RequestBody Order order) {
		stream.dispatchPayload().send(MessageBuilder.withPayload(order).build());
		return "success";
	}

}
