package com.ironhack.lab6before_fork.repository;

import com.ironhack.lab6before_fork.enums.CustomerStatus;
import com.ironhack.lab6before_fork.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

    List<Customer> findByCustomerStatus(CustomerStatus customerStatus);

    @Query ("SELECT c FROM Customer c WHERE c.milagestFlight > :minMillage")
    List<Object[]> findByCustomerNameAndMillageFlight(@Param("minMillage") Long minMillage);
}


