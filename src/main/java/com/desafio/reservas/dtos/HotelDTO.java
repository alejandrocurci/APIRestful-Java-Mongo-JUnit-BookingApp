package com.desafio.reservas.dtos;

import lombok.Data;

@Data
public class HotelDTO {
    private String hotelCode;
    private String name;
    private String city;
    private String roomType;
    private double price;
    private String availableFrom;
    private String availableTo;
}
