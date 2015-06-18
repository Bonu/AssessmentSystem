package edu.mum.cs.waa.fp.as.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import edu.mum.cs.waa.fp.as.domain.Answer;
import edu.mum.cs.waa.fp.as.repository.AnswerRepository;
import edu.mum.cs.waa.fp.as.service.AnswerService;

public class AnswerServiceImpl implements AnswerService {

	@Autowired
	AnswerRepository answerRepository;
	
	@Override
	public Answer save(Answer answer) {
		return answerRepository.save(answer);
	}

}
