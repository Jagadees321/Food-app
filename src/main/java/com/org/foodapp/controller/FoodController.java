package com.org.foodapp.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.org.foodapp.dao.Fooditemdao;
import com.org.foodapp.dao.Userdao;
import com.org.foodapp.dto.FoodItem;
import com.org.foodapp.dto.User;



@Controller
public class FoodController {
	static Integer user1;
	@RequestMapping("/saveuser")
	public static ModelAndView save(@ModelAttribute User u) {
		ModelAndView mav=new ModelAndView("login.jsp");
		System.out.println(u);
		boolean res=Userdao.saveuser(u);
		if(res) {
			mav.addObject("msg","Register succussfully" );
		}
		else {
			mav.addObject("msg","Registertion not succussfully" );
		}
		return mav;
	}
	
	@RequestMapping("/find")
	public static ModelAndView validate(HttpServletRequest req,Model model) {
		String email=req.getParameter("email");
		String password=req.getParameter("passwords");
		
		User user=Userdao.findbyEmailAndPassword(email, password);
		
		if(user!=null) {
			ModelAndView mav=new ModelAndView("loginoptions.jsp");
			mav.addObject("msg1", user);
			user1=user.getId();
			return mav;
		}
		else {
			ModelAndView mav=new ModelAndView("login.jsp");
			mav.addObject("msg", "invalid");
			
			return mav;
		}
		
	}
	@RequestMapping("/components")
	public static String m1(Model model) {
		//ModelAndView mav=new ModelAndView("loginoptions.jsp");
		List<FoodItem> foodItems=Fooditemdao.findall();
		model.addAttribute("foodItems", foodItems);
		model.addAttribute("msg1", user1);
		return "loginoptions.jsp" ;
	}
	@RequestMapping("/veg")
	public static String veg(Model model) {
		List<FoodItem> foodItems=Fooditemdao.findByveg();
        model.addAttribute("foodItems", foodItems);
		
		return "loginoptions.jsp" ;
	}
	@RequestMapping("/nonveg")
	public static String nonveg(Model model) {
		List<FoodItem> foodItems=Fooditemdao.findBynonveg();
        model.addAttribute("foodItems", foodItems);
		
		return "loginoptions.jsp" ;
	}
	@RequestMapping("/curry")
	public static String currys(Model model) {
		List<FoodItem> foodItems=Fooditemdao.findBycurry();
        model.addAttribute("foodItems", foodItems);
		
		return "loginoptions.jsp" ;
	}
	

}
