package com.mimacom.demo.kubernetes.customerService.web.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mimacom.demo.kubernetes.customerService.data.service.ProductService;
import com.mimacom.demo.kubernetes.customerService.web.dto.ProductDTO;

/**
 * Created by adbe on 13/09/2017.
 */
@RestController("/")
public class Controller {


	@Autowired
	private ProductService productService;

	@RequestMapping(value="/", method= RequestMethod.GET)
	public List<ProductDTO> findAll(){

		List<ProductDTO> products= new ArrayList();

		productService.getUserList().forEach(productEntity -> {
			ProductDTO productDTO=new ProductDTO();
			BeanUtils.copyProperties(productEntity,productDTO);
			products.add(productDTO);
		});

		return  products;
	}


}
