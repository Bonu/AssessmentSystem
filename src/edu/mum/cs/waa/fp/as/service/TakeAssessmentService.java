package edu.mum.cs.waa.fp.as.service;

import java.util.List;

import edu.mum.cs.waa.fp.as.domain.TakeAssessment;

/**
 * The Take assessment service perform below operations
 * 1. save the student assessment details
 *  
 * @author janardhanbonu
 *
 */
public interface TakeAssessmentService {

	public void saveTakeAssessment(TakeAssessment takeAssessment);
	
	public TakeAssessment getTakeAssessment(int takeAssessmentId);
	
	public List<TakeAssessment> getTakeAssessments();
	
}
