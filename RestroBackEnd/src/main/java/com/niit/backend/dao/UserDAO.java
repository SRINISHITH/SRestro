package com.niit.backend.dao;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.niit.backend.domain.User;
@Component
@Repository
//DAO -> Data Access Object
public interface UserDAO {

	//declare the methods.
	//create new user and to save it
	public boolean save(User user);
	
	//update the existing user
	public boolean update(User user);
	
	//to get the user details
	public   User     get(String emailID);
	
	//delete the user
	public   boolean    delete(String emailID);
	
	//to get all the users
	public List<User>   list();
	
	//validate whether the credentials are correct or not.
	public User validate(String emailID, String password);
	
}
