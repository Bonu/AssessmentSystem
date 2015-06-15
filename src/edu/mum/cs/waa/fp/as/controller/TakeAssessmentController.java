/**
 * 
 */
package edu.mum.cs.waa.fp.as.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author 984417
 *
 */
@Controller
public class TakeAssessmentController {

	@RequestMapping(value={"/takeAssessment"}, method=RequestMethod.GET)
	public String showAssessmentPageToStudent(){
		
		return "takeAssessment";
	}
}
