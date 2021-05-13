package com.eureka.producer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

	@Autowired
	ProductService service;

	@RequestMapping(value = "/getAllProducts", method = RequestMethod.GET)
	public  List<Product> getAllProducts() {
		return service.getAllProducts();
	}

	@RequestMapping(value = "/getProduct", method = RequestMethod.GET)
	public  Product getGreetings(@PathVariable String name) {
		return service.findByName(name);
	}
	@RequestMapping(value = "/saveProduct", method = RequestMethod.POST)
	public  void getGreetings(@RequestBody Product product) {
		service.saveProduct(product);
	}
}
