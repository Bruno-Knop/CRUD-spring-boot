package com.bruno.struct.hexagonal.adapters.in.consumer;

import com.bruno.struct.hexagonal.adapters.in.consumer.mapper.CustomerMessageMapper;
import com.bruno.struct.hexagonal.adapters.in.consumer.message.CustomerMessage;
import com.bruno.struct.hexagonal.application.ports.in.UpdateCustomerInputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class ReceiveValidateDocumentCustomer {

    @Autowired
    private UpdateCustomerInputPort updateCustomerInputPort;

    @Autowired
    private CustomerMessageMapper customerMessageMapper;

    @KafkaListener(topics = "tp-document-validated", groupId = "bruno")
    public void receive(CustomerMessage customerMessage) {
        var customer = customerMessageMapper.toCustomer(customerMessage);
        updateCustomerInputPort.update(customer, customerMessage.getZipCode());
    }

}
