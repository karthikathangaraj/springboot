package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
//@ResponseBody
public class controllerjpa {
	@RequestMapping("/home")
	public String home()
	{
		System.out.println("hi");
		return "home.jsp";
	}

}
