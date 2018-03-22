package com.niit.RestroBackEnd;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.backend.dao.UserDAO;
import com.niit.backend.domain.User;

public class UserDAOtest {
private static AnnotationConfigApplicationContext context;
	
	@Autowired
	private static UserDAO userDAO;
	
	@Autowired
	private static User user;
	
	
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
		//ask the context to get instance of UserDAO
		userDAO = (UserDAO)context.getBean("userDAO");
		user = (User)context.getBean("user");
	}
	@Test
	public void saveUserTestCase()
	{
		
		user.setEmailId("sri@gmail.com");
		user.setRole('C');
		user.setName("sri");
		user.setPassword("sri2145");
		user.setMobile("9600369809");
	  boolean status = 	userDAO.save(user);
	  
	  assertEquals("save user test case", true, status);
	}
	
	
	public static AnnotationConfigApplicationContext getContext() {
		return context;
	}
	public static void setContext(AnnotationConfigApplicationContext context) {
		UserDAOtest.context = context;
	}
	public static UserDAO getUserDAO() {
		return userDAO;
	}
	public static void setUserDAO(UserDAO userDAO) {
		UserDAOtest.userDAO = userDAO;
	}
	public static User getUser() {
		return user;
	}
	public static void setUser(User user) {
		UserDAOtest.user = user;
	}
	@Test
	public void updateUserTestCase()
	{
		user.setEmailId("nishith@gmail.com");
		user.setRole('c');
		boolean status = userDAO.update(user);
		assertEquals("update test case", true,status );
	}
	
	@Test
	public void getUserSuccessTestCase()
	{
		
	user= userDAO.get("nishith@gmail.com");
	
	assertNotNull("get user test case", user);
	}
	
	@Test
	public void getUserFailureTestCase()
	{
		
	user= userDAO.get("reddy@gmail.com");
	
	assertNull("get user test case", user);
	}
	
	@Test
	public void deleteUserSuccessTestCase()
	{
	boolean status =	userDAO.delete("ssreddy@gmail.com");
	assertEquals("delete user succss test case" , true, status);
	
	}
	
	@Test
	public void deleteUserFailureTestCase()
	{
	boolean status =	userDAO.delete("nish@gmail.com");
	assertEquals("delete user failure test case" , false, status);
	
	}
	
	
	@Test
	public void getAllUsersTestCase()
	{
	List<User>	users = userDAO.list();
	
	assertEquals("get all usres " , 4, users.size() );
	
	}
	@Test
	public void validateCredentailsTestCase()
	{
	user = 	userDAO.validate("sri@gmail.com","sri2145");
	assertNotNull("Validate test case",user );
	
	}
}
