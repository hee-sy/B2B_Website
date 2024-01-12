package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.entity.Product;
import com.example.demo.service.OrderService;
import com.example.demo.service.ProductService;

@Controller
public class AdminController {
	private ProductService productService;
	private OrderService orderService;
	
	public AdminController (ProductService productService) {
		super();
		this.productService = productService;
	}
	
	public AdminController (OrderService orderService) {
		super();
		this.orderService = orderService;
	}
	
	@GetMapping("/admin/manageproduct")
	public String adminProductManagement(Model model) {
		model.addAttribute("products", productService.getAllProducts());
		return "Admin-ManageProducts";
	}
	
	@GetMapping("/admin/addproduct")
	public String adminAddProduct() {
		return "Admin-AddProduct";
	}
	
	@PostMapping("/admin/addproduct")
	public String adminAddProduct(@ModelAttribute("product") Product product, MultipartFile prodImage) {
		//ProductService.saveProduct(product,  prodImage);
		return "Redirect:/admin/addproduct";
	}
	
	@GetMapping("/admin/editproduct/{id}")
	public String adminEditProduct(@PathVariable Long id, Model model) {
		//model.addAttribute("product", productService.getProductById(id));
		return "Admin-EditProduct";
	}
	
	@PostMapping("/admin/editproduct/{id}")
	public String adminEditProduct(@PathVariable Long id,
			@ModelAttribute("product") Product product,
			Model model){
		//Product existingproduct = productService.getProductById(id);
//		existingproduct.setId(id);
//		existingproduct.setProdName(product.getProdName());
//		existingproduct.setProdCategory(product.getProdCategory());
//		existingproduct.setProdQuantity(product.getProdQuantity());
//		existingproduct.setProdUnitPrice(product.getProdUnitPrice());
//		existingproduct.setProdDesc(product.getProdDesc());
//		existingproduct.setImage(product.getImage());
		
		
		//productService.updateProduct(existingproduct);
		return "redirect:/admin/manageproduct";
	}
	
	@GetMapping("/admin/manageproduct/{id}")
	public String deleteBook(@PathVariable Long id) {
		//ProductService.deleteProductById(id);
		return "redirect:/home";
	}
	
	@GetMapping("/admin/ordermanage")
	public String adminOrderManagement(Model model) {
		model.addAttribute("orders", orderService.getAllOrders());
		return "Admin-OrderManagement";
	}
	
	@GetMapping("/admin/sidebar")
	public String adminSideBar() {
		return "Admin-SideBar";
	}
}
