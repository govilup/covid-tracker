package com.covidtracker.model;

import com.covidtracker.entity.constant.Symptom;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Builder
public class SelfAssessmentRequest {

    private Long userId;
    private List<Symptom> symptoms;
    private Boolean travelHistory;
    private Boolean contactWithCovidPatient;

}
