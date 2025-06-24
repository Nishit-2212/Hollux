package com.example.projects.airBnbApp.service;


import com.example.projects.airBnbApp.dto.HotelDto;
import com.example.projects.airBnbApp.dto.HotelSearchRequest;
import com.example.projects.airBnbApp.entity.Room;
import org.springframework.data.domain.Page;

public interface InventoryService {

    void initializeRoomForAYear(Room room);

    void deleteAllInventories(Room room);

    Page<HotelDto> searchHotels(HotelSearchRequest hotelSearchRequest);
}
