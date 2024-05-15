package com.bruno.struct.hexagonal.adapters.in.controller.mapper;

import com.bruno.struct.hexagonal.adapters.in.controller.request.CustomerRequest;
import com.bruno.struct.hexagonal.adapters.in.controller.response.CustomerResponse;
import com.bruno.struct.hexagonal.application.core.domain.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CustomerMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "address", ignore = true)
    @Mapping(target = "isValidDocument", ignore = true)
    Customer toCustomer(CustomerRequest customerRequest);

    CustomerResponse toCustomerResponse(Customer customer);
}
