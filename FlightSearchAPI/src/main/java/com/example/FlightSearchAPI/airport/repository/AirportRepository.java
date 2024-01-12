package com.example.FlightSearchAPI.airport.repository;

import com.example.FlightSearchAPI.airport.entity.Airport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
public interface AirportRepository extends JpaRepository<Airport,Long> {
}
