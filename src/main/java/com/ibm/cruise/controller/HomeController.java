package com.ibm.cruise.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("rest")
public class HomeController {
	
	@RequestMapping("/home")
	public @ResponseBody String home() {
		return "Hello Jenkins!";
	}
	
}
