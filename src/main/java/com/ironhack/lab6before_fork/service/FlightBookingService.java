package com.ironhack.lab6before_fork.service;

import com.ironhack.lab6before_fork.model.FlightBooking;
import com.ironhack.lab6before_fork.repository.FlightBookingRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlightBookingService {

    private final FlightBookingRepository flightBookingRepository;

    public FlightBookingService(FlightBookingRepository flightBookingRepository) {
        this.flightBookingRepository = flightBookingRepository;
    }

    public List<FlightBooking> getCusomerId (Integer customerId) {
        return flightBookingRepository.findByCustomerId(customerId);
    }

    public List<FlightBooking> getFlightId (Integer flightId) {
        return flightBookingRepository.findByFlightId(flightId);
    }

}

