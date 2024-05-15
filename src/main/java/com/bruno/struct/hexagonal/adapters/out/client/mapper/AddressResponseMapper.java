package com.bruno.struct.hexagonal.adapters.out.client.mapper;

import com.bruno.struct.hexagonal.adapters.out.client.response.AddressResponse;
import com.bruno.struct.hexagonal.application.core.domain.Address;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressResponseMapper {

    Address toAddress(AddressResponse addressResponse);

}
