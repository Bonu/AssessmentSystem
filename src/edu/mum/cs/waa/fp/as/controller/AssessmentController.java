package edu.mum.cs.waa.fp.as.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import edu.mum.cs.waa.fp.as.domain.Assessment;
import edu.mum.cs.waa.fp.as.service.AssessmentService;

/**
 * @author Bharat
 *
 */
@Controller
@RequestMapping(value = "/createAssessment")
public class AssessmentController {

	@Autowired
	AssessmentService assessmentService;

	
	/**
	 * @param model
	 * @return
	 */
	@RequestMapping(value = { "/", "/listAssessments/" }, method = RequestMethod.GET)
	public String assessmentHomepage(Model model) {

		model.addAttribute("assessment", assessmentService.findAll());

		return "assessmentHomepage";
	}

	/**
	 * @return
	 */
	@RequestMapping(value = "/addAssessmentForm/", method=RequestMethod.GET)
	public String addAssessmentForm() {

		return "addAssessmentForm";
	}

	/**
	 * @param assessment
	 * @param result
	 * @param redirectAttributes
	 * @return
	 */
	@RequestMapping(value = "/add", method=RequestMethod.POST)
	public String addAssessment(@Valid @ModelAttribute Assessment assessment,
			BindingResult result, RedirectAttributes redirectAttributes) {

		System.out.println("Inside Add Handler1");
		if (result.hasErrors()) {

			return "addAssessmentForm";
		}
		assessmentService.save(assessment);
//		System.out.println("Inside Add Handler2");
//		redirectAttributes.addFlashAttribute(assessment);
//		System.out.println("Inside Add Handler3");
		return "redirect:/createAssessment/listAssessments/";
	}

}
