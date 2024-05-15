package com.bruno.struct.hexagonal.config;

import com.bruno.struct.hexagonal.adapters.out.DeleteCustomerByIdAdapter;
import com.bruno.struct.hexagonal.application.core.usercase.DeleteCustomerByIdUseCase;
import com.bruno.struct.hexagonal.application.core.usercase.FindCustomerByIdUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DeleteCustomerByIdConfig {

    @Bean
    public DeleteCustomerByIdUseCase deleteCustomerByIdUseCase(
            FindCustomerByIdUseCase findCustomerByIdUseCase,
            DeleteCustomerByIdAdapter deleteCustomerByIdAdapter
    ) {
        return new DeleteCustomerByIdUseCase(findCustomerByIdUseCase, deleteCustomerByIdAdapter);
    }
}
