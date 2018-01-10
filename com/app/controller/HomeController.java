package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HomeController {

@RequestMapping("/get")
	public String gate()
	{

	System.out.println("In Get");
	return "redirect:show";
	}

		@RequestMapping("/show")
			public String show(ModelMap map)
				{
					map.addAttribute("id",10);
					map.addAttribute("name","pratik");
					System.out.println("In Show");
					return "home";
				}
	
}
	
