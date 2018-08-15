package com.aileen.spring.heb.services;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.apache.commons.lang3.StringUtils;


import com.aileen.spring.heb.data.entities.Products;
import com.aileen.spring.heb.data.repositories.ProductsRepository;
import com.aileen.spring.heb.specifications.ProductSpecifications;

@Service
@Transactional
public class ProductsServiceImpl implements ProductsService {

	@Autowired
	ProductsRepository productsRepo;
	
	@Override
	public List<Products> getAllProducts() {
		return (List<Products>) productsRepo.findAll();
	}

	@Override
	public List<Products> getProductById(long id) {
		return (List<Products>) productsRepo.findById(id).orElse(null);
	}

	@Override
	public List<Products> searchAll(Products prodSearch) {
		List<Products> resultList = new ArrayList<>();
		
		return resultList=productsRepo.findAll(
				Specification.where( //(prodSearch.getId() == null ? null : ProductSpecifications.withId(prodSearch.getId()))
					//.and
					((prodSearch.getName() == null ? null : ProductSpecifications.withName(prodSearch.getName()))
					.and(prodSearch.getDescription() == null ? null : ProductSpecifications.withDescription(prodSearch.getDescription()))
					.and(prodSearch.getLastsold() == null ? null : ProductSpecifications.withLastSold(prodSearch.getLastsold()))
					.and(prodSearch.getShelflife() == null ? null : ProductSpecifications.withShelflife(prodSearch.getShelflife()))
					.and(prodSearch.getDepartment() == null ? null : ProductSpecifications.withDepartment(prodSearch.getDepartment()))
					.and(prodSearch.getPrice() == null ? null : ProductSpecifications.withPrice(prodSearch.getPrice()))
					.and(prodSearch.getUnit() == null ? null : ProductSpecifications.withUnit(prodSearch.getUnit()))
					.and(prodSearch.getxFor() == null ? null : ProductSpecifications.withXfor(prodSearch.getxFor()))
					.and(prodSearch.getCost() == null ? null : ProductSpecifications.withCost(prodSearch.getCost())))
				))
				;
	}

	@Override
	public List<Products> getProductsByAll(Products productSearch) {
		List<Products> resultList = new ArrayList<>();
		List<Products> searchList = new ArrayList<>();
		Products result;
		
		if(productSearch.getId() != null) {
			result = productsRepo.findById(productSearch.getId()).orElse(null);
			resultList.add(result);
		}
		
		if(!checkString(productSearch.getName())) {
			searchList = productsRepo.findByNameContaining(productSearch.getName());
			for(Products prod : searchList) {
				if(!checkIsDuplicateId(prod.getId(), resultList)) 
					resultList.add(prod); 
			}
		}
		
		if(!checkString(productSearch.getDescription())) {
			searchList = productsRepo.findByDescriptionContaining(productSearch.getDescription());
			for(Products prod : searchList) {
				if(!checkIsDuplicateId(prod.getId(), resultList)) 
					resultList.add(prod); 
			}
		}
		
		if(productSearch.getLastsold() != null) {
			
		}
		
		if(!checkString(productSearch.getShelflife())) {
			searchList = productsRepo.findByShelflifeContaining(productSearch.getShelflife());
			for(Products prod : searchList) {
				if(!checkIsDuplicateId(prod.getId(), resultList)) 
					resultList.add(prod); 
			}
		}
		
		if(!checkString(productSearch.getDepartment())) {
			searchList = productsRepo.findByDepartmentContaining(productSearch.getDepartment());
			for(Products prod : searchList) {
				if(!checkIsDuplicateId(prod.getId(), resultList)) 
					resultList.add(prod); 
			}
		}
		
		if(productSearch.getPrice() != null) {
			searchList=productsRepo.findByPrice(productSearch.getPrice());
			for(Products prod : searchList) {
				if(!checkIsDuplicateId(prod.getId(), resultList)) 
					resultList.add(prod); 
			}
		}
		
		if(!checkString(productSearch.getUnit())) {
			searchList = productsRepo.findByUnit(productSearch.getUnit());
			for(Products prod : searchList) {
				if(!checkIsDuplicateId(prod.getId(), resultList)) 
					resultList.add(prod); 
			}
		}
		
		
		if(productSearch.getCost() != null) {
			searchList = productsRepo.findByCost(productSearch.getCost());
			for(Products prod : searchList) {
				if(!checkIsDuplicateId(prod.getId(), resultList)) 
					resultList.add(prod); 
			}
		}
		
		return resultList;
		//return (List<Products>) productsRepo.findByNameOrDescription(String name, String description);
	}
	
	private boolean checkString(String str) {
		
		return StringUtils.isEmpty(str) || StringUtils.isBlank(str);
	}
	
	/*
	 * Return True if duplicate, False if not duplicate
	 */
	private boolean checkIsDuplicateId(Long id, List<Products> list) {
		if(list!= null) {
			for(Products prod : list) {
				if (prod.getId()==id) return true;
			}
		}
		return false;
	}
	
}
