package com.amigoscode.customer.controller;

import com.amigoscode.customer.dto.CustomerDto;
import com.amigoscode.customer.service.CustomerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("api/v1/customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;
    @PostMapping
    public void registerCustomer(@RequestBody CustomerDto customerDto) {
        log.info("new customer registration {}", customerDto);
        customerService.registerCustomer(customerDto);
    }
}
