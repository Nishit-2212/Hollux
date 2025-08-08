package com.example.projects.HolluxApp.service;


import com.example.projects.HolluxApp.dto.ProfileUpdateRequestDto;
import com.example.projects.HolluxApp.dto.UserDto;
import com.example.projects.HolluxApp.entity.User;

public interface UserService {

    User getUserById(Long id);

    void updateProfile(ProfileUpdateRequestDto profileUpdateRequestDto);

    UserDto getMyProfile();
}
