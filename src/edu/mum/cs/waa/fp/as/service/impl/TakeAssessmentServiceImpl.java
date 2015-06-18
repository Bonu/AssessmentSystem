package edu.mum.cs.waa.fp.as.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.mum.cs.waa.fp.as.domain.TakeAssessment;
import edu.mum.cs.waa.fp.as.repository.TakeAssessmentRepository;
import edu.mum.cs.waa.fp.as.service.TakeAssessmentService;

/**
 * The Take assessment service perform below operations
 * 1. save the student assessment details
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

}
