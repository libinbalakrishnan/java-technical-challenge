package com.springdatajpa.bo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*For Flight search details*/ 
@Entity
@Table(schema="dbo",name ="userSearDetails")
public class UserSearchDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id")
	private Integer userId; 

	@Column(name = "username")
	private String  userName;
	
	@Column(name = "emailId")
	private String emailId;
	
	@Column(name = "origin")
	private String origin;
	
	@Column(name = "destination")
	private String destination;

	@Column(name = "frequency")
	private String  frequency;
	
	@Column(name = "flightNo")
	public String flightNo;
	
	@Column(name = "originalPrice")
	public String originalPrice;
	
	@Column(name = "discount")
	public String discount;
	
	@Column(name = "discountPrice")
	public String discountPrice;
	
	@Column(name = "dateOfFlight")
	public Date dateOfFlight;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getFrequency() {
		return frequency;
	}

	public void setFrequency(String frequency) {
		this.frequency = frequency;
	}

	public String getFlightNo() {
		return flightNo;
	}

	public void setFlightNo(String flightNo) {
		this.flightNo = flightNo;
	}

	public String getOriginalPrice() {
		return originalPrice;
	}

	public void setOriginalPrice(String originalPrice) {
		this.originalPrice = originalPrice;
	}

	public String getDiscount() {
		return discount;
	}

	public void setDiscount(String discount) {
		this.discount = discount;
	}

	public String getDiscountPrice() {
		return discountPrice;
	}

	public void setDiscountPrice(String discountPrice) {
		this.discountPrice = discountPrice;
	}

	public Date getDateOfFlight() {
		return dateOfFlight;
	}

	public void setDateOfFlight(Date dateOfFlight) {
		this.dateOfFlight = dateOfFlight;
	}
	
}
