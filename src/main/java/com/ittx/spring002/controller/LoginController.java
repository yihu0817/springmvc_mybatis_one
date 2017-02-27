package com.ittx.spring002.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ittx.spring002.model.User;

@Controller
public class LoginController {
	private static final Logger log = Logger.getLogger(LoginController.class);
	@RequestMapping("/main")
	public String login(User user, Model model){
		return "main";
	}
	
	@RequestMapping("/login_logout")
	public String login(){
		return "login";
	}
	
	@RequestMapping("/login")
	public String main(){
		return "login";
	}
	
	
}
