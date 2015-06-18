package edu.mum.cs.waa.fp.as.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import edu.mum.cs.waa.fp.as.domain.TakeAssessment;

@Repository
public interface TakeAssessmentRepository extends CrudRepository<TakeAssessment, Integer> {

}
