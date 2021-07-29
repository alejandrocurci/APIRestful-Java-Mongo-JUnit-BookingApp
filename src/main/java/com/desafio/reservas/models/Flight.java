package com.desafio.reservas.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.LocalDate;

@Data
@Document(collection = "flights")
public class Flight {
    @Id
    private String id;
    @Field("flight_number")
    private String flightNumber;
    private String origin;
    private String destination;
    @Field("seat_type")
    private String seatType;
    @Field("seat_price")
    private double seatPrice;
    @Field("date_from")
    private LocalDate dateFrom;
    @Field("date_to")
    private LocalDate dateTo;
}
