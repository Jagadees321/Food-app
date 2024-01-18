package com.org.foodapp.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.org.foodapp.dao.Admindao;
import com.org.foodapp.dto.Admin;

@Controller
public class AdminController {
    
	@RequestMapping("/saveadmin")
	public ModelAndView save(@ModelAttribute Admin a) {
		ModelAndView mav=new ModelAndView("Adminlogin.jsp");
		boolean res=Admindao.saveadmin(a);
		if(res) {
			mav.addObject("msg","Register succussfully" );
		}
		else {
			mav.addObject("msg","Registertion not succussfully" );
		}
		return mav;
		
	}
	
	@RequestMapping("/findadmin")
	public ModelAndView  validate(HttpServletRequest req) {
		String email=req.getParameter("email");
		String password=req.getParameter("passwords");
		Admin admin=Admindao.findbyEmailAndPassword(email, password);
		
		if(admin!=null) {
			ModelAndView mav =new ModelAndView("adminoptions.jsp");
			return mav;
			
			
		}
		else {
			ModelAndView mav =new ModelAndView("Adminlogin.jsp");
			mav.addObject("msg","invalid");
			return mav;
		}
		
	}
}
