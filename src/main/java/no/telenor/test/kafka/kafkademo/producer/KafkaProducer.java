package no.telenor.test.kafka.kafkademo.producer;

import no.telenor.test.kafka.kafkademo.producer.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class KafkaProducer {

    @Autowired
    private KafkaTemplate<String, Order> kafkaTemplate;

    public void sendMessage(String topic, Order order) {
        kafkaTemplate.send(topic, order);
    }
}
