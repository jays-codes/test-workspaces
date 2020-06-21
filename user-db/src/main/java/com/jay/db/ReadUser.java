package com.jay.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ReadUser {

	public static void main(String[] args) throws SQLException {
		
		String dbUrl = "jdbc:mysql://localhost:3306/pluralsight";
		String dbUser = "pluralsight";
		String password = "pluralsight";
		
		Connection conn = DriverManager.getConnection(dbUrl, dbUser, password);
		
		Statement stmt = conn.createStatement();
		ResultSet rSet = stmt.executeQuery("select name, age from user");
		
		List<User> users = new ArrayList<>();
		
		while (rSet.next()) {
			String name = rSet.getString(1);
			int age = rSet.getInt(2);
			User user = new User(name,age);
			users.add(user);
		}
		users.forEach(System.out::println);
	}

}
