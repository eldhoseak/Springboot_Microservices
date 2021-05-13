package com.eureka.consumer;

import java.util.ArrayList;
import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient( name ="producer-service",  fallback = ConsumerService.ConsumerServiceFallback.class)
public interface ConsumerService {

	@RequestMapping(value = "/saveProduct", method = RequestMethod.POST)
    void saveProduct(@RequestBody Product product);
	
	@RequestMapping(value = "/getAllProducts", method = RequestMethod.GET)
	public  List<Product> getAllProducts() ;

	 @Component
	    public static class ConsumerServiceFallback implements ConsumerService {
	 
	        @Override
	       public void saveProduct(@RequestBody Product product) {
	        	System.out.println("Save Product in fall back");
	        	
	        }
	        public  List<Product> getAllProducts() {
	        	System.out.println("Get products in fall back");
	        	return new ArrayList<Product>();
	        }
	    }
}
