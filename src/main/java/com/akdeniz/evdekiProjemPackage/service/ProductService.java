package com.akdeniz.evdekiProjemPackage.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.akdeniz.evdekiProjemPackage.model.Product;
import com.akdeniz.evdekiProjemPackage.repository.ProductRepository;

@Service
public class ProductService {	
	
	//servisi repo ya bağlıyoruz
	ProductRepository productRepository;
	
	//Fields oluşturulur.
	public ProductService(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}

	public List<Product> getAllProducts() {
		return productRepository.findAll();
	}


	
}