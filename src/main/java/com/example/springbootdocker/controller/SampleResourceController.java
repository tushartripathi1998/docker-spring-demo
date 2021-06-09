package com.example.springbootdocker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleResourceController {

	@GetMapping("/")
	public String hello() {
		return "Hello World";
	}
	
}
