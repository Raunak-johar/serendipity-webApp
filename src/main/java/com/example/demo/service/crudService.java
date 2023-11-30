package com.example.demo.service;

import org.springframework.stereotype.Service;
import com.example.demo.dto.OrderDto;
import com.example.demo.dto.MenuDto;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
import java.sql.SQLException;

@Service
public class crudService {

	Connection connection = null;
	Statement statement = null;
	PreparedStatement preparedStatement = null;
	OrderDto inputorderdto = null;

	public crudService() throws SQLException {

		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sfuDB", "root", "Mysql@123");
		statement = connection.createStatement();
	}

	// ---------------------

	private List<OrderDto> createResultOrder(ResultSet resultset) throws SQLException {

		List<OrderDto> resultDto = new ArrayList<>();

		while (resultset.next()) {
			OrderDto orderdto = new OrderDto();

			orderdto.setApartment(resultset.getString("apartmentName"));
			orderdto.setHouseNo(resultset.getString("flatNo"));
			orderdto.setSpecs(resultset.getString("specifications"));
			orderdto.setContact(resultset.getLong("phoneNo"));

			resultDto.add(orderdto);
		}

		return resultDto;
	}

	private List<MenuDto> createResultMenu(ResultSet resultset) throws SQLException {

		List<MenuDto> menuDto = new ArrayList<>();

		while (resultset.next()) {
			MenuDto menudto = new MenuDto();

			menudto.setName(resultset.getString("name"));
			menudto.setPrice(resultset.getInt("price"));
			menudto.setDescription(resultset.getString("description"));

			menuDto.add(menudto);
		}

		return menuDto;
	}

	// ----------------

	public List<MenuDto> displayMenu() throws SQLException {

		ResultSet resultSet = statement.executeQuery("SELECT * FROM MENU;");

		List<MenuDto> menuDtoList = createResultMenu(resultSet);

		return menuDtoList;

	}

	// --------------

	public List<OrderDto> displayOrders() throws SQLException {

		ResultSet resultSet = statement.executeQuery("Select * from orders;");

		List<OrderDto> orderDtoList = createResultOrder(resultSet);

		return orderDtoList;
	}

	public int saveOrder(OrderDto order) throws SQLException {
	
		 int result = statement.executeUpdate("INSERT INTO ORDERS VALUES ('" + 
								 order.getName() 		+ "','" +
								 order.getApartment() 	+ "','" +
								 order.getSpecs() 		+ "','" +
								 order.getHouseNo() 	+ "','" +
								 order.getContact() 	+ "','" +
								 order.getOrder() 		+ "','" +
								 order.getDate() 		+ "','" +
								 order.getStatus()		+ "')"
								);
		return result;
		
	}

}