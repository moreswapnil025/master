package com.app.login.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.app.login.models.Login;
import com.app.login.models.User;

@Service
public interface RegisterAndLoginService {

	User getUser(Login login);

	void createUser(User user);

	List<User> getAllUsers();

	User getUserByID(Integer id);

}
