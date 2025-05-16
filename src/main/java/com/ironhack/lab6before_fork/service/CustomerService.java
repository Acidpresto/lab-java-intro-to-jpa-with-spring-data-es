package com.ironhack.lab6before_fork.service;

import com.ironhack.lab6before_fork.enums.CustomerStatus;
import com.ironhack.lab6before_fork.model.Customer;
import com.ironhack.lab6before_fork.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

   public List<Customer> findByCustomerStatus(CustomerStatus customerStatus) {
        return customerRepository.findByCustomerStatus(customerStatus);
   }

   public List<Object[]> findByCustomerNameAndMillageFlight(Long minMillage){
        return customerRepository.findByCustomerNameAndMillageFlight(minMillage);
   }

}
