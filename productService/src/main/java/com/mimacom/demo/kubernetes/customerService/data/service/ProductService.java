package com.mimacom.demo.kubernetes.customerService.data.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mimacom.demo.kubernetes.customerService.data.entity.ProductEntity;
import com.mimacom.demo.kubernetes.customerService.data.repository.ProductDAO;

/**
 * Created by adbe on 13/09/2017.
 */
@Service
public class ProductService {

	@Autowired ProductDAO productDAO;

	public Iterable<ProductEntity> getUserList(){

			return  productDAO.findAll();
	}
}
