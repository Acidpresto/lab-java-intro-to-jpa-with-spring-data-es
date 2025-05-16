package com.ironhack.lab6before_fork.controller;

import com.ironhack.lab6before_fork.model.Customer;
import com.ironhack.lab6before_fork.model.Flight;
import com.ironhack.lab6before_fork.model.FlightBooking;
import com.ironhack.lab6before_fork.service.FlightBookingService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/flights")
public class FlightBookingController {

    private final FlightBookingService flightBookingService;

    public FlightBookingController(FlightBookingService flightBookingService) {
        this.flightBookingService = flightBookingService;
    }

    @GetMapping("/id")
    public List<FlightBooking> findByCustomerId(@RequestParam Integer customerId) {
        return flightBookingService.getCusomerId(customerId);
    }

    @GetMapping("fi-d")
    public List<FlightBooking> findByFlightId(@RequestParam Integer flightId) {
        return flightBookingService.getFlightId(flightId);
    }

}
