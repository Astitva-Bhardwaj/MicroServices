package com.example.hotel.services;

import com.example.hotel.entities.Hotel;

import java.util.List;

public interface HotelService {

    //Create
    Hotel create(Hotel hotel);

    //Get All
    List<Hotel> getAll();

    //Get Single
    Hotel get(String id);
}
