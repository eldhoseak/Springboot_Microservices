package com.eureka.consumer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

	@Autowired  
	protected ConsumerService consumerService; 

	@RequestMapping(value = "/saveProduct", method = RequestMethod.POST)
    public void saveProduct(@RequestBody Product product){
    	 consumerService.saveProduct(product);
    }
	
	@RequestMapping(value = "/getAllProducts", method = RequestMethod.GET)
	public  List<Product> getAllProducts() {
		return consumerService.getAllProducts();
	}

	/*@RequestMapping(value = "/getProduct", method = RequestMethod.GET)
	public  Product getProduct(@PathVariable String name) {
		return consumerService.getProduct(name);
	}*/
}
