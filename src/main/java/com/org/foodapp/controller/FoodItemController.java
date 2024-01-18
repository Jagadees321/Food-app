package com.org.foodapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.org.foodapp.dao.Fooditemdao;
import com.org.foodapp.dto.FoodItem;

@Controller
public class FoodItemController {
    
	@RequestMapping("/saveitem")
	public static ModelAndView savefood(@ModelAttribute FoodItem f) {
		
		boolean res=Fooditemdao.savefood(f);
		if(res) {
			ModelAndView mav=new ModelAndView("FoodItemHome.jsp");
			mav.addObject("msg", "Item added successfully");
			return mav;
		}else {
			ModelAndView mav=new ModelAndView("AddFoodItems.jsp");
			mav.addObject("msg", "Item not added");
			return mav;
		}
		
	}
	@RequestMapping("/add")
	public static String  add() {
		
		return "loginoptions.jsp";
	}
}
