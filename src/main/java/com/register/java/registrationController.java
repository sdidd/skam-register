package com.register.java;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.register.java.model.user;
import com.register.java.model.userInterface;

@RestController
public class registrationController {

	@Autowired
	private userInterface userinterface;

	@RequestMapping("/check")
	public String check()
	{
		return "Registered";
	}

	@RequestMapping("/register-user/{username}/{password}/{email}")
	public String registerUser(@PathVariable("username") String username,@PathVariable("password") String password,@PathVariable("email") String email)
	{
		user u =  new user();
		u.setId(4);
		u.setUsername(username);
		u.setPassword(password);
		u.setEmail(email);

		userinterface.save(u);
		return "Registered";
	}

}
