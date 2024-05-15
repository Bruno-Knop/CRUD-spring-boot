package com.bruno.struct.hexagonal.application.ports.in;

import com.bruno.struct.hexagonal.application.core.domain.Customer;

public interface UpdateCustomerInputPort {

    void update(Customer customer, String zipCode);

}
