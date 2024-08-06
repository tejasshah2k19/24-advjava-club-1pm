package com.google.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {

	public static void main(String[] args) {

		System.out.println("====================");

		String dirverName = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/club24";
		String userName = "root";
		String password = "root";

		try {
			 
			
			//DriverManager class will open the connection with database 
			//once we got the database connection we have to store that 
			//in some variable so we can use it later . 
			// to store database connection we have connection in java.sql package 
			Connection con = DriverManager.getConnection(url, userName, password);
			System.out.println(con);// hashcode

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("connection fail....");
		}
	}
}
