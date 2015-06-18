/**
 * 
 */
package edu.mum.cs.waa.fp.as.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.mum.cs.waa.fp.as.domain.Answer;
import edu.mum.cs.waa.fp.as.domain.Assessment;
import edu.mum.cs.waa.fp.as.domain.Question;
import edu.mum.cs.waa.fp.as.domain.StudentAnswer;
import edu.mum.cs.waa.fp.as.domain.StudentQuestion;
import edu.mum.cs.waa.fp.as.domain.TakeAssessment;
import edu.mum.cs.waa.fp.as.service.AssessmentService;
import edu.mum.cs.waa.fp.as.service.TakeAssessmentService;

/**
 * The TakeAssessmentController does the following tasks
 * 1. Show the assessments List to the Student
 * 2. Perform the assessment
 * 3. Submit the assessment
 * 4. View assessment result
 * 
 * @author 984417
 */
@Controller
public class TakeAssessmentController {

	@Autowired
	AssessmentService assessmentService;
	
	@Autowired
	TakeAssessmentService takeAssessmentService;
	
	/**
	 * Show all the open assessments to the student.
	 * 
	 * @param model
	 * @return view name
	 */
	@RequestMapping(value = { "/showAssessments" }, method = RequestMethod.GET)
	public String showAssessmentListToStudent(Model model /*,Principal principal */) {
		// Get the assessments list from the database.
		List<Assessment> assessmentList = assessmentService.findAll();
		// Set the assessments to the model
//		if(principal != null && principal.getName() != null){
//			model.addAttribute("principalUserName",principal.getName());
////			System.out.println("-----Login user----"+model.asMap().get("principalUserName")+"------");
//		}else{
//			model.addAttribute("principalUserName","AnonymousUser");
////			System.out.println("-----Login user----"+model.asMap().get("principalUserName")+"------");
//		}
		model.addAttribute("username","dummystudent");
		model.addAttribute("assessmentList", assessmentList);
		// display the assessment page with assessments list.
		return "studentAssessmentList";
	}

	/**
	 * Take assessment page is displayed for the login student. The student will perform the assessment task 
	 * and submit the assessment.
	 * 
	 * @param assessmentId
	 * @param studentId
	 * @param model
	 * @return the view name
	 */
	@RequestMapping(value = { "/takeAssessment/{studentId}/{assessmentId}" }, method = RequestMethod.GET)
	public String takeAssessment(@PathVariable long assessmentId, @PathVariable String studentId, Model model) {
		model.addAttribute("studentId",studentId);
		Assessment assessment = assessmentService.findByIdWithQuestion(assessmentId);
		TakeAssessment takeAssessment = new TakeAssessment();
		takeAssessment.setStudentName(studentId);
		takeAssessment.setAssessmentName(assessment.getNameAssessment());
		List<StudentQuestion> studentQuestions = getQuestionsFromAssessment(assessment);
		takeAssessment.addStudentQuestions(studentQuestions);
		model.addAttribute("takeAssessment", takeAssessment);
		return "takeAssessment";
	}

	/**
	 * Calculate the assessment result and save the assessment in database
	 * 
	 * @param takeAssessment
	 * @return assessmentresult view name
	 */
	@RequestMapping(value = { "/submitassessment" }, method = RequestMethod.POST)
	public String submitAssessment(@ModelAttribute TakeAssessment takeAssessment) {
		// Calculate the result
		
		// save the assessment
		takeAssessmentService.saveTakeAssessment(takeAssessment);
		return "redirect:/assessmentResult";
	}
	
	private List<StudentQuestion> getQuestionsFromAssessment(Assessment assessment){
		List<Question> questions = assessment.getQuestions();
		List<StudentQuestion> squestions = new ArrayList<StudentQuestion>();
		
		for (Question question : questions) {
			List<Answer> answers = question.getAnswers();
			List<StudentAnswer> sanswers = new ArrayList<StudentAnswer>();
			for (Answer answer : answers) {
				sanswers.add(new StudentAnswer(answer.getDescription(),false));
			}
			squestions.add(new StudentQuestion(question.getDescription(),sanswers));
		}
		return squestions;
	}

}
