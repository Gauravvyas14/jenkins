package com.TestMongo.controller;


import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.TestMongo.dto.SignupForm;
import com.TestMongo.services.UserService;
import com.TestMongo.utils.MyUtil;
import com.TestMongo.validator.SignupFormValidator;

@Controller
public class HomeController {
	
	
	private static final Logger logger=LoggerFactory.getLogger(HomeController.class);
	
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private SignupFormValidator signupFormValidator;
	
	@InitBinder("signupForm")
	protected void initSignupBinder(WebDataBinder binder) {
		binder.setValidator(signupFormValidator);
	}

	
	
	
	
	@GetMapping("/signup")
	public String getSignup(Model model) {
		
		model.addAttribute("signupForm", new SignupForm());
		
		return "sign-up";
	}
	
	@PostMapping("/signup")
	public String postSignup(@ModelAttribute("signupForm") @Valid SignupForm signupForm, BindingResult result, RedirectAttributes attributes) {
		
		if(result.hasErrors())
			return "sign-up";
		
		
		MyUtil.flash(attributes, "success", "signupSuccess");
		userService.signupUser(signupForm);
		
		
		return "redirect:/";
	}
	
	@GetMapping("/success")
	public String successPage(Model model) {
		
		model.addAttribute(new SignupForm());
		
		return "redirect:/success";
	}

}
