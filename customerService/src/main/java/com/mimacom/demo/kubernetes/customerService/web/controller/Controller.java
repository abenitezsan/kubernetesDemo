package com.mimacom.demo.kubernetes.customerService.web.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mimacom.demo.kubernetes.customerService.data.service.UserService;
import com.mimacom.demo.kubernetes.customerService.web.dto.UserDTO;

/**
 * Created by adbe on 13/09/2017.
 */
@RestController("/")
public class Controller {


	@Autowired
	private UserService userService;

	@RequestMapping(value="/", method= RequestMethod.GET)
	public List<UserDTO> findAll(){

		List<UserDTO> users= new ArrayList();

		userService.getUserList().forEach(userEntity -> {
			UserDTO userDTO=new UserDTO();
			BeanUtils.copyProperties(userEntity,userDTO);
			users.add(userDTO);
		});

		return  users;
	}


}
