package com.covidtracker.repository.jparepository;

import com.covidtracker.entity.SelfAssessment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SelfAssessmentJPARepository extends CrudRepository<SelfAssessment, Long> {

}
