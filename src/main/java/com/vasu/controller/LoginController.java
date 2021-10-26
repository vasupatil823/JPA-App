package com.vasu.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.vasu.dao.LoginDAO;
import com.vasu.model.Login;
import com.vasu.service.LoginServiceImpl;

@Controller
public class LoginController {
	
	@Autowired
	private LoginServiceImpl service;
	
	@GetMapping("/registerForm")
	public String register(Model model) {
		Login login=new Login();
		model.addAttribute("register", login);
		return "register";
	}	
	@GetMapping("/loginForm")
	public String login(Model model) {
		Login login=new Login();
		model.addAttribute("login", login);
	    return "login";
	}
	@PostMapping("/register")
	public String register(@Valid @ModelAttribute("register") Login login, BindingResult rs) {
		if(rs.hasErrors()) {
			return "register";
		}
		else {
			service.registerUser(login);
		return "successFullPage";
	}
	}
	@PostMapping("/login")
	public String login(@RequestParam("username") String username, @RequestParam("password") String password, Model model) {		
		String userName=service.login(username, password);
		if(userName==null) {
			model.addAttribute("message", "Please Enter Valied Username Name OR Password or You Dont Have an account");
			return "error";
		}
		else {
			return "EmplPage";
		}
		
	}

}
