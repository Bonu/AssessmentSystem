package edu.mum.cs.waa.fp.as.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.mum.cs.waa.fp.as.domain.User;

@Controller
public class UserController {
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String register(@ModelAttribute("user") User user) {
		return "register";
	}
}
