package com.learning.spring.mvc.controlers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller("homeControler")
public class HomeControler {

	@RequestMapping("/")
	public ModelAndView setHome(@ModelAttribute("country") Country country1) {
		ModelAndView mv = new ModelAndView("home");
		Map<String,String> country = new HashMap<String,String>();
		country.put("US", "United Stated");
		country.put("CHINA", "China");
		country.put("SG", "Singapore");
		country.put("MY", "Malaysia");
		mv.addObject("countryList", country);
		return mv;
	}
	
	@RequestMapping("/test")
	public ModelAndView setHome1(@ModelAttribute("country") Country country1) {
		ModelAndView mv = new ModelAndView("home");
		return mv;
	}
	

}
