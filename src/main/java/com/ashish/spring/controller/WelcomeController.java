package com.ashish.spring.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {

	@RequestMapping(value="/home", method = RequestMethod.GET)
	ModelAndView handleRequestHome(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		ModelAndView model = new ModelAndView("home");
		return model;
	}

	@RequestMapping(value="/", method = RequestMethod.GET)
	ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		ModelAndView model = new ModelAndView("index");
		return model;
	}
}
