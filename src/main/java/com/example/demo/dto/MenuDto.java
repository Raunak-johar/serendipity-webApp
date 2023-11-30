package com.example.demo.dto;

public class MenuDto{
	
	public String name;
	
	public int price;
	
	public String description;
	
	public void setName(String name) {this.name=name;}
	public void setDescription(String desc) {this.description =desc;}
	public void setPrice(int price) {this.price = price;}
	
	public String getName() {return this.name;}
	public String getDescription() {return this.description;}
	public int getPrice() {return this.price;}
	
	  @Override
	  public String toString() {
	    return name + "," + price + "," + description;
	  }
}