package com.training.prodsvc;

import java.sql.SQLException;

public interface ProductDao {
	
	void addProduct(Product prod);
	
	String updateProduct(Product prod);
	
	String deleteProduct(Product prod);
	
	void display() throws SQLException, ClassNotFoundException;
}
