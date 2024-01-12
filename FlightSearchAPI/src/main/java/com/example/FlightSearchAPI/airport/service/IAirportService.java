package com.example.FlightSearchAPI.airport.service;
import com.example.FlightSearchAPI.airport.DTO.AirportDTO;
import com.example.FlightSearchAPI.airport.entity.Airport;
import java.util.List;

public interface IAirportService {
    public void addAirport(AirportDTO airportDTO);
    public List<AirportDTO> getAllAirports();

    public AirportDTO updateAirport(AirportDTO airportDTO);

    public void deleteAirport(Long id);



}
