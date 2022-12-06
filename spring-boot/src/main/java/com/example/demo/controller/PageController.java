package com.example.demo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

//Contrller는 페이지 주소를 작성할 때 사용하는 어노테이션
@Controller
public class PageController {

	@GetMapping("/")
	public String callIndexPage() {
		return "index";
	}
	
	//사용자(클라이언트)가 /home 주소를 입력하면
	// home이름을 가진 html을 return 한다는 걸 의미.
	@GetMapping("/emp")
	public String callHomePage() {
		return "emp";
	}
	
	@GetMapping("/movie")
	public String callMoviePage() {
		return "movie";
	}
	


	@GetMapping("/login2")
	public String callLogin2Page() {
		return "login2";
	}
	@GetMapping("/dept")
	public String calldeptPage() {
		return "dept";
	}
	
	@GetMapping("/login")
	public String callLoginPage() {
		return "login";
	}
	@GetMapping("/users")
	public String callUsersPage(HttpServletRequest req, ModelMap map) {
		HttpSession session = req.getSession();
		String name = (String) session.getAttribute("name");
		System.out.println("name"+name);
		map.addAllAttributes("name",name);
		return "users";
	}
	
	


}