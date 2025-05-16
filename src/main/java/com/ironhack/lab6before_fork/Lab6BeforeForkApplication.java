package com.ironhack.lab6before_fork;

import com.ironhack.lab6before_fork.enums.CustomerStatus;
import com.ironhack.lab6before_fork.model.Customer;
import com.ironhack.lab6before_fork.model.Flight;
import com.ironhack.lab6before_fork.model.FlightBooking;
import com.ironhack.lab6before_fork.repository.CustomerRepository;
import com.ironhack.lab6before_fork.repository.FlightBookingRepository;
import com.ironhack.lab6before_fork.repository.FlightRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class Lab6BeforeForkApplication {

    public static void main(String[] args) {
        SpringApplication.run(Lab6BeforeForkApplication.class, args);
    }

    @Bean
    public CommandLineRunner run(CustomerRepository customerRepository,
                                 FlightRepository flightRepository,
                                 FlightBookingRepository flightBookingRepository) {
        return args -> {
            Customer customer1 = new Customer(null, "Marco", CustomerStatus.GOLD, 10000);
            customerRepository.save(customer1);
            Customer customer2 = new Customer(null, "Lisa", CustomerStatus.GOLD, 20000);
            customerRepository.save(customer2);
            Customer customer3 = new Customer(null, "Kevin", CustomerStatus.SILVER, 30000);
            customerRepository.save(customer3);

            Flight flight1 = new Flight(null, "DL143", "Boeing 747", 400, 135);
            flightRepository.save(flight1);
            Flight flight2 = new Flight(null, "DL122", "Airbus A330", 236, 4370);
            flightRepository.save(flight2);
            Flight flight3 = new Flight(null, "DL53", "Airbus A330", 236, 2078);
            flightRepository.save(flight3);

            FlightBooking booking1 = new FlightBooking(null, customer1.getCustomerId(), flight1.getFlightId());
            flightBookingRepository.save(booking1);
            FlightBooking booking2 = new FlightBooking(null, customer2.getCustomerId(), flight2.getFlightId());
            flightBookingRepository.save(booking2);
            FlightBooking booking3 = new FlightBooking(null, customer3.getCustomerId(), flight3.getFlightId());
            flightBookingRepository.save(booking3);

            System.out.println("All flights booked!");

        };


    }
}