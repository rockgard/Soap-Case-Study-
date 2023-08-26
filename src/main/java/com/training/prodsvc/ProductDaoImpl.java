package com.training.prodsvc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ProductDaoImpl implements ProductDao {

	String[] data = new String[20];
	@Override
	public void addProduct(Product prod) {
		
		//System.out.println("executed succesfully");
		try {
			Connection conn = dbConnection.getConnection();
			PreparedStatement stmt = conn.prepareStatement("INSERT INTO PRODUCT VALUES (?, ?)");
			stmt.setString(1, prod.getProdId());
			stmt.setString(2, prod.getProdName());
			stmt.executeUpdate();
			//System.out.println("executed succesfully");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public String updateProduct(Product prod) {
		
		try {
			Connection conn = dbConnection.getConnection();
			PreparedStatement ps = conn.prepareStatement("SELECT * FROM PRODUCT WHERE PROD_ID = ?");
			ps.setString(1, prod.getProdId());
			
			ResultSet rs  = ps.executeQuery();
			
			if(rs.next())
			{
				PreparedStatement stmt = conn.prepareStatement("UPDATE PRODUCT SET PROD_NAME = ? WHERE PROD_ID = ?");
				stmt.setString(1, prod.getProdName());
				stmt.setString(2, prod.getProdId());
				stmt.executeUpdate();
				return "Updated";
			}
			
			return null;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}

	@Override
	public String deleteProduct(Product prod) {
		
		Connection conn;
		try {
			conn = dbConnection.getConnection();
			PreparedStatement ps = conn.prepareStatement("SELECT * FROM PRODUCT WHERE PROD_ID = ?");
			ps.setString(1, prod.getProdId());
			
			ResultSet rs  = ps.executeQuery();
			
			if(rs.next())
			{
				PreparedStatement stmt = conn.prepareStatement("DELETE FROM PRODUCT WHERE PROD_ID = ?");
				stmt.setString(1, prod.getProdId());
				stmt.executeUpdate();
				return "DELETED ";
			}
			
			return null;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	
	}

	@Override
	public void display() throws SQLException, ClassNotFoundException {
		
		Connection con = dbConnection.getConnection();
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM PRODUCT");
		int i = 0;
		while(rs.next())
		{
			String str = rs.getString(1) + "	" + rs.getString(2);
			data[i] = str;
			i++;
		}
		
	}

	public String[] getData() {
		return data;
	}

	public void setData(String[] data) {
		this.data = data;
	}

}
