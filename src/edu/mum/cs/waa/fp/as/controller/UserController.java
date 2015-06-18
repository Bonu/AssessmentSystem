package edu.mum.cs.waa.fp.as.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

import edu.mum.cs.waa.fp.as.domain.User;
import edu.mum.cs.waa.fp.as.service.UserService;
import edu.mum.cs.waa.fp.as.validator.UserValidator;
/**
 * 
 * @author Michael
 * controller that handles user operations like register
 */
@Controller
public class UserController {
	@Autowired
	private UserService userService;
	/**
	 * leads to the register 
	 * @param user the model to be used by the view
	 * @return the view to be displayed
	 */
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String register(@ModelAttribute("user") User user) {
		return "register";
	}

	@InitBinder
	private void initBinder(WebDataBinder binder) {
	 
		//binder.setValidator(new UserValidator());
	}
	@Autowired
	UserValidator validator;
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String saveUser(@Valid @ModelAttribute("user") User user,
			BindingResult res, RedirectAttributes red) {
		validator.validate(user, res);
		if (res.hasErrors()) {
			return "register";
		}
		userService.save(user);
		red.addFlashAttribute("user", user.getUserName());
		return "redirect:/registersuccessfully";
	}

	@RequestMapping(value = "/registersuccessfully", method = RequestMethod.GET)
	public String redirectSuccessfully() {
		return "registersuccessfully";
	}

}
