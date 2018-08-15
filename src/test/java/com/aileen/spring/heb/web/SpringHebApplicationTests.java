package com.aileen.spring.heb.web;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import com.aileen.spring.heb.data.entities.Products;
import com.aileen.spring.heb.data.repositories.ProductsRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringHebApplicationTests {

	@Autowired
	ApplicationContext context;
	
	@Test
	public void getProducts() {
		ProductsRepository prodRepo = context.getBean(ProductsRepository.class);
		//Products products = new Products();
		
		Iterable <Products> products = prodRepo.findAll();  
		System.out.println(products);
		
	}

}
