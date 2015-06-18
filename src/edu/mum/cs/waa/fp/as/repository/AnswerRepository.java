package edu.mum.cs.waa.fp.as.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import edu.mum.cs.waa.fp.as.domain.Answer;

@Repository
public interface AnswerRepository extends CrudRepository<Answer, Integer> {

}
