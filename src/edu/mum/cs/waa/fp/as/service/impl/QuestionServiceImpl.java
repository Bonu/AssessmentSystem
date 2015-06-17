package edu.mum.cs.waa.fp.as.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.mum.cs.waa.fp.as.domain.Question;
import edu.mum.cs.waa.fp.as.repository.QuestionRepository;
import edu.mum.cs.waa.fp.as.service.QuestionService;

@Service
@Transactional
public class QuestionServiceImpl implements QuestionService {
	
	@Autowired
	QuestionRepository questionRepository;

	@Override
	public List<Question> findAll(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Question save(Question question) {
		// TODO Auto-generated method stub
		return questionRepository.save(question);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		questionRepository.delete(id);
	}

}
