package com.bruno.struct.hexagonal.adapters.in.controller.response;

import com.bruno.struct.hexagonal.application.core.domain.Address;
import lombok.Data;

@Data
public class CustomerResponse {

    private String name;

    private Address address;

    private String document;

    private Boolean isValidDocument;

}
