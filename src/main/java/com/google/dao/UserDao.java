package com.google.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

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

	public ArrayList<UserBean> getAllUsers() {
		ArrayList<UserBean> users = new ArrayList<UserBean>();

		try {
			Class.forName(driverName);

			Connection con = DriverManager.getConnection(url, userName, password);
			PreparedStatement pstmt = con.prepareStatement("select * from users");
			ResultSet rs = pstmt.executeQuery();// ResultSet

			// resultset has all the data from the database
			while (rs.next()) {// false -> loop stop
				UserBean user = new UserBean();
				user.setUserId(rs.getInt("userId"));// userId name is belongs to database
				user.setFirstName(rs.getString("firstName"));//
				user.setEmail(rs.getString("email"));
				user.setPassword(rs.getString("password"));
				users.add(user);
			}

		} catch (Exception e) {
			System.out.println("ERROR in getAllUsers()");
			e.printStackTrace();
		}

		return users;
	}

	public void deleteUserById(Integer userId) {
		try {
			Class.forName(driverName);
			Connection con = DriverManager.getConnection(url, userName, password);
			PreparedStatement pstmt = con.prepareStatement("delete from users where userId = ?");
			pstmt.setInt(1, userId);
			pstmt.executeUpdate();

		} catch (Exception e) {
			System.out.println("ERROR in deleteUserById()");
			e.printStackTrace();
		}

	}

}
