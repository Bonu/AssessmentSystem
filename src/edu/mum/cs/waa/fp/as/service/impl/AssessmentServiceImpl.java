package edu.mum.cs.waa.fp.as.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.mum.cs.waa.fp.as.domain.Assessment;
import edu.mum.cs.waa.fp.as.repository.AssessmentRepository;
import edu.mum.cs.waa.fp.as.service.AssessmentService;

@Service
@Transactional
public class AssessmentServiceImpl implements AssessmentService {

	@Autowired
	AssessmentRepository assessmentRepository;

	@Override
	public List<Assessment> findAll() {
		// TODO Auto-generated method stub
		return (ArrayList<Assessment>) assessmentRepository.findAll();
	}

	@Override
	public void save(Assessment assessment) {
		// TODO Auto-generated method stub
		assessmentRepository.save(assessment);

	}

}
