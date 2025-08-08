package com.example.projects.HolluxApp.service;

import com.example.projects.HolluxApp.entity.Booking;

public interface CheckoutService {

    String getCheckoutSession(Booking booking, String successUrl, String failureUrl);

}
