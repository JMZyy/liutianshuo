package edu.czjt.reggie.service;


import org.springframework.amqp.rabbit.annotation.RabbitListener;

import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;



@Service
public class QueueConsumer {
    @RabbitListener(queues = {"ss007"})
    public void receive(@Payload String fileBody) {
        System.out.println("消费Rabbit的ss007队列：" + fileBody);
    }



}
