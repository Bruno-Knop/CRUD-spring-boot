package com.bruno.struct.hexagonal.application.ports.out;

public interface SendDocumentForValidationOutputPort {

    void send(String document);

}
