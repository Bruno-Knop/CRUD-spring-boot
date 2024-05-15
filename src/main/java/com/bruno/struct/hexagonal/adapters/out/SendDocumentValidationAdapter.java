package com.bruno.struct.hexagonal.adapters.out;

import com.bruno.struct.hexagonal.application.ports.out.SendDocumentForValidationOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;

public class SendDocumentValidationAdapter implements SendDocumentForValidationOutputPort {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @Override
    public void send(String document) {
        kafkaTemplate.send("tp-document-validation", document);
    }
}
