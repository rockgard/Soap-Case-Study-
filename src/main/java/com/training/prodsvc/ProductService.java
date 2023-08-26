package com.training.prodsvc;

import java.sql.SQLException;
import java.util.ArrayList;

public interface ProductService {

	String[] getProductInfo() throws ClassNotFoundException, SQLException;
	
	String addProduct(Product prod);
	
	String updateProduct(Product prod);
	
	String deleteProduct(Product prod);
}
