package com.training.prodsvc;

import java.sql.SQLException;

public class ProductServiceImpl implements ProductService {

	//List<Product> prodList = new ArrayList();
	
	ProductDaoImpl daoProd = new ProductDaoImpl();
	@Override
	public String[] getProductInfo() throws ClassNotFoundException, SQLException {
		
		daoProd.display();
		return daoProd.getData();
	}

	@Override
	public String addProduct(Product prod) {
		
		daoProd.addProduct(prod);
		return "New Product Added";
	}

	@Override
	public String updateProduct(Product prod) {
		
		String str  = daoProd.updateProduct(prod);
		if(str == null)
			return "No Such Product Found";
		else 
			return str;
	}

	@Override
	public String deleteProduct(Product prod) {
		
		String str  = daoProd.deleteProduct(prod);
		if(str == null)
			return "No Such Product Found";
		else return str;
	}
	

}
