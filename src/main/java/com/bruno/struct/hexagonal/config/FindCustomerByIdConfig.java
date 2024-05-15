package com.bruno.struct.hexagonal.config;

import com.bruno.struct.hexagonal.adapters.out.FindCustomerByIdAdapter;
import com.bruno.struct.hexagonal.application.core.usercase.FindCustomerByIdUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FindCustomerByIdConfig {

    @Bean
    public FindCustomerByIdUseCase findCustomerByIdUseCase(
        FindCustomerByIdAdapter findCustomerByIdAdapter
    ) {
        return new FindCustomerByIdUseCase(findCustomerByIdAdapter);
    }

}
