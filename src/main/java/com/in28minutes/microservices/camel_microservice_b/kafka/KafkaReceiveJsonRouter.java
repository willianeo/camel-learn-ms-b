package com.in28minutes.microservices.camel_microservice_b.kafka;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class KafkaReceiveJsonRouter extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		from("kafka:myKafkaTopic")
		.to("log:received-message-from-kafka"); 
	}
}




