package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageNavController {
	@GetMapping("/home")
	public String homePage(Model model) {
		return "Home";
	}

	@GetMapping("/about")
	public String aboutPage(Model model) {
		return "About";
	}
}
