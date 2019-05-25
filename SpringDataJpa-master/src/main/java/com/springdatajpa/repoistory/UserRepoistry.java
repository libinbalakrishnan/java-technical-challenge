package com.springdatajpa.repoistory;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.springdatajpa.bo.User;

@Component
public interface UserRepoistry  extends JpaRepository<User, Integer>{

	List<User> findAll();
}
