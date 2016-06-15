package com.learning.spring.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learning.spring.mvc.dao.Offer;
import com.learning.spring.mvc.dao.OffersDAO;

@Service("offerService")
public class OffersService {
	@Autowired
	private OffersDAO offersDao;
    
	public void setOffersDao(OffersDAO offersDao) {
		this.offersDao = offersDao;
	}
	
	public List<Offer> getCurrent(){
		return offersDao.getOffers();
		
	}
	
	

}
