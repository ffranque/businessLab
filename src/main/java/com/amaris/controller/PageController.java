package com.amaris.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
	
	@RequestMapping(value="/index")
	public String index() {
		return "redirect:index.jsp";
	}
	
	@RequestMapping(value="/goal")
	public String goal() {
		return "addGoal";
	}
	
	@RequestMapping(value="/exercise")
	public String exercise() {
		return "addMinutes";
	}
	
}
