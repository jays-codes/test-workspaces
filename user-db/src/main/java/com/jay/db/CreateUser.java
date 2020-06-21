package com.jay.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class CreateUser {

	public static void main(String[] args) throws SQLException {
		
		String dbURL = "jdbc:mysql://localhost:3306/pluralsight";
		String dbUser = "pluralsight";
		String password = "pluralsight";
		
		Connection conn = DriverManager.getConnection(dbURL, dbUser, password);
		
		PreparedStatement psmt = conn.prepareStatement("insert into user (name, age) values(?, ?)");
		
		psmt.setString(1, "Mary");
		psmt.setInt(2, 32);
		psmt.addBatch();
		
		psmt.setString(1, "John");
		psmt.setInt(2, 22);
		psmt.addBatch();

		psmt.setString(1, "James");
		psmt.setInt(2, 36);
		psmt.addBatch();

		psmt.setString(1, "Pat");
		psmt.setInt(2, 54);
		psmt.addBatch();

		int[] executeBatch = psmt.executeBatch();
		for (int n : executeBatch) {
			System.out.println("n=" + n);
		}
	}

}
