package com.example.demo.controller;


import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;




@Controller
public class Controller1 {
	@RequestMapping("hi")
	public ModelAndView demo( @RequestParam("name") String myname,HttpSession sec)
	{
		/*HttpSession ses=req.getSession();
	   // String name=req.getParameter("name");
	    System.out.println("hi "+myname);
	    sec.setAttribute("name", myname);
		return "home";*/
		
		
		
		
		
		ModelAndView mv=new ModelAndView();
		mv.addObject("name",myname);
		mv.setViewName("home");
		return mv;
		
		
		
	}

}
