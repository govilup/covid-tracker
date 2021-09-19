package com.covidtracker.service.impl;

import com.covidtracker.converter.Converter;
import com.covidtracker.entity.SelfAssessment;
import com.covidtracker.entity.User;
import com.covidtracker.model.SelfAssessmentRequest;
import com.covidtracker.model.SelfAssessmentResponse;
import com.covidtracker.repository.SelfAssessmentRepository;
import com.covidtracker.repository.UserRepository;
import com.covidtracker.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private SelfAssessmentRepository selfAssessmentRepository;

    @Autowired
    private UserRepository userRepository;

    @Override
    public SelfAssessmentResponse takeSelfAssessment(SelfAssessmentRequest selfAssessmentRequest) {
        User user = userRepository.getUserById(selfAssessmentRequest.getUserId());
        SelfAssessment selfAssessment = selfAssessmentRepository.saveSelfAssessment(Converter.toSelfAssessment(selfAssessmentRequest, user));

        double riskpercent = calculateRisk(selfAssessmentRequest);

        return Converter.toSelfAssessmentResponse(riskpercent);
    }

    private double calculateRisk(SelfAssessmentRequest selfAssessmentRequest) {

        if(!selfAssessmentRequest.getContactWithCovidPatient() && selfAssessmentRequest.getSymptoms() == null
                && !selfAssessmentRequest.getTravelHistory()) {
            return 5;
        } else if ((selfAssessmentRequest.getContactWithCovidPatient() || selfAssessmentRequest.getTravelHistory())) {
            if(selfAssessmentRequest.getSymptoms().size() == 1) {
                return 50;
            } else if (selfAssessmentRequest.getSymptoms().size() == 2) {
                return 75;
            } else {
              return 95;
            }
        }
        return 5;
    }
}
