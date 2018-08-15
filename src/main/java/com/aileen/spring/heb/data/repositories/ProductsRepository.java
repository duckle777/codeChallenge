package com.aileen.spring.heb.data.repositories;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;

import com.aileen.spring.heb.data.entities.Products;

public interface ProductsRepository extends CrudRepository<Products,Long>, JpaSpecificationExecutor<Products> {

	List<Products> findByNameContaining(String name);
	List<Products> findByDescriptionContaining(String description);
	List<Products> findByDepartmentContaining(String department);
	List<Products> findByPrice(Double price);
	List<Products> findByPriceGreaterThanEqual(Double price);
	List<Products> findByPriceLessThanEqual(Double price);
	List<Products> findByLastsold(Date lastsold);
	List<Products> findByLastsoldAfter(Date lastsold);
	List<Products> findByLastsoldBefore(Date lastsold);
	List<Products> findByShelflifeContaining(String shelflife);
	List<Products> findByShelflifeGreaterThanEqual(String shelflife);
	List<Products> findByShelflifeLessThanEqual(String shelflife);
	List<Products> findByUnit(String unit);
	List<Products> findByXfor(String xfor);
	List<Products> findByXforGreaterThanEqual(String xfor);
	List<Products> findByXforLessThanEqual(String xfor);
	List<Products> findByCost(Double cost);
	List<Products> findByCostGreaterThanEqual(Double cost);
	List<Products> findByCostLessThanEqual(Double cost);
	
}
