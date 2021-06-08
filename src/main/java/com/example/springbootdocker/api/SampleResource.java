package com.example.springbootdocker.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleResource {

	@GetMapping("/")
	public String hello() {
		return "Hello World";
	}
	
}
