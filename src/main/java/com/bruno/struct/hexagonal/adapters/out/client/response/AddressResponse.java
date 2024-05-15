package com.bruno.struct.hexagonal.adapters.out.client.response;

import lombok.Data;

@Data
public class AddressResponse {
    private String strict;

    private String city;

    private String state;
}
