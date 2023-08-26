package com.training.prodsvc;

import java.util.List;

public class ProductWsTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProductServiceImplService obj = new  ProductServiceImplService();
		
		ProductServiceImpl prodSrvc = obj.getProductServiceImpl();
		
		//.out.println(prodSrvc.getProductInfo());
		
		Product prod = new Product();
		prod.setProdId("EI456");
		prod.setProdName("Coke");
		System.out.println(prodSrvc.addProduct(prod));
		prod.setProdName("limca");
		System.out.println(prodSrvc.updateProduct(prod));
		System.out.println(prodSrvc.deleteProduct(prod));
		List<String> str = prodSrvc.getProductInfo();
		for(int i = 0; i < str.size();i ++)
		{
			System.out.println(str.get(i));
		}
		
	}

}
