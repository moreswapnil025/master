package com.app.login.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.app.login.models.User;
import com.app.login.service.RegisterAndLoginService;

import io.swagger.annotations.ApiOperation;

@RestController
public class RegisterationController {
	
	@Autowired
	private RegisterAndLoginService registerAndLoginService;
	
	@ApiOperation(value="Register User")
	@RequestMapping(value="/register",method=RequestMethod.POST,consumes="application/json")
	public void registerUser(@RequestBody User user)
	{
		registerAndLoginService.createUser(user);
		
	}

}
