package com.bruno.struct.hexagonal.application.ports.in;

import com.bruno.struct.hexagonal.application.core.domain.Customer;

public interface InsertCustomerInputPort {

    void insert(Customer customer, String zipCode);

}
