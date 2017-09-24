package com.mimacom.demo.kubernetes.customerService.data.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity(name = "customer")
public class UserEntity{
	

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(nullable = false, name = "userId")
	private long  userId;
	

	@Column(nullable = false, name = "username")
	private String username;
	

	@Column(nullable = false, name = "password")
	private String password;
	

	@Column(nullable = false, name = "email")
	private String email;

	@Column(nullable = false, name = "fullName")
	private String fullname;

	@Column(nullable = false, name = "createdat")
	private Date createdAt;

	@Column(nullable = false, name = "modifiedtat")
	private Date modifiedtAt;

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
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
