package com.ironhack.lab6before_fork.model;

import com.ironhack.lab6before_fork.enums.CustomerStatus;
import jakarta.persistence.*;

@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer customerId;

    private String customerName;
    @Enumerated(EnumType.STRING)
    private CustomerStatus customerStatus;
    private Integer milagestFlight;


    public Customer() {
    }

    public Customer(Integer customerId, String customerName, CustomerStatus customerStatus, Integer milagesFlight) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerStatus = customerStatus;
        this.milagestFlight = milagesFlight;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public CustomerStatus getCustomerStatus() {
        return customerStatus;
    }

    public void setCustomerStatus(CustomerStatus customerStatus) {
        this.customerStatus = customerStatus;
    }

    public Integer getMilagestFlight() {
        return milagestFlight;
    }

    public void setMilagestFlight(Integer milagesFlight) {
        this.milagestFlight = milagesFlight;
    }
}
