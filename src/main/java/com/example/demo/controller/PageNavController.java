package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

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
