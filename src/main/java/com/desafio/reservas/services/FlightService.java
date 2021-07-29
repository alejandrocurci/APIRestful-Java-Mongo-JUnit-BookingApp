package com.desafio.reservas.services;

import com.desafio.reservas.dtos.*;
import com.desafio.reservas.exceptions.FlightException;
import com.desafio.reservas.exceptions.HotelException;

import java.util.List;
import java.util.Map;

public interface FlightService {

    public void addNewFlight(FlightDTO flightDTO) throws FlightException;

    public List<FlightFormatDTO> listFlightsAvailable(Map<String, String> params) throws FlightException;

    public ResponseFlightDTO performReservation(PayloadFlightDTO payload) throws FlightException;

}
