package edu.mum.cs.waa.fp.as.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.mum.cs.waa.fp.as.domain.Assessment;
import edu.mum.cs.waa.fp.as.domain.Question;
import edu.mum.cs.waa.fp.as.repository.AssessmentRepository;
import edu.mum.cs.waa.fp.as.service.AssessmentService;

@Service
@Transactional
class AssessmentServiceImpl implements AssessmentService {

	@Autowired
	AssessmentRepository assessmentRepository;

	/**This method helps to find the list of assessment form the database using repository. 
	 */
	@Override
	public List<Assessment> findAll() {
		// TODO Auto-generated method stub
		return (ArrayList<Assessment>) assessmentRepository.findAll();
	}

	/** This method saves the assessment in the database. 
	 */
	@Override
	public void save(Assessment assessment) {
		// TODO Auto-generated method stub
		assessmentRepository.save(assessment);

	}
	
	
	/**This method deletes the individual assessment using primary key(ID).
	 */
	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
		assessmentRepository.delete(id);
		
	}

	
	/** findById returns the Assessment object using primary key(ID). 
	 */
	@Override
	public Assessment findById(Long id) {
		// TODO Auto-generated method stub
		return assessmentRepository.findById(id);
	}
	
	
	/** get the assessment with questions list.
	 * get(0) - this is a concept of lazy loading(that activates cascade).
	 * It will initialize all the questions dependencies. 
	 */
	@Override
	@Transactional
	public Assessment findByIdWithQuestion(Long id) {
		Assessment assessment = assessmentRepository.findOne(id);
		Question questions = assessment.getQuestions().get(0);
		System.out.println(questions.getDescription()+"-----------");
		return assessment;
	}
	

	/**This method determines whether the id to be edited exists in the database or not.
	 * If the id is not in the database, the method throws the IllegalArgumentException.
	 * If the id exists , the fields are updated i.e. saved in that ID.
	 */
	@Override
	public void update(Assessment assessment) {
		if(this.assessmentRepository.findOne(assessment.getId()) == null){
			throw new IllegalArgumentException("invalid assessment");
		}
		this.assessmentRepository.save(assessment);
	}

	@Override
	public Question addQuestion(Long assessmentId, Question question) {
		Assessment assessment = findById(assessmentId);
		assessment.addQuestion(question);
		update(assessment);
		return question;
	}

	
}
