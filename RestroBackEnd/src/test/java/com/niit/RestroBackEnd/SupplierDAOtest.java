package com.niit.RestroBackEnd;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.backend.dao.SupplierDAO;
import com.niit.backend.domain.Supplier;

public class SupplierDAOtest {

private static AnnotationConfigApplicationContext context;
	
	@Autowired
	private static SupplierDAO supplierDAO;
	
	@Autowired
	private static Supplier supplier;
	
	
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
		//ask the context to get instance of SupplierDAO
		supplierDAO = (SupplierDAO)context.getBean("supplierDAO");
		supplier = (Supplier)context.getBean("supplier");
	}
	@Test
	public void saveSupplierTestCase()
	{
		supplier.setId("SUP-1");
		supplier.setName("Big E");
		supplier.setAddress("This is Anna nagar");
	
		
	  boolean status = 	supplierDAO.save(supplier);
	  
	  assertEquals("save supplier test case", true, status);
	}
	
	
	@Test
	public void updateSupplierTestCase()
	{
		supplier.setId("SUP-1");
		supplier.setName("BKR");
		boolean status = supplierDAO.update(supplier);
		assertEquals("update test case", true,status );
	}
	
	@Test
	public void getSupplierSuccessTestCase()
	{
		
	supplier= supplierDAO.get("SUP-1");
	
	assertNotNull("get supplier test case", supplier);
	}
	
	@Test
	public void getSupplierFailureTestCase()
	{
		
	supplier= supplierDAO.get("SUP-1");
	
	assertNull("get supplier test case", supplier);
	}
	
	@Test
	public void deleteSupplierSuccessTestCase()
	{
	boolean status =	supplierDAO.delete("SUP-1");
	assertEquals("delete supplier succss test case" , true, status);
	
	}
	
	@Test
	public void deleteSupplierFailureTestCase()
	{
	boolean status =	supplierDAO.delete("SUP-1");
	assertEquals("delete supplier failure test case" , false, status);
	
	}
	
	
	@Test
	public void getAllSuppliersTestCase()
	{
	List<Supplier>	suppliers = supplierDAO.list();
	
	assertEquals("get all usres " , 1, suppliers.size() );
	
	}
	

}
