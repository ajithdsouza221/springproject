package com.ihub.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

	@GetMapping("/hi")
	public String create() {
		return "Hello world";
	}
}
