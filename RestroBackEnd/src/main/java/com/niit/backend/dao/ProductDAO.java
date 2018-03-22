package com.niit.backend.dao;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.niit.backend.domain.Product;

@Component
@Repository
//DAO -> Data Access Object
public interface ProductDAO {

	//declare the methods.
	//create new product
	public boolean save(Product product);
	
	//update the existing product
	public boolean update(Product product);
	
	//get the product details
	public Product get(String id);
	
	//delete the product
	public   boolean    delete(String id);
	
	//to get all the products
	public List<Product>   list();	
	
}
