package com.covidtracker.converter;

import com.covidtracker.entity.SelfAssessment;
import com.covidtracker.entity.User;
import com.covidtracker.model.RegisterUserRequest;
import com.covidtracker.model.RegisterUserResponse;
import com.covidtracker.model.SelfAssessmentRequest;
import com.covidtracker.model.SelfAssessmentResponse;
import org.springframework.stereotype.Component;

@Component
public class Converter {

    /**
     * Convert register user request to User entity.
     *
     * @param registerUserRequest to convert to User Entity
     * @return user entity
     */
    public static User toUser(RegisterUserRequest registerUserRequest) {
        return User.builder()
                .name(registerUserRequest.getUserName())
                .mobileNo(registerUserRequest.getPhoneNumber())
                .address(registerUserRequest.getAddress())
                .build();
    }

    /**
     * Convert Response to User Registration Response.
     *
     * @param userId
     * @return User Response
     */
    public static RegisterUserResponse toUserResponse(Long userId) {
        return RegisterUserResponse.builder()
                .userId(userId)
                .build();
    }

    /**
     * To self assessment entity.
     *
     * @param selfAssessmentRequest request
     * @param user user who is taking the test
     * @return Self Assessment
     */
    public static SelfAssessment toSelfAssessment(SelfAssessmentRequest selfAssessmentRequest, User user) {
        return SelfAssessment.builder()
                .symptoms(selfAssessmentRequest.getSymptoms())
                .user(user)
                .contactWithCovidPatient(selfAssessmentRequest.getContactWithCovidPatient())
                .travelHistory(selfAssessmentRequest.getTravelHistory())
                .build();
    }

    /**
     * To self assessment response
     *
     * @param riskpercent risk percent
     * @return Response
     */
    public static SelfAssessmentResponse toSelfAssessmentResponse(double riskpercent) {
        return SelfAssessmentResponse.builder()
                .riskPercentage(riskpercent)
                .build();
    }
}
