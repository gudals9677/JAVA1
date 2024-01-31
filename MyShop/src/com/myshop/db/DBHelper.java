package com.myshop.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBHelper {


	// DB자원
	protected Connection conn = null;
	protected Statement stmt = null;
	protected PreparedStatement psmt = null;
	protected PreparedStatement psmtEtc = null;
	protected ResultSet rs = null;

	// DB정보
	private final String HOST = "jdbc:mysql://127.0.0.1:3306/shop";
	private final String USER = "gudals";
	private final String PASS = "1234";

	public Connection getConnection() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		return DriverManager.getConnection(HOST, USER, PASS);
	}

	public void close() throws SQLException {
		
		if(rs!=null) {
			rs.close();
		}
		if(stmt!=null) {
			stmt.close();
		}
		if(psmt!=null) {
			psmt.close();
		}
		if(psmtEtc!=null) {
			psmtEtc.close();
		}
		if(conn!=null) {
			conn.close();
		}
	}
	
}
