package com.example.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.bike;
import com.example.demo.services.bikeservice;

@RestController
@RequestMapping("/bike")
public class bikecontroller {
	bikeservice bkservice;
	
	public bikecontroller(bikeservice bkservice) {
		super();
		this.bkservice = bkservice;
	}

	@PostMapping
	public String createbike(@RequestBody bike b)
	{
		String msg=bkservice.createbike(b);
		return msg;
	}
	

}
