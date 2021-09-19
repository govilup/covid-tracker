package com.covidtracker.repository;

import com.covidtracker.entity.SelfAssessment;
import com.covidtracker.repository.jparepository.SelfAssessmentJPARepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SelfAssessmentRepository {

    @Autowired
    SelfAssessmentJPARepository selfAssessmentJPARepository;

    /**
     * Save self assessment.
     *
     * @param selfAssessment entity to store in the db.
     * @return self assessment
     */
    public SelfAssessment saveSelfAssessment(SelfAssessment selfAssessment) {
        return selfAssessmentJPARepository.save(selfAssessment);
    }
}
