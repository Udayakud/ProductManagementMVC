package com.example.demo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ProductRepository;
import com.example.demo.model.Product;
import com.example.demo.service.ProductService;

@Service
public  class ProductServiceImpl implements ProductService{
	
	@Autowired
	private ProductRepository repo;


	@Override
	public Integer saveProduct(Product p) {
//save or update -> same object with PK
		p = repo.save(p);
		Integer prodId = p.getProdId();
		return prodId;
	}

	@Override
	public void deleteProduct(Integer prodId) {
		repo.deleteById(prodId);
	}

	@Override
	public Product getProductById(Integer prodId) {
		Optional<Product> p = repo.findById(prodId);
		if (p.isPresent()) {
			return p.get();
		} else {
			return new Product();
		}
	}

	@Override
	public List<Product> getAllProducts() {
		List<Product> prods = repo.findAll();
		return prods;
	}
	
	
	

}
