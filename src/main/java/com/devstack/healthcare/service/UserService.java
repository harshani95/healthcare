package com.devstack.healthcare.service;

import com.devstack.healthcare.dto.request.RequestUserDto;

public interface UserService {
    public void signup(RequestUserDto userDto);
    public boolean verifyUser(String type, String token);
}
