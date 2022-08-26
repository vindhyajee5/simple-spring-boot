package com.vindhya.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vindhya.model.Order;

@RestController
@RequestMapping("/api")
public class TestController {
	
	@PostMapping("/order")
	public String  orderdata(@RequestBody Order order)
	{
		
		return "Hello"+order.getOrderName();
		
	}

}
