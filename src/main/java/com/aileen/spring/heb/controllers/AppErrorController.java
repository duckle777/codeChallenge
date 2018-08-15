package com.aileen.spring.heb.controllers;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;

public class AppErrorController implements ErrorController{

	/**
	 * Set error page to error.jsp.
	 * @return String
	 */
	@RequestMapping("/error")
	public String handleError() {
		return "error";
	}
	
	/**
	 * Update error path.
	 * @return String
	 */
	@Override
	public String getErrorPath() {
		return "/error";
	}

}
