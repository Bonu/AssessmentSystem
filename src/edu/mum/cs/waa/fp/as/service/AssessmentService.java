package edu.mum.cs.waa.fp.as.service;

import java.util.List;

import org.springframework.stereotype.Service;

import edu.mum.cs.waa.fp.as.domain.Assessment;
import edu.mum.cs.waa.fp.as.domain.Question;


public interface AssessmentService {

	/**
	 * @return
	 */
	public List<Assessment> findAll();

	public void save(Assessment assessment);

	public void update(Assessment assessment);
	public void delete(Long id);

	public Assessment findById(Long id);
	
	public Assessment findByIdWithQuestion(Long id);

	public Question addQuestion(Long assessmentId, Question question);

	
}
