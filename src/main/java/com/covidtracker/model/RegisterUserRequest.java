package com.covidtracker.model;

import com.covidtracker.entity.Address;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class RegisterUserRequest {
    private String userName;
    private Long phoneNumber;
    private Address address;
}
