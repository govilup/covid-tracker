package com.covidtracker.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class SelfAssessmentResponse {

    private Double riskPercentage;
}
