package com.springdatajpa;

import javax.transaction.Transactional;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages="com.springdatajpa.repoistory")
@EnableAutoConfiguration
public class DataJpaExampleApplication implements CommandLineRunner{
	
	public static void main(String[] args) {
		SpringApplication.run(DataJpaExampleApplication.class, args);
	}

	@Transactional
	@Override
	public void run(String... args) throws Exception {
		
		
	}
}
