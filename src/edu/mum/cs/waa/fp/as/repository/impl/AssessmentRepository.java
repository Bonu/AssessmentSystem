package edu.mum.cs.waa.fp.as.repository.impl;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import edu.mum.cs.waa.fp.as.domain.Assessment;

@Repository
public interface AssessmentRepository extends CrudRepository<Assessment, Long>{

}
