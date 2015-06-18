package edu.mum.cs.waa.fp.as.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.mum.cs.waa.fp.as.domain.Answer;
import edu.mum.cs.waa.fp.as.service.AnswerService;
import edu.mum.cs.waa.fp.as.service.QuestionService;

@Controller
@RequestMapping(value = "/Answer")
public class AnswerController {
	
	@Autowired
	QuestionService questionService;
	
	@RequestMapping(value = { "/createAnswer/{questionId}" }, method = RequestMethod.GET)
	public String createAnswer(@ModelAttribute Answer answer, @PathVariable("questionId") Long questionId){
		return "createAnswerForm";
	}
	
	@RequestMapping(value = { "/createAnswer/{questionId}" }, method = RequestMethod.POST)
	public String addAnswer(@ModelAttribute Answer answer, @PathVariable("questionId") int questionId){
		answer = questionService.addAnswer(questionId, answer);
		return "redirect:/Answer/";
	}
}
