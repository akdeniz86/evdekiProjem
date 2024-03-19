package com.akdeniz.evdekiProjemPackage.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.akdeniz.evdekiProjemPackage.model.Product;
import com.akdeniz.evdekiProjemPackage.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {	
	
	//controller - direk servise bağlanıyoruz
	private final ProductService productService;
	
	//Fields oluşturulur.
	public ProductController(ProductService productService) {
		this.productService = productService;
	}
	
	@GetMapping("/all")
	public List<Product> getAllProducts(){
		System.out.println();
		return productService.getAllProducts();		
	}
	
}
 