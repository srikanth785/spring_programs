package com.cat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;

import com.cat.model.Customer;
import com.cat.util.AppConstants;

@SpringBootApplication
public class ApacheKafkaSpringBootConsumeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApacheKafkaSpringBootConsumeApplication.class, args);
	}
	
	@KafkaListener(topics = AppConstants.TOPIC_NAME, groupId = "group_cat_customer")
	public void subscribeMsg(String cxData) {
	    System.out.println("***Msg Received from Kafka***");
	    System.out.println(cxData);
	}
//	@KafkaListener(topics = AppConstants.TOPIC_NAME, groupId = "group_cat_customer")
//	public void listen(Object data) {
//	    System.out.println(" Received message from Kafka: " + data);
//	}
}
