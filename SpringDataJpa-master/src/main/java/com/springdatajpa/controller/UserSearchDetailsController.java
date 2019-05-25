package com.springdatajpa.controller;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;

import com.springdatajpa.bo.UserSearchDetails;
import com.springdatajpa.repoistory.UserSearchDetailsRepoistry;

@Controller
@Path("/usersearchdetails")
public class UserSearchDetailsController {
	
	@Autowired
	private UserSearchDetailsRepoistry userSearchDetailsRepoistry;
	
	/* For adding flight search details */
	@POST
	@Path("/add")
	public void add(@RequestBody UserSearchDetails searchDetails) {
		userSearchDetailsRepoistry.save(searchDetails);
		System.out.println("Authentication mail to User");
	}
	
	/* To update flight search details */
	@POST
	@Path("/update")
	public void update(@RequestBody UserSearchDetails searchDetails) {
		userSearchDetailsRepoistry.saveAndFlush(searchDetails);
	}
	
	/* To delete flight search details */
	@POST
	@Path("/delete")
	public void delete(@RequestBody UserSearchDetails searchDetails) {
		userSearchDetailsRepoistry.delete(searchDetails);
	}
	
	/* For fetching flight search details */
	@GET
	@Path("/read")
	public void read(@RequestBody UserSearchDetails searchDetails) {
		userSearchDetailsRepoistry.findOne(searchDetails.getUserId());
	}

}
