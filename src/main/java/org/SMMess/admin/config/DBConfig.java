package org.SMMess.admin.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBConfig {
	protected Connection conn;
	protected PreparedStatement stmt;
	protected ResultSet rs;

	public DBConfig() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			// local
			// conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/SMMess", "Hemant@123", "root");

			// server
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/smmess", "root",
					"Hemant@123");

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
