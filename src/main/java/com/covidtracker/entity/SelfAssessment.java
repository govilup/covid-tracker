package com.covidtracker.entity;

import com.covidtracker.entity.constant.Symptom;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Builder
@Entity
@Table(name = "Self_Assessment")
public class SelfAssessment {

    @Id
    private Long id;

    @ManyToOne
    private User user;
    private List<Symptom> symptoms;
    private Boolean travelHistory;
    private Boolean contactWithCovidPatient;
    private LocalDateTime createdDateTime;
}
