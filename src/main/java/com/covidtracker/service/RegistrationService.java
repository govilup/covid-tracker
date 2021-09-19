package com.covidtracker.service;

import com.covidtracker.model.RegisterUserRequest;
import com.covidtracker.model.RegisterUserResponse;
import org.springframework.stereotype.Service;

@Service
public interface RegistrationService {

    /**
     * Register user.
     *
     * @param registerUserRequest request to register user
     * @return response with user id.
     */
    RegisterUserResponse registerUser(RegisterUserRequest registerUserRequest);
}
