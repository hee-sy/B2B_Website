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
	
	
	// Check for header & footer component cause idk how to open jsp
	@GetMapping("/custHeader")
	public String headerBar(Model model) {
		return "CustHeader";
	}
	
	@GetMapping("/custFooter")
	public String footerBar(Model model) {
		return "CustFooter";
	}
	
	@GetMapping("/admin/manageproduct")
	public String adminProductManagement() {
		return "Admin-ManageProducts";
	}
	
	@GetMapping("/admin/addproduct")
	public String adminAddProduct() {
		return "Admin-AddProduct";
	}
	@GetMapping("/admin/editproduct")
	public String adminEditProduct() {
		return "Admin-EditProduct";
	}
	@GetMapping("/admin/ordermanage")
	public String adminOrderManagement() {
		return "Admin-OrderManagement";
	}
	
	@GetMapping("/admin/sidebar")
	public String adminSideBar() {
		return "Admin-SideBar";
	}
}
