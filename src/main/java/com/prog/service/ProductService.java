package com.prog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.prog.model.Product;
import com.prog.repo.ProductRepo;

@Service
public class ProductService {
	@Autowired
	private ProductRepo productRepo;

	public List<Product> getAllProducts() {
		
		return productRepo.findAll();
	}

	public Product getProductById(int id) {
		
		return productRepo.findById(id).orElse(null);
	}
	
	

}
