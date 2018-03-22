package com.niit.RestroBackEnd;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.backend.dao.CategoryDAO;
import com.niit.backend.domain.Category;

public class CategoryDAOtest 
{
private static AnnotationConfigApplicationContext context;
	
	@Autowired
	private static CategoryDAO categoryDAO;
	
	@Autowired
	private static Category category;
	
	
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
		//ask the context to get instance of CategoryDAO
		categoryDAO = (CategoryDAO)context.getBean("categoryDAO");
		category = (Category)context.getBean("category");
	}
	@Test
	public void saveCategoryTestCase()
	{
		category.setId("Bir-02");
		category.setName("Reddy");
		category.setDescription("This is Veg category");
	
		
	  boolean status = 	categoryDAO.save(category);
	  
	  assertEquals("save category test case", true, status);
	}
	
	
	@Test
	public void updateCategoryTestCase()
	{
		category.setId("Bir-03");
		category.setName("Veg Category");
		boolean status = categoryDAO.update(category);
		assertEquals("update test case", true,status );
	}
	
	@Test
	public void getCategorySuccessTestCase()
	{
		
	category= categoryDAO.get("Bir-003");
	
	assertNotNull("get category test case", category);
	}
	
	@Test
	public void getCategoryFailureTestCase()
	{
		
	category= categoryDAO.get("Veg");
	
	assertNull("get category test case", category);
	}
	
	@Test
	public void deleteCategorySuccessTestCase()
	{
	boolean status =	categoryDAO.delete("Veg-0");
	assertEquals("delete category succss test case" , true, status);
	
	}
	
	@Test
	public void deleteCategoryFailureTestCase()
	{
	boolean status =	categoryDAO.delete("bir");
	assertEquals("delete category failure test case" , false, status);
	
	}
	
	
	@Test
	public void getAllCategorysTestCase()
	{
	List<Category>	categorys = categoryDAO.list();
	
	assertEquals("get all usres " ,2, categorys.size() );
	}
}
