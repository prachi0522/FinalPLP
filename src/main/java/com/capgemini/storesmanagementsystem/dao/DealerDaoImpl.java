package com.capgemini.storesmanagementsystem.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.capgemini.storesmanagementsystem.dto.OrderDetailsInfo;

public class DealerDaoImpl implements DealerDao {
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	Statement stmt = null;

//	public boolean loginDealer(String name,String password,String id) {
//		boolean isCheck=false;
//
//		try {
//			Class.forName("com.mysql.jdbc.Driver");
//			String dburl = "jdbc:mysql://localhost:3306/stores_management_db?user=root&password=hr";
//			con = DriverManager.getConnection(dburl);
//			String qry = "select userName,password from userDetailsInfo where userId ='" + id + "'";
//			pstmt = con.prepareStatement(qry);
//			rs = pstmt.executeQuery();
//            pstmt.setString(1,id);
//			while (rs.next()) {
//				 if(rs.getString("userName").equals(name)&& rs.getString("password").equals(password)) {
//					 isCheck=true;
//				 }else {
//					// log.info("wrong credentials");
//				 }
//			}
//		} catch (Exception e) {
//			e.getMessage();
//		}
//
//		return isCheck;
//	}

	public boolean makeOrder(OrderDetailsInfo order) {
		boolean isAdded = false;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String dburl = "jdbc:mysql://localhost:3306/stores_management_db?user=root&password=hr";
			con = DriverManager.getConnection(dburl);
			String qry = " insert into  orderDetailsInfo values (?,?,?,?,?,?,?)";
			pstmt = con.prepareStatement(qry);
			pstmt.setInt(1, order.getOrderId());
			pstmt.setInt(2, order.getProductId());
			pstmt.setInt(3, order.getQuantity());
			pstmt.setString(4, order.getAddress());
			pstmt.setInt(5, order.getUserId());
			pstmt.setString(6, order.getUserName());
			pstmt.setString(7, order.getPassword());
			

			int r = pstmt.executeUpdate();
			System.out.println(r);
			if (r != 0) {
				isAdded = true;
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}

		return isAdded;
	}

	public boolean deleteOrder(Integer orderId) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String dburl = "jdbc:mysql://localhost:3306/stores_management_db?user=root&password=hr";
			con = DriverManager.getConnection(dburl);
			String qry = "delete from orderDetailsInfo where orderId=?";
			pstmt = con.prepareStatement(qry);
			pstmt.setInt(1, orderId);
			pstmt.executeUpdate();
		} catch (Exception e) {

			e.getMessage();
		}
		return true;
	}

	public List<String> showAllproducts() {
		List<String> productlist = new ArrayList<String>();

		try {
			Class.forName("com.mysql.jdbc.Driver");
			String dburl = "jdbc:mysql://localhost:3306/stores_management_db?user=root&password=hr";
			Connection con = DriverManager.getConnection(dburl);
			String qry = "select * from productDetailsInfo";
			Statement stmt = con.createStatement();

			ResultSet rs = stmt.executeQuery(qry);

			while (rs.next()) {
				productlist.add(rs.getString("productName"));
			}
		} catch (Exception e) {

			e.getMessage();
		}
		return productlist;
	}

	public List<String> viewMyStore(int storesId) {
		List<String> storelist = new ArrayList<String>();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String dburl = "jdbc:mysql://localhost:3306/stores_management_db?user=root&password=hr";
			Connection con = DriverManager.getConnection(dburl);
			String qry = "select * from storesInfo where storesId=?";
			Statement stmt = con.createStatement();

			ResultSet rs = stmt.executeQuery(qry);

			while (rs.next()) {
				storelist.add(rs.getString("numOfItems"));
			}

		} catch (Exception e) {

			e.getMessage();
		}
		return storelist;
	}

	public List<String> viewMyOrders(String userId) {
		List<String> orderlist = new ArrayList<String>();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String dburl = "jdbc:mysql://localhost:3306/stores_management_db?user=root&password=hr";
			Connection con = DriverManager.getConnection(dburl);
			String qry = "select * from orderDetailsInfo where userId=?";
			Statement stmt = con.createStatement();

			ResultSet rs = stmt.executeQuery(qry);

			while (rs.next()) {
				orderlist.add(rs.getString("userName"));
			}
		} catch (Exception e) {

			e.getMessage();
		}
		return orderlist;
	}

}
