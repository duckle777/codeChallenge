package com.aileen.spring.heb.data.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Products {
	
	@Id
	private Long id;
	private String name;
	private String description;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date lastsold;
	private String shelflife;
	private String department;
	private Double price;
	private String unit;
	private Integer xfor;
	private Double cost;

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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getLastsold() {
		return lastsold;
	}

	public void setLastsold(Date lastsold) {
		this.lastsold = lastsold;
	}

	public String getShelflife() {
		return shelflife;
	}

	public void setShelflife(String shelflife) {
		this.shelflife = shelflife;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public Integer getxFor() {
		return xfor;
	}

	public void setxFor(Integer xFor) {
		this.xfor = xFor;
	}

	public Double getCost() {
		return cost;
	}

	public void setCost(Double cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Products [id=" + id + ", name=" + name + ", description=" + description + ", lastsold=" + lastsold
				+ ", shelflife=" + shelflife + ", department=" + department + ", price=" + price + ", unit=" + unit
				+ ", xFor=" + xfor + ", cost=" + cost + "]";
	}

}
