package com.train.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.train.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/insert")
	public String insert(String username,String password) {
		System.out.println("1111");
		userService.insertUser(username, password);
		return "success";
	}
	
	@RequestMapping("/login")
	public String login() {
		System.out.println("22222");
		return "InsertUser";
	}
}
