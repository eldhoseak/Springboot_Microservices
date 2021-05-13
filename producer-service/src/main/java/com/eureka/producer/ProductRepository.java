package com.eureka.producer;

import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, String>{

	 Product findByName(String name);
}
