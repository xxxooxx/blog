package com.itshidu.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itshidu.web.entity.User;

@Controller
public class Register {
	
	
	
	@RequestMapping("/register")
	public Object hellojsp(User fromuser) {
		
		return "register";
		
	}
}
