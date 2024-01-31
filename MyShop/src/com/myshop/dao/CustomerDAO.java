package com.myshop.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import com.myshop.db.DBHelper;
import com.myshop.db.SQL;
import com.myshop.dto.CustomerDTO;

public class CustomerDAO extends DBHelper {
	private static CustomerDAO instance = new CustomerDAO();

	public static CustomerDAO getInstance() {
		return instance;
	}

	private CustomerDAO() {
	}
	// CRUD메서드
	public void insertCustomer(CustomerDTO dto) {
		try {
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.INSERT_CUSTOMER);
			
			psmt.setString(1, dto.getCustId());
			psmt.setString(2, dto.getName());
			psmt.setString(3, dto.getHp());
			psmt.setString(4, dto.getAddr());
			
			psmt.executeUpdate();
			close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public CustomerDTO selectCustomer(String custId) {
			
		CustomerDTO customer = null;
		try {
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.SELECT_CUSTOMER);
			psmt.setString(1, custId);
			rs = psmt.executeQuery();
			
			if(rs.next()) {
				customer = new CustomerDTO();
				customer.setCustId(rs.getString(1));
				customer.setName(rs.getString(2));
				customer.setHp(rs.getString(3));
				customer.setAddr(rs.getString(4));
				customer.setRdate(rs.getString(5));
				
				close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return customer;
	}

	public List<CustomerDTO> selectCustomers() {

		try {

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public void updateCustomer(CustomerDTO dto) {

		try {

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void deleteCustomer(String custId) {

		try {

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
