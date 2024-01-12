package com.example.FlightSearchAPI.airport.service;

import com.example.FlightSearchAPI.airport.repository.AirportRepository;
import com.example.FlightSearchAPI.airport.entity.Airport;
import com.example.FlightSearchAPI.airport.DTO.AirportDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import org.modelmapper.ModelMapper;

import java.util.List;

@Service
public class AirportService implements IAirportService {
    @Autowired
    private AirportRepository airportRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public void addAirport(AirportDTO airportDTO){
        Airport airport = modelMapper.map(airportDTO, Airport.class);
        airportRepository.save(airport);
    }

    @Override
    public List<AirportDTO> getAllAirports() {
        return null;
    }

    @Override
    public AirportDTO updateAirport(AirportDTO airportDTO) {
        return null;
    }

    @Override
    public void deleteAirport(Long id) {

    }
}
