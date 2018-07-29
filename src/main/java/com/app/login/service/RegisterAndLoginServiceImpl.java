package com.app.login.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.login.models.Login;
import com.app.login.models.User;
import com.app.login.repository.UserRepository;

@Service
public class RegisterAndLoginServiceImpl implements RegisterAndLoginService{

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public User getUser(Login login) 
	{
		return userRepository.find(login.getId(), login.getPassword());
	}

	@Override
	public void createUser(User user) {
		userRepository.save(user);
	}

	@Override
	public List<User> getAllUsers() 
	{
		
		return userRepository.findAll();
	}

	@Override
	public User getUserByID(Integer id) {
		
		return userRepository.findOne(id);
	}

}
