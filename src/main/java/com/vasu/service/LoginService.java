package com.vasu.service;

import org.springframework.stereotype.Service;

import com.vasu.model.Login;

@Service
public interface LoginService {
	public void register(Login login);

}
