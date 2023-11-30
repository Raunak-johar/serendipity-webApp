package com.example.demo.controller;

import com.example.demo.service.crudService;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.dto.MenuDto;
import com.example.demo.dto.OrderDto;

@RestController
@CrossOrigin
public class crud {

	@Autowired
	crudService crudservice;

	@GetMapping("/display/menu")
	List<MenuDto> displayMenu() throws SQLException {
		return crudservice.displayMenu();
	}
	


	@PostMapping("/save/order")
	String saveOrder(@RequestBody OrderDto orderdto) throws SQLException {

		int result = crudservice.saveOrder(orderdto);
		
		if (result > 0) {
			return "Order placed successfully";
		}

		return "Failed to place the order! Please try again or contact us";
	}

	
	
//	@GetMapping("/display/orders")
//	String displayOrder() throws SQLException {
//
//	return crudservice.displayOrders().toString();
//	}

}