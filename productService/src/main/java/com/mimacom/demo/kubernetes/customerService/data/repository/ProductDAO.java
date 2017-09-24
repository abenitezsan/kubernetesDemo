package com.mimacom.demo.kubernetes.customerService.data.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mimacom.demo.kubernetes.customerService.data.entity.ProductEntity;

@Repository
public interface ProductDAO extends CrudRepository<ProductEntity,Long> {
	

}

