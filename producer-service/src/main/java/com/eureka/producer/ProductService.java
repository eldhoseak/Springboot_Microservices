package com.eureka.producer;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
	@Autowired
	ProductRepository productRepository;

	@Transactional
	public List<Product> getAllProducts() {
		return (List<Product>) productRepository.findAll();
	}

	@Transactional
	public Product findByName(String name) {	

		return productRepository.findByName(name);
	}
	
	@Transactional
	public void saveProduct(Product product) {	

		 productRepository.save(product);
	}
}
