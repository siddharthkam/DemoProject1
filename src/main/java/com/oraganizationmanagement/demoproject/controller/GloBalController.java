package com.oraganizationmanagement.demoproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GloBalController {
	
	@RequestMapping("/index")
	public String getIndexPage()
	{
		System.out.println("ONE SIDDHARTH");
		return "index";
	}

}
