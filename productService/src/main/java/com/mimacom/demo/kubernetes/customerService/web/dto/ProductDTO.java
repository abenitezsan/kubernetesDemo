package com.mimacom.demo.kubernetes.customerService.web.dto;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class ProductDTO  {

	private long  id;
	private String productName;
	private int stock;
	private Date createdAt;
	private Date modifiedtAt;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getModifiedtAt() {
		return modifiedtAt;
	}

	public void setModifiedtAt(Date modifiedtAt) {
		this.modifiedtAt = modifiedtAt;
	}
}
