package com.springdatajpa.repoistory;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.springdatajpa.bo.PromoCodes;

@Component
public interface PromoCodeRepoistry  extends JpaRepository<PromoCodes, Integer>{

	List<PromoCodes> findAll();
}
