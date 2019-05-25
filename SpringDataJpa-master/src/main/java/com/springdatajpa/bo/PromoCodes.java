package com.springdatajpa.bo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*For Promocode details */
@Entity
@Table(schema="dbo",name ="promoCodes")
public class PromoCodes {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "promocode_id")
	private Integer promocodeId; 
	
	@Column(name = "frequency")
	private String  frequency;
	
	@Column(name = "from")
	private String from;
	
	@Column(name = "to")
	private String to;
	
	@Column(name = "percentage")
	private String percentage;
	
	@Column(name = "flightNo")
	private String flightNo;
	
	@Column(name = "originalPrice")
	private Long originalPrice;
	
	@Column(name = "dateOfJrny")
	private Date dateOfJrny;

	public Date getDateOfJrny() {
		return dateOfJrny;
	}

	public void setDateOfJrny(Date dateOfJrny) {
		this.dateOfJrny = dateOfJrny;
	}

	public Long getOriginalPrice() {
		return originalPrice;
	}

	public void setOriginalPrice(Long originalPrice) {
		this.originalPrice = originalPrice;
	}

	public String getFlightNo() {
		return flightNo;
	}

	public void setFlightNo(String flightNo) {
		this.flightNo = flightNo;
	}

	public Integer getPromocodeId() {
		return promocodeId;
	}

	public void setPromocodeId(Integer promocodeId) {
		this.promocodeId = promocodeId;
	}

	public String getFrequency() {
		return frequency;
	}

	public void setFrequency(String frequency) {
		this.frequency = frequency;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getPercentage() {
		return percentage;
	}

	public void setPercentage(String percentage) {
		this.percentage = percentage;
	}
	
	
	

}
