package edu.mum.cs.waa.fp.as.service;

import java.util.List;

import edu.mum.cs.waa.fp.as.domain.Assessment;

public interface AssessmentService {

	/**
	 * @return
	 */
	public List<Assessment> findAll();

	public void save(Assessment assessment);

	public void delete(Long id);
	
}
