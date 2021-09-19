package com.covidtracker.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@Entity
@Table(name = "User")
public class User {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    @Column(name = "mobile_no")
    private Long mobileNo;
    private Address address;
    private LocalDateTime createdDateTime;
    @OneToMany(mappedBy = "user")
    private SelfAssessment selfAssessment;

}
