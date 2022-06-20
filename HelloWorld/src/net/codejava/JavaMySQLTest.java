package net.codejava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JavaMySQLTest {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/studentinfo";
		String username = "root";
		String password = "";
		
		try {
			Connection connection = DriverManager.getConnection(url, username, password);
			System.out.println("Connected to database");
			
			String sql = "INSERT INTO details (id, name, address, phone) VALUES (?, ?,?,?)";
			
			PreparedStatement state = connection.prepareStatement(sql);
			state.setString(1, "1");
			state.setString(2, "john");
			state.setString(3, "california");
			state.setString(4, "7002925965");
			
			state.executeUpdate();
			
			state.close();
			connection.close();
			
			
		} catch (SQLException e) {
			System.out.println("Yup! Error");
			e.printStackTrace();
		}

	}

}
