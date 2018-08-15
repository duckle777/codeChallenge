package com.aileen.spring.heb.specifications;

import java.util.Date;

import org.springframework.data.jpa.domain.Specification;

import com.aileen.spring.heb.data.entities.Products;

public class ProductSpecifications {

	public static Specification<Products> withId(Long id) {
		return (root, query, builder) -> builder.equal(root.get("id"), id);
	}

	public static Specification<Products> withName(String name) {
		return (root, query, builder) -> builder.like(root.get("name"), "%" + name + "%");
	}

	public static Specification<Products> withDescription(String description) {
		return (root, query, builder) -> builder.like(root.get("description"), "%" + description + "%");
	}

	public static Specification<Products> withLastSold(Date lastsold) {
		return (root, query, builder) -> builder.equal(root.get("lastsold"), lastsold);
	}

	public static Specification<Products> withShelflife(String shelflife) {
		return (root, query, builder) -> builder.like(root.get("shelflife"), "%" + shelflife + "%");
	}

	public static Specification<Products> withDepartment(String department) {
		return (root, query, builder) -> builder.like(root.get("department"), "%" + department + "%");
	}

	public static Specification<Products> withPrice(Double price) {
		return (root, query, builder) -> builder.equal(root.get("price"), price);
	}

	public static Specification<Products> withUnit(String unit) {
		return (root, query, builder) -> builder.like(root.get("unit"), "%" + unit + "%");
	}

	public static Specification<Products> withXfor(Integer xfor) {
		return (root, query, builder) -> builder.like(root.get("xfor"), "%" + xfor + "%");
	}

	public static Specification<Products> withCost(Double cost) {
		return (root, query, builder) -> builder.equal(root.get("cost"), cost);
	}

}
