package com.guru.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EurekaClientControllerTest {

	@RequestMapping("/info")
	public String echo() {
		return "EUREKA CLIENT"; 
	}
}
