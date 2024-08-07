package no.telenor.test.kafka.kafkademo.consumer;

import no.telenor.test.kafka.kafkademo.consumer.model.Order;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class OrderConsumer {

    @KafkaListener(topics = "test", groupId = "my-group-id", containerFactory = "order")
    public void listen(Order order) {
        System.out.println("Received message: " + order.toString());
    }
}
