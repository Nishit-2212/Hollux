package com.example.projects.HolluxApp.repository;

import com.example.projects.HolluxApp.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room, Long> {
}
