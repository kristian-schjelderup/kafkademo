package no.telenor.test.kafka.kafkademo.producer.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Order {
    private String externalOrderId;
    private SubA subA;
    private SubB subB;
}
