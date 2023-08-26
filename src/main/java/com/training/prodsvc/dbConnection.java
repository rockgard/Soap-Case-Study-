package com.training.prodsvc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dbConnection {
	
	static String url = "jdbc:oracle:thin:@localhost:1521/orcl.docker.internal";
	static String user = "scott";
	static String pass = "tiger";
	
	public static Connection getConnection() throws SQLException
	{
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Connection con = DriverManager.getConnection(url,user,pass);
		return DriverManager.getConnection(url,user,pass);
	}
}
