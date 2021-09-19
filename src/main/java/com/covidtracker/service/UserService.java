package com.covidtracker.service;

import com.covidtracker.model.SelfAssessmentRequest;
import com.covidtracker.model.SelfAssessmentResponse;
import org.springframework.stereotype.Service;

/**
 * Service to manager User service.
 */

@Service
public interface UserService {

    /**
     * Take self assessment.
     *
     * @param selfAssessmentRequest request to take self assessment
     * @return Self assessment response, risk percent.
     */
    SelfAssessmentResponse takeSelfAssessment(SelfAssessmentRequest selfAssessmentRequest);
}
