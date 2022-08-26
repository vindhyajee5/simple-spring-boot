package com.vindhya.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestController {
	
	@PostMapping("/order/{orderName}")
	public String  orderdata(@PathVariable String orderName)
	{
		return "data Entered"+orderName;
		
	}

}
