package com.bruno.struct.hexagonal.application.core.usercase;

import com.bruno.struct.hexagonal.application.core.domain.Customer;
import com.bruno.struct.hexagonal.application.ports.in.InsertCustomerInputPort;
import com.bruno.struct.hexagonal.application.ports.out.FindAddressByZipCodeOutputPort;
import com.bruno.struct.hexagonal.application.ports.out.InsertCustomerOutputPort;
import com.bruno.struct.hexagonal.application.ports.out.SendDocumentForValidationOutputPort;

public class InsertCustomerUseCase implements InsertCustomerInputPort {

    private final FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort;

    private final InsertCustomerOutputPort insertCustomerOutputPort;

    private final SendDocumentForValidationOutputPort sendDocumentForValidationOutputPort;

    public InsertCustomerUseCase(
            FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort,
            InsertCustomerOutputPort insertCustomerOutputPort,
            SendDocumentForValidationOutputPort sendDocumentForValidationOutputPort
    ) {
        this.findAddressByZipCodeOutputPort = findAddressByZipCodeOutputPort;
        this.insertCustomerOutputPort = insertCustomerOutputPort;
        this.sendDocumentForValidationOutputPort = sendDocumentForValidationOutputPort;
    }

    @Override
    public void insert(Customer customer, String zipCode) {
        var address = findAddressByZipCodeOutputPort.find(zipCode);
        customer.setAddress(address);
        insertCustomerOutputPort.insert(customer);
        sendDocumentForValidationOutputPort.send(customer.getDocument());
    }
}
