package com.aileen.spring.heb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {

	/**
	 * Retrieve the index page even without implicit call.
	 * @return String
	 */
	@RequestMapping(value="/",method = RequestMethod.GET)
	public String indexHome() {
		return "index";
	}
	
}
