package com.myhome.chartTest.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping(value = "/main") 
public class MainController {
	// import org.slf4j.Logger;
	// import org.slf4j.LoggerFactory;
	private static final Logger Logger = LoggerFactory.getLogger(MainController.class);

	
	//메인페이지
	@RequestMapping(value = "/main", method = RequestMethod.GET)
	public ModelAndView main(ModelAndView mv) {
		mv.setViewName("chart1");
		return mv;
	}
	
}