package com.example.projects.airBnbApp.service;


import com.example.projects.airBnbApp.dto.BookingDto;
import com.example.projects.airBnbApp.dto.BookingRequest;
import com.example.projects.airBnbApp.dto.GuestDto;

import java.util.List;

public interface BookingService {

    BookingDto initialiseBooking(BookingRequest bookingRequest);

    BookingDto addGuests(Long bookingId, List<GuestDto> guestDtoList);
}
