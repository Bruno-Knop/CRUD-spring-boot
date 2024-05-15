package com.bruno.struct.hexagonal.application.ports.out;

import com.bruno.struct.hexagonal.application.core.domain.Customer;

public interface UpdateCustomerOutputPort {

    void update(Customer customer);

}
