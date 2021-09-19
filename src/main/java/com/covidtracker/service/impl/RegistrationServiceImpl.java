package com.covidtracker.service.impl;

import com.covidtracker.converter.Converter;
import com.covidtracker.entity.User;
import com.covidtracker.model.RegisterUserRequest;
import com.covidtracker.model.RegisterUserResponse;
import com.covidtracker.repository.UserRepository;
import com.covidtracker.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistrationServiceImpl implements RegistrationService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public RegisterUserResponse registerUser(RegisterUserRequest registerUserRequest) {
        User user = userRepository.registerUser(Converter.toUser(registerUserRequest));
        return Converter.toUserResponse(user.getId());
    }

}
