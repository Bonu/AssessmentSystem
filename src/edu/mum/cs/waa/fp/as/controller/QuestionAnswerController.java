package edu.mum.cs.waa.fp.as.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping(value = "/QuestionAnswer")
public class QuestionAnswerController {
	
	@RequestMapping(value = { "/createQuestion/{assessmentId}" }, method = RequestMethod.GET)
	public String createQuestion(@PathVariable("assessmentId") Long assessmentId){
		return "createQuestionForm";
	}

}
