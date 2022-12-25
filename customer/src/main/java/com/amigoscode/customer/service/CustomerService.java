package com.amigoscode.customer.service;

import com.amigoscode.customer.dto.CustomerDto;
import com.amigoscode.customer.model.Customer;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    public void registerCustomer(CustomerDto customerDto) {
        Customer customer = Customer.builder()
                .firstName(customerDto.firstName())
                .lastName(customerDto.lastName())
                .email(customerDto.email())
                .build();


    }

}
