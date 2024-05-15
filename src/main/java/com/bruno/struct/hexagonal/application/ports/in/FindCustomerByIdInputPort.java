package com.bruno.struct.hexagonal.application.ports.in;

import com.bruno.struct.hexagonal.application.core.domain.Customer;

public interface FindCustomerByIdInputPort {

    Customer find(String id);

}
