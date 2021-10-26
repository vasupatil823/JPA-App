package com.vasu.dao;

import org.springframework.stereotype.Repository;

import com.vasu.model.Login;
@Repository
public interface LoginDAO {
public int register(Login login);
public String login(String username, String password);
}
