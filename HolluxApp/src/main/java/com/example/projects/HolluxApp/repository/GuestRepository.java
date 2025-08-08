package com.example.projects.HolluxApp.repository;

import com.example.projects.HolluxApp.entity.Guest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GuestRepository extends JpaRepository<Guest, Long> {
}