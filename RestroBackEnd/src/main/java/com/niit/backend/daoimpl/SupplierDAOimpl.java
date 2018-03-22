package com.niit.backend.daoimpl;


import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.backend.dao.SupplierDAO;
import com.niit.backend.domain.Supplier;

@Transactional
@Repository("supplierDAO")
public class SupplierDAOimpl implements SupplierDAO {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Autowired
	private Supplier supplier;

	
	public boolean save(Supplier supplier) {
		try {
			sessionFactory.getCurrentSession().save(supplier);
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}

	}

	public boolean update(Supplier supplier) {
		try {
			sessionFactory.getCurrentSession().update(supplier);
			return true;
		} catch (HibernateException e) {
		e.printStackTrace();
			return false;
		}

	}

	public Supplier get(String id) {
		return sessionFactory.getCurrentSession().get(Supplier.class,id);

	}

	public boolean delete(String id) {
		try {
			supplier = get(id);
			if (supplier == null) {
				return false;
			}

			sessionFactory.getCurrentSession().delete(supplier);

			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}

	}

	@SuppressWarnings("unchecked")
	public List<Supplier> list() {
	return	sessionFactory.getCurrentSession().createQuery("from Supplier").list();
	}

}
