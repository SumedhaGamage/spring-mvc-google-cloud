package com.learning.spring.mvc.controlers;

import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.learning.spring.mvc.dao.Offer;
import com.learning.spring.mvc.service.OffersService;

@Controller
public class OffersControler {
	@Autowired
	private OffersService offersService;
	public void setOffersService(OffersService offersService) {
		this.offersService = offersService;
	}
	@RequestMapping("/offers")
	public ModelAndView viewOffers(){
		
		List<Offer> offers =offersService.getCurrent();		
		
		ModelAndView  mv = new ModelAndView("offers");
		Map<String,Object> model = mv.getModel();
		model.put("name", "Sumedha");
		model.put("offers", offers);
		return mv;
	}
	
	@RequestMapping("/createoffers")
	public String createOffer(){
		return "createoffers";
	}
	
	@RequestMapping(value="/offercreated" ,method=RequestMethod.POST)
	public String offerCreated(Model model,@Valid Offer offer , BindingResult result){
		
		if(result.hasErrors()){
			System.out.println("Form did not validate");
			List <ObjectError> errors = result.getAllErrors();
			
			for(ObjectError error : errors){
				System.out.println(error);
			}
		} else {
			System.out.println("From validated");
		}
		System.out.println(offer);
		return "offercreated";
	}

}
