package edu.mum.cs.waa.fp.as.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.mum.cs.waa.fp.as.domain.Assessment;
import edu.mum.cs.waa.fp.as.domain.Question;
import edu.mum.cs.waa.fp.as.service.AssessmentService;
import edu.mum.cs.waa.fp.as.service.QuestionService;


@Controller
@RequestMapping(value = "/QuestionAnswer")
public class QuestionAnswerController {
	
	@Autowired
	QuestionService questionService;
	
	@Autowired
	AssessmentService assessmentService;
	
	@RequestMapping(value = { "/createQuestion/{assessmentId}" }, method = RequestMethod.GET)
	public String createQuestion(Question question, @PathVariable("assessmentId") Long assessmentId){
		return "createQuestionForm";
	}
	
	@RequestMapping(value = { "/createQuestion/{assessmentId}" }, method = RequestMethod.POST)
	public String addQuestion(@ModelAttribute Question question, @PathVariable("assessmentId") Long assessmentId){
		question = assessmentService.addQuestion(assessmentId, question);
		return "redirect:/Answer/createAnswer/"+question.getQuestionId();
	}
}
