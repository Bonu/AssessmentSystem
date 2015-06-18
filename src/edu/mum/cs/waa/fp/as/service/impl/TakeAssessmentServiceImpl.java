package edu.mum.cs.waa.fp.as.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.mum.cs.waa.fp.as.domain.Assessment;
import edu.mum.cs.waa.fp.as.domain.TakeAssessment;
import edu.mum.cs.waa.fp.as.repository.TakeAssessmentRepository;
import edu.mum.cs.waa.fp.as.service.TakeAssessmentService;

/**
 * The Take assessment service perform below operations
 * 1. Save the student assessment details
 * 2. Get TakeAssessment object
 * 3. Get All TakeAssessment objects
 *  
 * @author janardhanbonu
 */
@Service
public class TakeAssessmentServiceImpl implements TakeAssessmentService {

	@Autowired
	TakeAssessmentRepository takeAssessmentRepository;
	
	/**
	 * Persist the TakeAssessment object in Database.
	 * @see edu.mum.cs.waa.fp.as.service.TakeAssessmentService#saveTakeAssessment(edu.mum.cs.waa.fp.as.domain.TakeAssessment)
	 */
	@Override
	public void saveTakeAssessment(TakeAssessment takeAssessment) {
		takeAssessmentRepository.save(takeAssessment);
	}

	/**
	 * Get TakeAssessment by Id
	 * @see edu.mum.cs.waa.fp.as.service.TakeAssessmentService#getTakeAssessment(int)
	 * @return TakeAssessment 
	 */
	@Override
	public TakeAssessment getTakeAssessment(int takeAssessmentId) {
		return takeAssessmentRepository.findOne(takeAssessmentId);
	}

	/**
	 * Get all TakeAssessments
	 * 
	 * @see edu.mum.cs.waa.fp.as.service.TakeAssessmentService#getTakeAssessments()
	 * @return List of TakeAssessment
	 */
	@Override
	public List<TakeAssessment> getTakeAssessments() {
		return  (ArrayList<TakeAssessment>)takeAssessmentRepository.findAll();
	}

	
}
