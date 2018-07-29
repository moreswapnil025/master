package com.app.login.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.app.login.models.User;
import com.app.login.service.RegisterAndLoginService;

import io.swagger.annotations.ApiOperation;

@RestController
public class UserController {
	@Autowired
	private RegisterAndLoginService registerAndLoginService;
	
	@ApiOperation(value="Get All Users..")
	@RequestMapping(value = "/users",method=RequestMethod.GET,produces="application/json")
	public List<User> getAllUser()
	{
		return registerAndLoginService.getAllUsers();
	}
	
	@ApiOperation(value="Get User By ID.")
	@RequestMapping(value="/users/{id}",method=RequestMethod.GET)
	public User getUserByID(@PathVariable(required = true) Integer id)
	{
		return registerAndLoginService.getUserByID(id);
			
	}

}
