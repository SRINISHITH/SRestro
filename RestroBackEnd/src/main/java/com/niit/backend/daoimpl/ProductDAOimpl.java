package com.niit.backend.daoimpl;



import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.backend.dao.ProductDAO;
import com.niit.backend.domain.Product;

//another annotation...
@Transactional
@Repository("productDAO") // will create instance of ProductDAOImpl and the name will productDAO
public class ProductDAOimpl implements ProductDAO {

	// first - inject hibernate session.
	// @Autowire

	@Autowired // session factory will automatically inject in this class
	private SessionFactory sessionFactory;

	@Autowired
	private Product product;

	//
	public boolean save(Product product) {
		// store in the database.
		try {
			sessionFactory.getCurrentSession().save(product);
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}

	}

	public boolean update(Product product) {
		try {
			sessionFactory.getCurrentSession().update(product);
			return true;
		} catch (HibernateException e) {
		e.printStackTrace();
			return false;
		}

	}

	public Product get(String id) {
		// it will fetch the record based on emailID and store in Product class
		return sessionFactory.getCurrentSession().get(Product.class,id);

	}

	public boolean delete(String id) {
		try {
			product = get(id);
			if (product == null) {
				return false;
			}

			sessionFactory.getCurrentSession().delete(product);

			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}

	}
	@SuppressWarnings("unchecked")
	public List<Product> list() {
		return	sessionFactory.getCurrentSession().createQuery("from Product").list();
		}


	
}
