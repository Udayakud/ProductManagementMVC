package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Product;

public interface ProductService {
 
	public Integer saveProduct(Product p);
	public void deleteProduct(Integer prodId);
	public Product getProductById(Integer prodId);
	public List<Product> getAllProducts();
	
}
