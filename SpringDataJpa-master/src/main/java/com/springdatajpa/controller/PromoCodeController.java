package com.springdatajpa.controller;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;

import com.springdatajpa.bo.PromoCodes;
import com.springdatajpa.repoistory.PromoCodeRepoistry;

@Controller
@Path("/promocode")
public class PromoCodeController {
	
	@Autowired
	private PromoCodeRepoistry promoCodeRepoistry;
	
		/* For adding Promocode details */
		/* Admin user can set up Promocode */
		@POST
		@Path("/add")
		public void add(@RequestBody PromoCodes promoCodes) {
			promoCodeRepoistry.save(promoCodes);
		}
		
		/* To update Promocode details */
		@POST
		@Path("/update")
		public void update(@RequestBody PromoCodes promoCodes) {
			promoCodeRepoistry.saveAndFlush(promoCodes);
		}
		
		/* To delete Promocode details */
		@POST
		@Path("/delete")
		public void delete(@RequestBody PromoCodes promoCodes) {
			promoCodeRepoistry.delete(promoCodes);
		}
		
		/* For fetching Promocode details */
		@GET
		@Path("/read")
		public void read(@RequestBody PromoCodes promoCodes) {
			promoCodeRepoistry.findOne(promoCodes.getPromocodeId());
		}

}
