package com.example.projects.airBnbApp.repository;


import com.example.projects.airBnbApp.entity.Inventory;
import com.example.projects.airBnbApp.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;

public interface InventoryRepository extends JpaRepository<Inventory, Long> {

    void deleteByDateAfterAndRoom(LocalDate date, Room room);
}
