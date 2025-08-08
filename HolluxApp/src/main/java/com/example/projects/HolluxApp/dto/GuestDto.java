package com.example.projects.HolluxApp.dto;

import com.example.projects.HolluxApp.entity.User;
import com.example.projects.HolluxApp.entity.enums.Gender;
import lombok.Data;

@Data
public class GuestDto {
    private Long id;
    private User user;
    private String name;
    private Gender gender;
    private Integer age;
}
