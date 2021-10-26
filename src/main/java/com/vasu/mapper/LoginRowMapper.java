package com.vasu.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.tree.RowMapper;

import com.vasu.model.Login;

public class LoginRowMapper implements org.springframework.jdbc.core.RowMapper<Login>{

	public Login mapRow(ResultSet rs, int rowNum) throws SQLException {
		Login login=new Login();
		login.setUserId(rs.getInt("uid"));
		login.setFirstName(rs.getString("firstName"));
		login.setLastName(rs.getString("lastName"));
		login.setEmail(rs.getString("email"));
		login.setMoNo(rs.getString("phone"));
		login.setUsername(rs.getString("username"));
		login.setPassword(rs.getString("password"));
		return login;
	}

	
}
