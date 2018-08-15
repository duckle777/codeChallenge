package com.aileen.spring.heb.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.data.jpa.domain.Specification;

import com.aileen.spring.heb.data.entities.Products;
import com.aileen.spring.heb.services.ProductsService;
import com.aileen.spring.heb.specifications.ProductSpecifications;

@RestController
@RequestMapping("/products")
public class ProductsController {

	@Autowired
	ProductsService productsService;
	
	@GetMapping("/list")
	public ModelAndView list() {
		ModelAndView model = new ModelAndView("product_list");
		List<Products> productList = productsService.getAllProducts();
		model.addObject("productList", productList);
		
		return model;
	}
	
	@GetMapping("/{id}")
	public List<Products> getProduct(@PathVariable("id") Long id) {
		return productsService.getProductById(id);
	}
	
	@RequestMapping("search")
	public ModelAndView showSearchPage() {
		ModelAndView model = new ModelAndView();
		model.setViewName("search");
		return model;
	}
	
	@RequestMapping(value = "searchAllProducts", method = RequestMethod.POST)
	public ModelAndView searchAllProducts(@ModelAttribute("products") Products products) {
		ModelAndView model = new ModelAndView();
		List<Products> productList = productsService.searchAll(products);
		System.out.println("productList searchAllProducts.....: " + productList);
		if(productList==null) {
			System.out.println("productList is null");
			return new ModelAndView("redirect:/noResult.jsp");
		} else {
			model.addObject("productList", productList);
			model.setViewName("searchResult");
		}
		return model;
	}
	
	@RequestMapping(value = "searchAnyProducts", method = RequestMethod.POST)
	public ModelAndView searchAnyProducts(@ModelAttribute("products") Products products) {
		ModelAndView model = new ModelAndView();
		List<Products> productList = productsService.getProductsByAll(products);
		model.addObject("productList", productList);
		model.setViewName("searchResult");
		return model;
	}
	
}
