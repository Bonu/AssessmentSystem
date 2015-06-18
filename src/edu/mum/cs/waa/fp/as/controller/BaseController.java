/**
 * 
 */
package edu.mum.cs.waa.fp.as.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * This controller is for home screen display.
 * 
 * @author Janardhan Bonu
 *
 */
@Controller
public class BaseController {

	@RequestMapping(value = { "/", "/home" }, method = RequestMethod.GET)
	public String goHome(Model model) {
		return "home";
	}

}
