package no.telenor.test.kafka.kafkademo.consumer;

import no.telenor.test.kafka.kafkademo.producer.model.Order;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class StringConsumer {

    @KafkaListener(topics = "my-topic", groupId = "my-group-id", containerFactory = "string")
    public void listen(String message) {
        System.out.println("Received message: " + message);
    }
}
