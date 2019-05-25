package com.springdatajpa.bo;

import java.io.Serializable;
import java.util.Date;

public class SearchResponse implements Serializable {
	
	public String flightNo;
	
	public String origin;
	
	public String destination;
	
	public Date dateOfFlight;
	
	public String originalPrice;
	
	public String discount;
	
	public String discountPrice;
	
	public String dateOfJrny;

	public String getDateOfJrny() {
		return dateOfJrny;
	}

	public void setDateOfJrny(String dateOfJrny) {
		this.dateOfJrny = dateOfJrny;
	}

	public String getFlightNo() {
		return flightNo;
	}

	public void setFlightNo(String flightNo) {
		this.flightNo = flightNo;
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

	public Date getDateOfFlight() {
		return dateOfFlight;
	}

	public void setDateOfFlight(Date dateOfFlight) {
		this.dateOfFlight = dateOfFlight;
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

}
