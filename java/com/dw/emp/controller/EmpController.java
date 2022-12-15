package com.dw.emp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmpController {
	
	@GetMapping("/")
	public String callIndexPage() {
		return "index";
	}

	@GetMapping("/emp")
	public String callHomePage() {
		return "emp";
	}
}
