package com.vasu.repo.jpa;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.vasu.model.Login;

public interface LoginRepository<P> extends CrudRepository<Login, Long>{
List<Login> findByFirstName(String firstName);
public String getFirstName(String username, String password);
}
