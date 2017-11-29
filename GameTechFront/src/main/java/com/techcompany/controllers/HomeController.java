package com.techcompany.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class HomeController {

	@RequestMapping("/")
	public String loadHome(Model model) {

		return "home";
	}

	@RequestMapping("/login")
	public String login(Model model) {

		return "login";

	}
	
	@RequestMapping("/signup")
	public String signup(Model model){
		
		return "signup";
	}
}
