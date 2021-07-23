package com.axis.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/axis")
public class axisController {
	@GetMapping("/test")
	public String axistest() {
		return "welcome to axis bank";
	}
	
}
