package com.nttdata.apirestpromotions.service;

import com.nttdata.apirestpromotions.dto.CustomerDto;
import com.nttdata.apirestpromotions.events.CustomerCreatedEvent;
import com.nttdata.apirestpromotions.events.Event;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class
CustomerEventsService {

    @KafkaListener(
            topics = "${topic.customer.name:customers}",
            containerFactory = "kafkaListenerContainerFactory",
            groupId = "group_id")
    public void consume(String message) {
        System.out.println("Consumed message: " + message);
    }

  /*  @KafkaListener(
            topics = "${topic.customer.name:customers}",
            containerFactory = "userKafkaListenerFactory",
            groupId = "group_json")
    public void consumeJson(CustomerDto customerDto) {
        System.out.println("Consumed JSON Message: " + customerDto);
    }*/


}
