package com.niit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AdminController 
{
 @GetMapping("/manageadmincategory")
  public ModelAndView adminclickedcategory()
 {
	 ModelAndView mv= new ModelAndView("home");
	 mv.addObject("isAdminClickedManageCategory",true);
	 return mv;
 }
 @GetMapping("/manageadminsupplier")
 public ModelAndView adminclickedsupplier()
{
	 ModelAndView mv= new ModelAndView("home");
	 mv.addObject("isAdminClickedManagesupplier",true);
	 return mv;
}
 @GetMapping("/manageadminproduct")
 public ModelAndView adminclickedproduct()
{
	 ModelAndView mv= new ModelAndView("home");
	 mv.addObject("isAdminClickedManageproduct",true);
	 return mv;
}
 
}
