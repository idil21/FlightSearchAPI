package com.example.FlightSearchAPI.flight.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FlightDTO {
    private Long id;
    private Long departureAirportId;
    private Long arrivalAirportId;
    private Date departureDate;
    private Date returnDate;
}
