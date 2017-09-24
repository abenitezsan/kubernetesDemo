package com.mimacom.demo.kubernetes.customerService.data.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity(name = "product")
public class ProductEntity {
	

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(nullable = false, name = "id")
	private long  id;
	

	@Column(nullable = false, name = "productName")
	private String productName;


	@Column(nullable = false, name = "stock")
	private int stock;


	@Column(nullable = false, name = "createdat")
	private Date createdAt;

	@Column(nullable = false, name = "modifiedtat")
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
