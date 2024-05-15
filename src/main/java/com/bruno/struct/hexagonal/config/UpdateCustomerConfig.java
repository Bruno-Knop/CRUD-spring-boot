package com.bruno.struct.hexagonal.config;

import com.bruno.struct.hexagonal.adapters.out.FindAddressByZipCodeAdapter;
import com.bruno.struct.hexagonal.adapters.out.UpdateCustomerAdapter;
import com.bruno.struct.hexagonal.application.core.usercase.FindCustomerByIdUseCase;
import com.bruno.struct.hexagonal.application.core.usercase.UpdateCustomerUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UpdateCustomerConfig {

    @Bean
    public UpdateCustomerUseCase updateCustomerUseCase(
            FindCustomerByIdUseCase findCustomerByIdUseCase,
            FindAddressByZipCodeAdapter findAddressByZipCodeAdapter,
            UpdateCustomerAdapter updateCustomerAdapter
    ) {
        return  new UpdateCustomerUseCase(findCustomerByIdUseCase, findAddressByZipCodeAdapter, updateCustomerAdapter);
    }
}
