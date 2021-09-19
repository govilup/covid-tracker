package com.covidtracker.controller;

import com.covidtracker.model.RegisterUserRequest;
import com.covidtracker.model.RegisterUserResponse;
import com.covidtracker.model.SelfAssessmentRequest;
import com.covidtracker.model.SelfAssessmentResponse;
import com.covidtracker.service.RegistrationService;
import com.covidtracker.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.Response;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private RegistrationService registrationService;

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public ResponseEntity<RegisterUserResponse> registerUser(@RequestBody RegisterUserRequest registerUserRequest) {
        if(registerUserRequest == null) {
            return ResponseEntity.badRequest().build();
        }
        RegisterUserResponse response = registrationService.registerUser(registerUserRequest);

        if(response != null) {
            return ResponseEntity.ok(response);
        }
        return ResponseEntity.internalServerError().build();
    }

    @PostMapping("/self-assessment")
    public ResponseEntity<SelfAssessmentResponse> selfAssessment(@RequestBody SelfAssessmentRequest selfAssessmentRequest) {
        if(selfAssessmentRequest == null) {
            return ResponseEntity.badRequest().build();
        }
        SelfAssessmentResponse response = userService.takeSelfAssessment(selfAssessmentRequest);
        if(response != null) {
            return ResponseEntity.ok(response);
        }
        return ResponseEntity.internalServerError().build();
    }
}
