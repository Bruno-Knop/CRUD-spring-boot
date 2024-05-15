package com.bruno.struct.hexagonal.application.ports.out;

import com.bruno.struct.hexagonal.application.core.domain.Address;

public interface FindAddressByZipCodeOutputPort {

    Address find(String zipCode);

}
