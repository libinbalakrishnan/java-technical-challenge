package com.springdatajpa.controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.ws.rs.POST;
import javax.ws.rs.Path;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;

import com.springdatajpa.bo.SearchRequest;
import com.springdatajpa.bo.SearchResponse;
import com.springdatajpa.bo.UserSearchDetails;
import com.springdatajpa.repoistory.UserSearchDetailsRepoistry;

@Controller
@Path("/webCrawler")
public class WebCrawlerController {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Autowired
	private UserSearchDetailsRepoistry searchDetailsRepoistry;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	/* To fetch the promocode based on the user search criteria */
	@POST
	@Path("/add")
	
	public List<SearchResponse> fetchOffers(@RequestBody SearchRequest searchRequest) {

		
		  String query="select frequency as freq,from as origin,to as destination,percentage as percent,flightNo as flightNumber,originalPrice as originalPrice,"
		  		+ "dateOfJrny as dateofJourney from dbo.promocodes where from = "+searchRequest.getOrigin()
		  +" and to = "+searchRequest.getDestination();  
		    return jdbcTemplate.query(query, new RowMapper<SearchResponse>() {
				@Override
				public SearchResponse mapRow(ResultSet rs, int rowNum) throws SQLException {
					SearchResponse sr = new SearchResponse();
					sr.setDestination(rs.getString("destination"));
					sr.setOrigin(rs.getString("origin"));
					sr.setFlightNo(rs.getString("flightNumber"));
					sr.setOriginalPrice(rs.getString("originalPrice"));
					sr.setDiscount(rs.getString("percent"));
					sr.setDiscountPrice(String.valueOf(Long.valueOf(sr.getOriginalPrice())-((Long.valueOf(sr.getDiscount())*Long.valueOf(sr.getOriginalPrice()))/100)));
					sr.setDestination(rs.getString("destination"));
					sr.setDateOfFlight(rs.getDate("dateofJourney"));
					return sr;
				}
					}); 
	}

	@POST
	@Path("/addUser")
	public void sendEmail(@RequestBody SearchRequest searchRequest) {

		/*
		 * New offeres will be sent to the saved email address - Batch need to be there to
		 * check the promocode and saved flight details and based on this offer emails
		 * should be sent to users using JMS.
		 */
	}
	
	
	/*Assumption -- At the time of selecting one or more flight
	from the search result, additional details will be 
	added to serchrequest from searchresponse. */
	@POST
	@Path("/add")
	
	public void saveSelectedSearchResult(@RequestBody SearchRequest searchRequest) {
	
	//Start -- To add search details for future reference and for sending offers
	UserSearchDetails searchDetails = new UserSearchDetails();
	searchDetails.setUserId(searchRequest.getUserId());
	searchDetails.setEmailId(searchRequest.getEmailAddress());
	searchDetails.setFrequency(searchRequest.getFrequency());
	searchDetails.setOrigin(searchRequest.getOrigin());
	searchDetails.setDestination(searchRequest.getDestination());
	searchDetails.setFlightNo(searchRequest.getFlightNo());
	searchDetails.setOriginalPrice(searchRequest.getOriginalPrice());
	searchDetails.setDiscount(searchRequest.getDiscount());
	searchDetails.setDiscountPrice(searchRequest.getDiscountPrice());
	searchDetails.setDateOfFlight(searchRequest.getDateOfFlight());
  	searchDetails = searchDetailsRepoistry.save(searchDetails);
    //End -- To add search details for future reference and for sending offers
	}

}
