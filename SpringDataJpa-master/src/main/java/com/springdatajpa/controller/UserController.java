package com.springdatajpa.controller;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;

import com.springdatajpa.bo.User;
import com.springdatajpa.repoistory.UserRepoistry;

@Controller
@Path("/user")
public class UserController {
	
	@Autowired
	private UserRepoistry userRepoistry;
	
	/* For adding User details and send authentication mail to user */
	@POST
	@Path("/add")
	public void add(@RequestBody User user) {
		userRepoistry.save(user);
		System.out.println("Authentication mail to User");
	}
	
	/* To update User details */
	@POST
	@Path("/update")
	public void update(@RequestBody User user) {
		userRepoistry.saveAndFlush(user);
	}
	
	/* To delete User details */
	@POST
	@Path("/delete")
	public void delete(@RequestBody User user) {
		userRepoistry.delete(user);
	}
	
	/* For fetching User details */
	@GET
	@Path("/read")
	public void read(@RequestBody User user) {
		userRepoistry.findOne(user.getUserId());
	}

}
