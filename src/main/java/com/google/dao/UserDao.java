package com.google.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.google.bean.UserBean;

public class UserDao {

	String driverName = "com.mysql.cj.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/club24";
	String userName = "root";
	String password = "root";

	public void insertUser(UserBean user) {

		// insert into users (fristName,email,password) values (X,X,X);
		try {

			// load driver
			Class.forName(driverName);

			Connection con = DriverManager.getConnection(url, userName, password);
			PreparedStatement pstmt = con
					.prepareStatement("insert into users (firstName,email,password) values (?,?,?)");

			pstmt.setString(1, user.getFirstName());
			pstmt.setString(2, user.getEmail());
			pstmt.setString(3, user.getPassword());

			pstmt.executeUpdate(); // insert update delete

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
