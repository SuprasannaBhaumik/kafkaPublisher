package com.study.kafka.service;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface CustomStream {
	
	@Output("xyz")
	MessageChannel dispatchPayload();

}
