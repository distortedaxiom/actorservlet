package com.cognixia.jump.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {
	
	// Windows: jdbc:mysql://localhost:3306/university
	// Mac/Linux: jdbc:mysql://localhost:3306/university?serverTimezone=EST5EDT 
	public static final String URL = "jdbc:mysql://localhost:3306/university";
	public static final String USERNAME = "root";
	public static final String PASSWORD = "Voidcrash97"; // Windows: root | Mac/Linux: Root@123

	private static  Connection connection = null;
	
	private static void makeConnection() {
		
		try {
		connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		} catch (SQLException e) {
			System.out.println("Could not make connection to database");
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection() {
		if (connection == null) {
			makeConnection();
		}
		
		return connection;
	}
	
	
}