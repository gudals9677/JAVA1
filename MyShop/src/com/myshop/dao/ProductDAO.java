package com.myshop.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.myshop.db.DBHelper;
import com.myshop.db.SQL;
import com.myshop.dto.ProductDTO;

public class ProductDAO extends DBHelper{
	private static ProductDAO instance = new ProductDAO();

	public static ProductDAO getInstance() {
		return instance;
	}

	private ProductDAO() {
	}
	// CRUD메서드
	public void insertProduct(ProductDTO dto) {
		try {

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public ProductDTO selectProduct(int prodNo) {
		try {

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public List<ProductDTO> selectProducts() {
		
		List<ProductDTO> products = new ArrayList<>();
		try {
			conn = getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(SQL.SELECT_PRODUCTS);
			
			while(rs.next()) {
				ProductDTO product = new ProductDTO();
				product.setProdNo(rs.getInt(1));
				product.setProdName(rs.getString(1));
				product.setStock(rs.getInt(1));
				product.setPrice(rs.getInt(1));
				product.setCompany(rs.getString(1));
				products.add(product);
			}
				close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public void updateProduct(ProductDTO dto) {
		try {
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void deleteProduct(int prodNo) {
		try {

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
