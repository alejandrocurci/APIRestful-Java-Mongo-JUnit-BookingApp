package com.desafio.reservas.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.LocalDate;

@Data
@Document(collection = "hotels")
public class Hotel {
    @Id
    private String id;
    @Field(name = "hotel_code")
    private String hotelCode;
    private String name;
    private String city;
    @Field(name = "room_type")
    private String roomType;
    private double price;
    @Field(name = "available_from")
    private LocalDate availableFrom;
    @Field(name = "available_to")
    private LocalDate availableTo;
    private boolean reserved;
}
