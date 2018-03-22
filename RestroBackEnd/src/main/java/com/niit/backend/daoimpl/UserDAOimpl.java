package com.niit.backend.daoimpl;

import java.sql.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.backend.dao.UserDAO;
import com.niit.backend.domain.User;



//another annotation...
@Transactional
@Repository("userDAO") // will create instance of UserDAOImpl and the name will userDAO
public class UserDAOimpl implements UserDAO {

	// first - inject hibernate session.
	// @Autowire

	@Autowired // session factory will automatically inject in this class
	private SessionFactory sessionFactory;

	@Autowired
	private User user;

	//
	public boolean save(User user) {
		// store in the database.
		try {
			user.setRole('C');

			user.setRegisteredDate(new Date(System.currentTimeMillis()) + "");
			sessionFactory.getCurrentSession().save(user);
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}

	}

	public boolean update(User user) {
		try {
			sessionFactory.getCurrentSession().update(user);
			return true;
		} catch (HibernateException e) {
		e.printStackTrace();
			return false;
		}

	}

	public User get(String emailID) {
		// it will fetch the record based on emailID and store in User class
		return sessionFactory.getCurrentSession().get(User.class, emailID);

	}

	public boolean delete(String emailID) {
		try {
			user = get(emailID);
			if (user == null) {
				return false;
			}

			sessionFactory.getCurrentSession().delete(user);

			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}

	}

	@SuppressWarnings("unchecked")
	public List<User> list() {
	return	sessionFactory.getCurrentSession().createQuery("from User").list();
	}

	@SuppressWarnings("deprecation")
	public User validate(String emailID, String password) {
		//select * from user where emailID = "display our mail id
	return (User)sessionFactory.getCurrentSession().
	createCriteria(User.class).
	add(Restrictions.eq("EmailID",emailID))
	.add(Restrictions.eq("password",password)).uniqueResult();
	}

}
