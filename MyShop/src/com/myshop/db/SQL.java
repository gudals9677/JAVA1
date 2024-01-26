package com.myshop.db;

public class SQL {

	public static final String INSERT_CUSTOMER = "INSERT INTO `CUSTOMER` SET " 
												+ "`custId`=?,"
												+ "`name`=?,"
												+ "`hp`=?,"
												+ "`addr`=?,"
												+ "`rdate`=NOW()";
	public static final String SELECT_CUSTOMER = "SELECT * FROM `Customer` WHERE `custId`=?";
	public static final String SELECT_CUSTOMERS = "";
	public static final String UPDATE_CUSTOMER = "";
	public static final String DELETE_CUSTOMER = "";
	
	public static final String INSERT_ORDER = "INSERT INTO `order` set "
											+ "`orderId`=?,"
											+ "`orderProduct`=?,"
											+ "orderCount`=?,"
											+ "orderDate(NOW)";
											
	public static final String SELECT_ORDER = "";
	public static final String SELECT_ORDERS = "SELECT a.*,`prodname`,`price`,`company` FROM `order` AS a "
												+ "Join `Product` as b on a.orderProduct = b.prodno "
												+ "where `orderid` =? "
												+ "Order by `orderDate` DESC";
	public static final String UPDATE_ORDER = "";
	public static final String DELETE_ORDER = "";
	
	public static final String INSERT_PRODUCT = "";
	public static final String SELECT_PRODUCT = "";
	public static final String SELECT_PRODUCTS = "SELECT * from `product`";
	public static final String UPDATE_PRODUCT = "";
	public static final String UPDATE_PRODUCT_STOCK = "UPDATE `product` set `stock` = `stock` - ? "
															+ "where `prodno`=?";
	public static final String DELETE_PRODUCT = "";
}
