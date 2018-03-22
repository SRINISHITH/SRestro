package com.niit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.niit.backend.dao.ProductDAO;
import com.niit.backend.domain.Product;

public class ProductController {
	@Autowired
	private ProductDAO productDAO;
	
	@Autowired
	private Product product;
	
	@GetMapping("/product/get/{id}")
	public ModelAndView getProduct(@RequestParam("id") String id)
	{
		product = productDAO.get(id);
		
		ModelAndView mv= new ModelAndView("home");
		mv.addObject("product",product);
		return mv;
	}
}
