package no.telenor.test.kafka.kafkademo.rest;


import no.telenor.test.kafka.kafkademo.producer.KafkaProducer;
import no.telenor.test.kafka.kafkademo.producer.model.Order;
import no.telenor.test.kafka.kafkademo.producer.model.SubA;
import no.telenor.test.kafka.kafkademo.producer.model.SubB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    private KafkaProducer messageProducer;

    @PostMapping("/send")
    public String sendMessage(@RequestParam("message") String message) {

        final SubA subA = SubA.builder().subOrderId("somevalue").build();
        final SubB subB = SubB.builder().subOrderId("someothervalue").build();
        final Order order = Order.builder().externalOrderId(message).subA(subA).subB(subB).build();

        messageProducer.sendMessage("test", order);
        return "Message sent: " + message;
    }
}
