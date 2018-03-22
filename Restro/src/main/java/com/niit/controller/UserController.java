package com.niit.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.niit.backend.dao.UserDAO;
import com.niit.backend.domain.User;


@Controller
public class UserController {
	@Autowired
	private UserDAO userDAO;
	@Autowired
	private User user;
	@Autowired
	HttpSession httpsession;
		@PostMapping("validate")
		public ModelAndView validate(@RequestParam("uname") String username, @RequestParam("psw") String password) {
			ModelAndView mv = new ModelAndView("home");
			user=userDAO.validate(username, password);
			if (user==null) {
				mv.addObject("ErrorMessage", "invalid credentials...please try again.");
			} else 
		{			httpsession.setAttribute("welcomemessage","welcome"+user.getName());
				//mv.addObject("WelcmeMessage","Welcome"+user.getName());
			if(user.getRole()=='A')
			{
				mv.addObject("is Admin",true);
			}
		}
			return mv;
		}
}
