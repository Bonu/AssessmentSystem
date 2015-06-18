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

/**Assessment Controller helps create and list of Assessment.
 * There is edit , delete and navigation option.
 * The navigation option navigates the url that generates questions.  
 * @author Bharat
 *
 */
@Controller
@RequestMapping(value = "/createAssessment")
public class AssessmentController {

	@Autowired
	AssessmentService assessmentService;

	/**This handler method lists the Assessment Lists from the database.
	 * Assessments includes Questions and its Answers.
	 * The JSP page ,assessmentHomepage, returned has a option of adding the assessments.
	 * The model object sends two things, one is the object and another is the message.
	 * The message is sent when the list of assessment is empty invoking to add the assessment/
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
		model.addAttribute("assessment", assessment);

		return "assessmentHomepage";
	}

	/**This method gets form for adding assessment.
	 * The Assessment includes name , description and date field in it. 
	 * @param assessment
	 * @return
	 */
	@RequestMapping(value = "/addAssessmentForm", method = RequestMethod.GET)
	public String addAssessmentForm(@ModelAttribute Assessment assessment) {

		return "addAssessmentForm";
	}

	/**addAssessment method validates the Assessment fields. 
	 *  It finally saves the assessment in the database.
	 *  The page is redirected such that it lists the assignments in the database so far.
	 *  This actually implements the PRG model.
	 * @param assessment
	 * @param result
	 * @param redirectAttributes
	 * @return
	 */
	@RequestMapping(value = "/addAssessmentForm", method = RequestMethod.POST)
	public String addAssessment(@Valid @ModelAttribute Assessment assessment,
			BindingResult result, RedirectAttributes redirectAttributes) {

		if (result.hasErrors()) {

			return "addAssessmentForm";
		}
		assessmentService.save(assessment);
		
		return "redirect:listAssessments";
	}

	/**The method helps to delete the individual assessment.
	 * The page is redirected to list the assessments.
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "/assessmentDelete/{id}", method = RequestMethod.GET)
	public String deleteAssessment(@PathVariable("id") Long id) {

		System.out.println("DeleteId=" + id);
		assessmentService.delete(id);

		return "redirect:/createAssessment/";
	}
	
	/**This method gets the existing assessment form the database using id.
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
	
	/**editAssessmentSave method edits the existing assessment.
	 * The id , whose data is to be over-written, is send to the AssessmentService layer to check if the id 
	 * exists. If it exists it will over-write in the database in that id.
	 * Finally it is redirected to the List the Assessment so far , with the edited assessment included.  
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
