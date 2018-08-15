package com.aileen.spring.heb.services;

import java.util.List;

import com.aileen.spring.heb.data.entities.Products;

public interface ProductsService {
	public List<Products> getAllProducts();
	public List<Products> getProductById(long id);
	public List<Products> getProductsByAll(Products products);
	public List<Products> searchAll(Products products);
}
