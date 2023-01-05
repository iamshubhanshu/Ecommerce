package com.microservices.ecommerce.productService.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservices.ecommerce.productService.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
	public Product findProductById(long productId);

}
