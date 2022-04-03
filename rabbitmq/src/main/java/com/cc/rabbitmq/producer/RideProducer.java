package com.cc.rabbitmq.producer;

import com.cc.rabbitmq.entity.RideDTO;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class RideProducer {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @PostMapping("/new_ride")
    public String bookRide(@RequestBody RideDTO ride){
        rabbitTemplate.convertAndSend("cc","cc_1",ride);
        rabbitTemplate.convertAndSend("cc","cc_2",ride);
        return "produced";
    }



}
