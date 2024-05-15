package com.bruno.struct.hexagonal.config;

import com.bruno.struct.hexagonal.adapters.out.FindAddressByZipCodeAdapter;
import com.bruno.struct.hexagonal.adapters.out.InsertCustomerAdapter;
import com.bruno.struct.hexagonal.application.core.usercase.InsertCustomerUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InsertCustomerConfig {

    @Bean
    public InsertCustomerUseCase insertCustomerUseCase(
        FindAddressByZipCodeAdapter  findAddressByZipCodeAdapter,
        InsertCustomerAdapter insertCustomerAdapter
    ) {
        return new InsertCustomerUseCase(findAddressByZipCodeAdapter, insertCustomerAdapter);
    }

}
