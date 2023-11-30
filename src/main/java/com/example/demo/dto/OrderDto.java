package com.example.demo.dto;

import java.sql.Date;
import org.json.JSONObject;

public class OrderDto {
	
	String name;
	String apartment;
	String specifications;
	String houseNo;
	long contact;
	JSONObject orderPlaced;
	String orderDate;
	String status;
	
	public String getName() {
		return this.name;
	}

	public String getApartment() {
		return this.apartment;
	}

	public String getSpecs() {
		return this.specifications;
	}

	public String getHouseNo() {
		return this.houseNo;
	}

	public long getContact() {
		return this.contact;
	}

	public JSONObject getOrder() {
		return this.orderPlaced;
	}

	public String getDate() {
		return this.orderDate;
	}

	public String getStatus() {
		return this.status;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setApartment(String apartment) {
		this.apartment = apartment;
	}

	public void setSpecs(String specs) {
		this.specifications = specs;
	}

	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}

	public void setOrder(JSONObject order) {
		this.orderPlaced = order;
	}

	public void setDate(String date) {
		this.orderDate = date;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
}