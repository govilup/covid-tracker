package com.covidtracker.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "Address")
public class Address {

    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "house_no")
    private String houseNo;
    private String street;
    private String city;
    private String state;
    @Column(name = "pin_code")
    private Long pinCode;

}
