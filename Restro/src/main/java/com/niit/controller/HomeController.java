package com.niit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.niit.backend.dao.CategoryDAO;
import com.niit.backend.domain.Category;

@Controller
public class HomeController {
	
	@Autowired
	private CategoryDAO CategoryDAO;
	
	@Autowired
	private Category Category;
	
	@GetMapping("/")
	public ModelAndView home()
	{
		ModelAndView mv=new ModelAndView("home");
		
		List<Category> categories = CategoryDAO.list();
		mv.addObject("Category",categories);
		return mv;
	}
	
	@GetMapping("/login")
	public ModelAndView login()
	{
		ModelAndView mv=new ModelAndView("login");
		mv.addObject("isuserclickedlogin", true);
		return mv;
		
	}
	@GetMapping("/registration")
	public ModelAndView registration()
	{
		ModelAndView mv=new ModelAndView("registration");
		mv.addObject("isuserclickedregistration", true);
		return mv;
	}

	public Category getCategory() {
		return Category;
	}

	public void setCategory(Category category) {
		this.Category = category;
	}

}
