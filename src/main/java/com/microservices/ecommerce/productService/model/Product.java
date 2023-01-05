package com.microservices.ecommerce.productService.model;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //@NotNull(message = "Product name is required.")
    @Basic(optional = false)
    private String name;
    
    private Double price;
    
    public Product() {
    	//Default Constructor
    }

    public Product(Long id, String name, Double price) {
    	super();
    	
    	this.id = id;
    	this.name = name;
    	this.price = price;
    }
    
    public Product(String name, Double price) {
    	super();
    	
    	this.name = name;
    	this.price = price;
    }
    
    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

}
