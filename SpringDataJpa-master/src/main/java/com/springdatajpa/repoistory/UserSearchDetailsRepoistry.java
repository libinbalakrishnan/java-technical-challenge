package com.springdatajpa.repoistory;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springdatajpa.bo.UserSearchDetails;

public interface UserSearchDetailsRepoistry extends JpaRepository<UserSearchDetails, Integer>{
	List<UserSearchDetails> findAll();
}
