package com.ironhack.lab6before_fork.controller;

import com.ironhack.lab6before_fork.enums.CustomerStatus;
import com.ironhack.lab6before_fork.model.Customer;
import com.ironhack.lab6before_fork.service.CustomerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/flights/customer")
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/status")
    public List<Customer> getCustomerStatus(@RequestParam CustomerStatus customerStatus) {
        return customerService.findByCustomerStatus(customerStatus);
    }

    @GetMapping("/millage")
    public List<Object[]> findByCustomerNameAndMillageFlight(@RequestParam Long minMillage) {
        return customerService.findByCustomerNameAndMillageFlight(minMillage);
    }
}
