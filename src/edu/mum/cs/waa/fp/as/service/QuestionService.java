package edu.mum.cs.waa.fp.as.service;

import java.util.List;

import edu.mum.cs.waa.fp.as.domain.Question;

public interface QuestionService {
	public List<Question> findAll(int id);

	public Question save(Question question);

	public void delete(int id);
}
