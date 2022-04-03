package com.cc.rabbitmq.consumer;

import com.cc.rabbitmq.entity.RideDTO;
import com.cc.rabbitmq.repository.RideRepository;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RideConsumer {

    @Autowired
    private RideRepository repository;

    @RabbitListener(queues = "ride_matching")
    public void consumeMessageFromQueue(RideDTO rideDTO){
        System.out.println("Message Received From Queue: "+ rideDTO);
    }

    @RabbitListener(queues = "database")
    public void consumeMessageFromQueue2(RideDTO ride){
        repository.save(ride);
        System.out.println("Message Received From Queue: "+ ride);
    }


}
