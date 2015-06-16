/**
 * 
 */
package edu.mum.cs.waa.fp.as.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author 984417
 */
@Controller
public class TakeAssessmentController {

	@RequestMapping(value = { "/showAssessments" }, method = RequestMethod.GET)
	public String showAssessmentPageToStudent() {
		// Get the assessments list from the database.
		// fill the
		return "forward:/showAssessments";
	}

	@RequestMapping(value = { "/takeAssessment" }, method = RequestMethod.POST)
	public String saveAssessment() {

		return "foward:/previewAssessment";
	}

	@RequestMapping(value = { "/previewAssessment" }, method = RequestMethod.POST)
	public String submitAssessment() {
		// save the assessment

		return "redirect:/assessmentResult";
	}

}
