package com.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.test.service.TestService;

@Controller
public class TestController {

	@Autowired TestService testService;
	
	@RequestMapping("/test.do")
	public String testTransaction() throws Exception {
		
		testService.testTransaction();
		
		return "home";
	}
	
}
