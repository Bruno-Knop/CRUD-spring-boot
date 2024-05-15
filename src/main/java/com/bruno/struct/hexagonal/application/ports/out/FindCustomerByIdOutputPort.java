package com.bruno.struct.hexagonal.application.ports.out;

import com.bruno.struct.hexagonal.application.core.domain.Customer;

import java.util.Optional;

public interface FindCustomerByIdOutputPort {

    Optional<Customer> find(String id);

}
