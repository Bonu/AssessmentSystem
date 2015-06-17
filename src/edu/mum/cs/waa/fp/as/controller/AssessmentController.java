package edu.mum.cs.waa.fp.as.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
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
	@RequestMapping(value = { "/", "/listAssessments" }, method = RequestMethod.GET)
	public String assessmentHomepage(Model model) {

		List<Assessment> assessment = assessmentService.findAll();
		//Send message if the list of assessment is empty.
		if(assessment.isEmpty()){
			model.addAttribute("message", "List is Empty. Click Add Assessment");
		}
		/*for (Assessment a : assessment) {
			System.out.println(a.getNameAssessment());
			System.out.println(a.getDescriptionAssessment());
		}*/
		model.addAttribute("assessment", assessment);

		return "assessmentHomepage";
	}

	/**
	 * @param assessment
	 * @return
	 */
	@RequestMapping(value = "/addAssessmentForm", method = RequestMethod.GET)
	public String addAssessmentForm(@ModelAttribute Assessment assessment) {

		return "addAssessmentForm";
	}

	/**
	 * @param assessment
	 * @param result
	 * @param redirectAttributes
	 * @return
	 */
	@RequestMapping(value = "/addAssessmentForm", method = RequestMethod.POST)
	public String addAssessment(@Valid @ModelAttribute Assessment assessment,
			BindingResult result, RedirectAttributes redirectAttributes) {

		System.out.println("Inside Add Handler1");
		if (result.hasErrors()) {

			return "addAssessmentForm";
		}
		System.out.println("no error");
		assessmentService.save(assessment);
		System.out.println("after save");
		return "redirect:listAssessments";
	}

	/**
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "/assessmentDelete/{id}", method = RequestMethod.GET)
	public String deleteAssessment(@PathVariable("id") Long id) {

		System.out.println("DeleteId=" + id);
		assessmentService.delete(id);

		return "redirect:/createAssessment/";
	}
	
	/**
	 * @param id
	 * @param model
	 * @param assessment
	 * @return
	 */
	@RequestMapping(value = "/assessmentEdit/{id}", method = RequestMethod.GET)
	public String editAssessment(@PathVariable("id") Long id,Model model, Assessment assessment) {

		System.out.println("EditId=" + id);
		assessment = assessmentService.findById(id);
		model.addAttribute("assessment", assessment);
		//on the jsp page
		return "addAssessmentForm";
	}
	
	/**
	 * @param assessment
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/assessmentEdit/{id}", method = RequestMethod.POST)
	public String editAssessmentSave(@ModelAttribute  Assessment assessment, @PathVariable("id") Long id,Model model) {

		System.out.println("EditId=" + id);
		assessment.setId(id);
		this.assessmentService.update(assessment);
		
		return "redirect:/createAssessment/";
	}
}
