package com.niit.RestroBackEnd;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.backend.dao.ProductDAO;
import com.niit.backend.domain.Product;

public class ProductDAOtest 
{
private static AnnotationConfigApplicationContext context;
	
	@Autowired
	private static ProductDAO productDAO;
	
	@Autowired
	private static Product product;
	
	
	@BeforeClass
	public static void init()
	{
		context = new AnnotationConfigApplicationContext();
		//scan the complete package and check for annoations like
		//@Component, @Controller, @Repository, @Service
		context.scan("com.niit"); 
		//clear the context(bean factory, and recreate all the
		//instances of the classes which are there in com.niit
		//with proper annotations.
		context.refresh();
		//ask the context to get instance of ProductDAO
		productDAO = (ProductDAO)context.getBean("productDAO");
		product = (Product)context.getBean("product");
	}
	@Test
	public void saveProductTestCase()
	{
		product.setId("Starters-2");
		product.setName("VEG");
		product.setDescription("This are VEG starters");
	
		
	  boolean status = 	productDAO.save(product);
	  
	  assertEquals("save product test case", true, status);
	}
	
	
	@Test
	public void updateProductTestCase()
	{
		product.setId("starters-3");
		product.setName("Non Veg");
		boolean status = productDAO.update(product);
		assertEquals("update test case", true,status );
	}
	
	@Test
	public void getProductSuccessTestCase()
	{
		
	product= productDAO.get("starters");
	
	assertNotNull("get product test case", product);
	}
	
	@Test
	public void getProductFailureTestCase()
	{
		
	product= productDAO.get("BKR");
	
	assertNull("get product test case", product);
	}
	
	@Test
	public void deleteProductSuccessTestCase()
	{
	boolean status =	productDAO.delete("punner");
	assertEquals("delete product succss test case" , true, status);
	
	}
	
	@Test
	public void deleteProductFailureTestCase()
	{
	boolean status =	productDAO.delete("punner");
	assertEquals("delete product failure test case" , false, status);
	
	}

	@Test
	public void getAllProductsTestCase()
	{
	List<Product>	products = productDAO.list();
	
	assertEquals("get all usres " , 1, products.size() );
	
	}	
}
