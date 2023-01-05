package com.microservices.ecommerce.productService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.microservices.ecommerce.productService.service.ProductServiceImpl;


@SpringBootApplication
public class ProductServiceApplication {
	
	@Bean
	public ProductServiceImpl productServiceImpl() {
		return new ProductServiceImpl();
	}
	public static void main(String[] args) {
		SpringApplication.run(ProductServiceApplication.class, args);
	}

}
