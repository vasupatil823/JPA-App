package com.vasu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vasu.model.Login;
import com.vasu.repo.jpa.LoginRepository;

@Service
public class LoginServiceImpl{

	@Autowired
	LoginRepository<Login> loginRepository;
	
	public List<Login> getAllUsers(){
		return (List<Login>) loginRepository.findAll();
	}
public Login registerUser(Login login) {
	return loginRepository.save(login);
}
public String login(String username, String password) {
	return loginRepository.getFirstName(username, password);
}
}
