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

	@GetMapping("/home/product")
	public String productPage(Model model) {
		return "Product";
	}

	@GetMapping("/about")
	public String aboutPage(Model model) {
		return "About";
	}

	@GetMapping("/forCustomer")
	public String forCustomerPage(Model model) {
		return "ForCustomer";
	}

	@GetMapping("/contactUs")
	public String contactUsPage(Model model) {
		return "ContactUs";
	}

	@GetMapping("/contactUsResponse")
	public String contactUsResponsePage(Model model) {
		return "ContactUsResponse";
	}

	// Check for header & footer component cause idk how to open jsp
	@GetMapping("/custHeader")
	public String headerBar(Model model) {
		return "CustHeader";
	}

	@GetMapping("/custFooter")
	public String footerBar(Model model) {
		return "CustFooter";
	}

	@GetMapping("/prodDetails")
	public String productDetails(Model model) {
		return "ProductDetails";
	}

	@GetMapping("/orderreq1")
	public String orderReq1(Model model) {
		return "OrderRequest1";
	}

	@GetMapping("/orderreq2")
	public String orderReq2(Model model) {
		return "OrderRequest2";
	}

	@GetMapping("/orderreq3")
	public String orderReq3(Model model) {
		return "OrderRequest3";
	}
}
