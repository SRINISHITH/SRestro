package com.niit.backend.dao;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.niit.backend.domain.Supplier;
@Component
@Repository
public interface SupplierDAO {

	public boolean save(Supplier supplier);
	
	public boolean update(Supplier supplier);
	
	public   Supplier     get(String id);
	
	public   boolean    delete(String id);
	
	public List<Supplier>   list();
	
}
