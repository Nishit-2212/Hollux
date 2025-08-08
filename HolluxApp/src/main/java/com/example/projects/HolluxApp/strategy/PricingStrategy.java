package com.example.projects.HolluxApp.strategy;


import com.example.projects.HolluxApp.entity.Inventory;

import java.math.BigDecimal;
public interface PricingStrategy {

    BigDecimal calculatePrice(Inventory inventory);
}
